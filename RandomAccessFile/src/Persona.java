
public class Persona {
	public String nombre;
	public String DNI;
	public int edad;
	
	Persona(String nombre, String DNI, int edad){
		this.nombre = nombre;
		this.DNI = DNI;
		this.edad = edad;
	}
	Persona(){
		
	}
	public String datos() {
		return String.format("%1$-" + 11 + "s", nombre).substring(0,11) + " " + DNI + " " + Integer.toString(edad) + "\n";
	}
}
