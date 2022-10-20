package CreacionDeTablas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection c = null;
		try {
			c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/prueba", "root", "a");
			c.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("Nombre de usuario");
//		String usuario = sc.nextLine();
//		System.out.println("La contraseña de usuario");
//		String contraseña = sc.nextLine();
//		Boolean logeado = login(usuario, contraseña, c);
		eliminarDatos(c);
		meterDatos();
//		actualizarDatos(c);
//		selectDatos(c);
	}

	public static void crearBase(Connection c) {
		try {
			PreparedStatement statement = c.prepareStatement("""
					CREATE TABLE Clientes(
					Nombre VARCHAR(35) NOT NULL,
					Apellido VARCHAR(35) NOT NULL,
					DNI CHAR(9) NOT NULL,
					CP CHAR(5) NOT NULL,
					PRIMARY KEY (DNI)
					)
					""");
			statement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void meterDatos() {
		Connection c = null;
		try {
			c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/prueba", "root", "a");
			Statement statement = c.createStatement();
			statement.executeUpdate("INSERT INTO clientes VALUES('Eustaquio', 'Habichuela', '25601472R', '36914');");
			statement.executeUpdate("INSERT INTO clientes VALUES('Madao', 'Hasegawa', '77777777P', '36914');");
			statement.executeUpdate("INSERT INTO clientes VALUES('Nos', 'Pegan', '88888888P', '36914');");
			c.commit();
		} catch (SQLException e) {
			try {
				c.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public static void actualizarDatos(Connection c) {
		try {
			PreparedStatement statement = c.prepareStatement("""
					UPDATE clientes
					SET Nombre='Perro', Apellido='Estupido'
					WHERE DNI='25601472R';
												""");
			statement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void eliminarDatos(Connection c) {
		try {
			PreparedStatement statement = c.prepareStatement("""
					DELETE FROM clientes;
																	""");
			statement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void selectDatos(Connection c) {
		try {
			PreparedStatement statement = c.prepareStatement("""
					SELECT *
					FROM clientes
					""");
			ResultSet r = statement.executeQuery();
			while (r.next()) {
				System.out.println("- DNI: " + r.getString("DNI"));
				System.out.println("\n\t- Nombre: " + r.getString("Nombre"));
				System.out.println("\n\t- Apellido: " + r.getString("Apellido"));
				System.out.println("\n\t- CP: " + r.getString("CP"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Boolean login(String nombre, String contraseña, Connection c) {
		Boolean encontrado = false;
		try {
			String query = "SELECT Nombre, DNI FROM clientes WHERE Nombre = '" + contraseña + "' AND DNI ='" + nombre
					+ "'";
			PreparedStatement statement = c.prepareStatement(query);
			ResultSet r = statement.executeQuery();

			if (r.next())
				encontrado = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (encontrado)
			System.out.println("Logeado");
		else
			System.out.println("A tu puta casa");
		return encontrado;
	}
}
