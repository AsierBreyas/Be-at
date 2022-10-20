import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Que tipo de patata te sientes hoy");
		Scanner sc = new Scanner(System.in);
		String patata = sc.nextLine();
		System.out.println("Oh, entiendo. Dime que dice " + patata);
		String contraseña = sc.nextLine();
		try {
			Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/prueba", "root", "a");
			PreparedStatement statement = c.prepareStatement("""
					SELECT nombre, password
					FROM patata
					""");
			ResultSet r = statement.executeQuery();
			Boolean encontrado = false;
			while(r.next() || encontrado) {
				if(patata.equalsIgnoreCase(r.getString(1)) && contraseña.equals(r.getString(2))) {
					encontrado = true;
				}
			}
			if(encontrado)
				System.out.println("OHHH TREMENDO, conseguiste logear");
			else
				System.out.println("Has fallado a tus seres queridos. Estas destinado al fracaso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
