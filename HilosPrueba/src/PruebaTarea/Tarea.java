package PruebaTarea;

public class Tarea {
	
	int tiempo;
	
	public Tarea(int tiempo) {
		this.tiempo = tiempo / 2;
	}
	
	public void ejecutar() {
		try {
			System.out.println("Empezando la ejecución. Tendrás un tiempo de " + tiempo * 2 + " segundos para decir tus ultimas palabras");
			Thread.sleep(tiempo * 1000);
			System.out.println("\tTe quedan " + tiempo + " milisegundos de vida *afilando el hacha*" );
			Thread.sleep(tiempo);
			System.out.println("Ejecutado en " + tiempo * 2 + " segundos");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
