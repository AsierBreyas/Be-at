package HilosConContadorCompartido;

public class Piedras {
	Integer cantidad = 0;
	Object lock = new Object();
	public void picar() {
		synchronized (lock) {
			if(cantidad == 10) {
			}
			cantidad = cantidad + 1;
		}
	}
	public void colocar() {
		synchronized (lock) {
			cantidad = cantidad - 1;
		}
	}
//	AtomicInteger cantidad = new AtomicInteger();
//	public void picar() {
//		
//	}
}
