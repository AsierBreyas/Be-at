package MultiplesHilos;

public class HiloI implements Runnable{
	String nombre;
	public HiloI(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public void run() {
		System.out.println("EU "+ nombre);
	}
}
