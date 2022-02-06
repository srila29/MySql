package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
	
		Class.forName("com.mysql.cj.jdbc.Driver");// Extending the driver for the connection class
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");//Creating connection with authentication (Connection string)
		Statement stmt=conn.createStatement(); //Create statement object to execute SQL query
		ResultSet result= stmt.executeQuery("Select * from eproduct");//Execution of SQL Query
		
		while (result.next()){ //Iterating through result set to print the result
			//System.out.println(result.getInt("ID"));
			System.out.println(result.getInt("ID")+"  "+ result.getString("Name")+"  "+ result.getString("price"));		
			
		}
		conn.close();
			
	}

}
