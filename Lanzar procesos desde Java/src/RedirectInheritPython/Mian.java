package RedirectInheritPython;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.ProcessBuilder.Redirect;

public class Mian {

	public static void main(String[] args) {
		ProcessBuilder pb1 = new ProcessBuilder().command("python", "patata.py");
		ProcessBuilder pb2 = new ProcessBuilder().command("python", "patata2.py");

		
		pb1.redirectInput(Redirect.INHERIT);
		pb2.redirectOutput(Redirect.INHERIT);
		
		try {
			Process pr1 = pb1.start();
			Process pr2 = pb2.start();
			pr1.getOutputStream();
			BufferedReader br1 = new BufferedReader(new InputStreamReader(pr1.getInputStream()));
			String salida;
			String aux = "";
			while ((salida = br1.readLine()) != null) {
				System.out.println(salida);
				aux=salida;
			}
			OutputStream out = pr2.getOutputStream();
			out.write(aux.getBytes());
			out.close();
			br1.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
