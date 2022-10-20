package MultiplesHilos;

public class Hilo extends Thread{
	String nombreProducto;
	Hilo(String nombreProducto){
		this.nombreProducto = nombreProducto;
	}
	public void run() {
		System.out.println("DAME UN MOMENTO QUE HAGO EL " + nombreProducto +", NO ME METAS PRISA MAMON");
		try {
			sleep(20000);
			System.out.println("Hola me presento soy " + nombreProducto);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
