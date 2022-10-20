package TemporizarProcesos;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessBuilder pb1 = new ProcessBuilder().command("python", "patata.py");

		
		pb1.redirectOutput(Redirect.INHERIT);
		
		try {
			Process pr1 = pb1.start();
			try {
				boolean terminado = pr1.waitFor(5, TimeUnit.SECONDS);
				if(!terminado)
					pr1.destroyForcibly();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
