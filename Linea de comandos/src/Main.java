import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int resultado = 0;
		do {
			System.out.println("Meteme un numero del 0-6. Si pones un 6 se finaliza el programa");
			resultado = leerOpcion(6);
		} while (resultado < 6);
		System.out.println("Me voy a mimir bye bye ");

	}

	private static int leerOpcion(int max) {
		int numeroRecogido = max + 1;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				numeroRecogido = sc.nextInt();
				if (numeroRecogido > max) {
					System.out.printf("Error. Has puesto un numero mayor a %d prueba de nuevo con uno menor a %d \n", max,
							numeroRecogido);
				}
			} catch (Exception e) {
				System.out.println("He dicho un numero cazurro");
				sc.nextLine();
			}

		} while (numeroRecogido > max);

		return numeroRecogido;
	}
}
