package PruebaTarea;

public class Verdugo implements Runnable{
	
	Tarea tarea;
	String nombre;
	
	public Verdugo(Tarea tarea, String nombre) {
		this.tarea = tarea;
		this.nombre = nombre;
	}
	
	@Override
	public void run() {
		System.out.println("Aquí " + nombre + " voy a por mis herramientas para empezar con la ejecución");
		tarea.ejecutar();
	}
}
