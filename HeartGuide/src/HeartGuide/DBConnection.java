package HeartGuide;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	   public static void main(String[] args) {
		   String userQuery = "CREATE DATABASE IF NOT EXISTS heart_guide";
		   try {
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
	            Statement stmt = con.createStatement();
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            stmt.executeUpdate(userQuery);
	            System.out.println("Success!");
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	   }
}
