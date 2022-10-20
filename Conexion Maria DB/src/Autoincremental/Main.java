package Autoincremental;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		try {
			//https://stackoverflow.com/questions/1915166/how-to-get-the-insert-id-in-jdbc
			Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/prueba", "root", "a");
			PreparedStatement statement = c.prepareStatement(, org.mariadb.jdbc.Statement.RETURN_GENERATED_KEYS);
			ResultSet r = statement.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
