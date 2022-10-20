import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Hilo1> lista = new ArrayList<>();
		for(int i = 0 ; i < 10; i++) {
			Hilo1 hilo1 = new Hilo1(Integer.toString(i));
			lista.add(hilo1);
			hilo1.start();
		}
		lista.forEach(hilo -> {
				try {
					hilo.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		});
		System.out.println("Termine ponte la ropa");
	}

}
