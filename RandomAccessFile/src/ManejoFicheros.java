import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ManejoFicheros {
	private void modificarNombre(Persona persona) {
		persona.nombre = String.format("%1$-" + 11 + "s", persona.nombre);
	}
	public void insertar(Persona persona, int posicion) throws IOException{
		try(RandomAccessFile fichero = new RandomAccessFile("Personas.txt", "rw")) {
			posicion = 25 * posicion;
			fichero.seek(posicion);
			String ficheroAux = persona.datos();
			String linea;
			while((linea = fichero.readLine()) != null) {
				ficheroAux = ficheroAux + linea + "\n";
			}
			fichero.seek(posicion);
			fichero.writeBytes(ficheroAux);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insertarFinal(Persona persona) throws IOException {
		try(RandomAccessFile fichero = new RandomAccessFile("Personas.txt", "rw")) {
			fichero.seek(fichero.length());
			fichero.writeBytes(persona.datos());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Persona obtenerPersona(String DNI) {
		Persona buscada = new Persona();
		try(RandomAccessFile fichero = new RandomAccessFile("Personas.txt", "rw")){
			String linea;
			while((linea = fichero.readLine()) != null ){
				if(linea.substring(12,21).equalsIgnoreCase(DNI)) {
					buscada = new Persona(linea.substring(0, 11), DNI, Integer.parseInt(linea.substring(22,24)));
				}
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return buscada;
	}
	public void eliminar(String DNI) {
		try(RandomAccessFile fichero = new RandomAccessFile("Personas.txt", "rw")){
			String linea;
			String ficheroAux = "";
			while((linea = fichero.readLine()) != null ){
				if(linea.substring(12,21).equalsIgnoreCase(DNI)) {
					System.out.print("Persona de DNI "+ DNI +" erradicada de la faz de la tierra");
					ficheroAux = ficheroAux + "xxxxxxxxxxx ||||||||| **\n";
				}else {
					ficheroAux = ficheroAux + linea + "\n";					
				}
			}
			fichero.seek(0);
			fichero.writeBytes(ficheroAux);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
