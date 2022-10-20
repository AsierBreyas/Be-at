package ComandosDeWindowsDesdeJava;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String comando = "";
		do {
		System.out.println("Comando. Ya.");
		Scanner sc = new Scanner(System.in);
		comando = sc.nextLine();
		ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/C", comando);
		pb.redirectOutput(Redirect.INHERIT);
		pb.redirectError(Redirect.INHERIT);
		try {
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}while (comando != "exit");
	}

}
