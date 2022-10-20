package HilosConContadorCompartido;

public class Main {

	public static void main(String[] args) {
		Piedras piedra = new Piedras();
		Thread minero = new Thread(new Mineros("Steve", piedra, 1000000));
		Constructor constuctor = new Constructor("Alex", piedra, 1000000);
		minero.start();
		constuctor.start();
		try {
			minero.join();
			constuctor.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hemos conseguido un total de " + piedra.cantidad + " unidades de piedra");
	}

}
