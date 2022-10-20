package NsLookUp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/C", "nslookup");
		try {
			Process pr = pb.start();
			do {
				BufferedReader br1 = new BufferedReader(new InputStreamReader(pr.getInputStream()));
				String salida;
				while ((salida = br1.readLine()) != null) {
					System.out.println(salida);
				}
				Scanner sc = new Scanner(System.in);
				String ip = sc.nextLine();
				if (ip.equalsIgnoreCase("exit")) {
					break;
				}
				pr.getOutputStream();
				OutputStream out = pr.getOutputStream();
				out.write(ip.getBytes());
				out.close();
			} while (true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
