package NsLookUp;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/C", "nslookup");
		pb.inheritIO();
		try {
			Process p = pb.start();
			p.waitFor();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
