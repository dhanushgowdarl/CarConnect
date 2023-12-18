package Utilclasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBcon {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carconnect", "root", "Dhanu@9606");
		System.out.println("Established");
		Statement stmt = con.createStatement();
		PreparedStatement ps = con.prepareStatement("select * from customer");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			String id = rs.getString("CustomerID");
			String lname = rs.getString("LastName");
			String email = rs.getString("Email");
			String address = rs.getString("Address");

			String name1 = rs.getString("FirstName");
			System.out.println("ID: " + id + "\nFirstName: " + name1 + "\nLastName: " + lname + "\nEmail: " + email
					+ "\nAddress: " + address);

		}
		con.close();
	}
}
