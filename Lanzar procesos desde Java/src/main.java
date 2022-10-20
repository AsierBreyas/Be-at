
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		ProcessBuilder builder = new ProcessBuilder().command("python", "patata.py");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Hey, mandame algo para mandarselo a mi compitrueno piton");
			String entrada = sc.nextLine();
			Process process = builder.start();
			process.getOutputStream();
//			BufferedWriter bw1 = new BufferedWriter(new OutputStream(process.getOutputStream()));
			OutputStream out = process.getOutputStream();
			out.write(entrada.getBytes());
			out.close();
			BufferedReader br1 = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String salida;
			while ((salida = br1.readLine()) != null) {
				System.out.println(salida);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
