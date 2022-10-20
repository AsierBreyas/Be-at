package MultiplesHilos;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> productos = new ArrayList<>();
		for(int i = 0; i <101; i++) {
			productos.add("producto " + i);
		}
		productos.forEach(producto -> {
			HiloI patata = new HiloI(producto);
			Thread hilo = new Thread(patata);
			hilo.start();
		});
	}

}
