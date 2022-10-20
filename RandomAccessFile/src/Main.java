import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Godofredo", "45832150L", 17);
		Persona persona2 = new Persona("Anselmo", "37362750L", 47);
		Persona persona3 = new Persona("Asdrubal", "16873015L", 25);
		Persona persona4 = new Persona("Eusebio", "40398217G", 95);
		Persona persona5 = new Persona("Matilda", "16029150F", 52);
		Persona persona6 = new Persona("Patatatatatatatatatatatatatatatatatatatatatatatatatatatataatata", "16029150F", 52);
		ManejoFicheros fichero = new ManejoFicheros();
		try {
			fichero.insertarFinal(persona1);
			fichero.insertarFinal(persona2);
			fichero.insertarFinal(persona3);
			fichero.insertar(persona4, 1);
			fichero.insertar(persona5, 2);
			fichero.insertarFinal(persona6);
			Persona buscada = fichero.obtenerPersona("40398217G");
			System.out.println("Nombre: " + buscada.nombre + "\nDNI: " + buscada.DNI + "\nEdad: " + buscada.edad);
			fichero.eliminar("16873015L");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
