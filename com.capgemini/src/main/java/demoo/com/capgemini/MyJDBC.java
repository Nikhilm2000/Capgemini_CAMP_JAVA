package demoo.com.capgemini;

import java.sql.*;

public class MyJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?characterEncoding=utf8",
					"root", "root");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(
					"select e.id,e.first_name,d.dept_name,d.dept_location,d.dept_id from employee e ,department d where d.dept_id=e.dept_id and e.dept_name='cse' ");
			while (rs.next()) {
				System.out.println("id :" + rs.getInt(1) + " " + "   fname :" + rs.getString(2) + " " + "  dept_name:"
						+ rs.getString(3) + "   Dept :" + rs.getString(4) + "   Department ID :" + rs.getInt(5));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
