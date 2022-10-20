package HilosConContadorCompartido;

public class Mineros implements Runnable{
	
	String nombre;
	Piedras piedra;
	int num;
	
	public Mineros(String nombre, Piedras piedra, int num){
		this.nombre = nombre;
		this.piedra = piedra;
		this.num = num + 1;
	}

	@Override
	public void run() {
		for(int i = 1; i < num; i++) {
			piedra.picar();
			System.out.println(nombre  +" ha consegido " + i + " cantidad de piedra. ¡Tenemos un total de " + piedra.cantidad + " unidades de piedra!");
//			int piedras = piedra.cantidad.getAndIncrement();
//			System.out.println(nombre  +" ha consegido " + i + " cantidad de piedra. ¡Tenemos un total de " + piedras + " unidades de piedra!");
		}
	}
}