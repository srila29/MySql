package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// Extending the driver for the connection class
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");//Creating connection with authentication (Connection string)
		Statement stmt=conn.createStatement(); //Create statement object to execute SQL query
		int result= stmt.executeUpdate(" insert into eproduct(name,price,date_added) values ('cordless charger',100.00,now());");//Execution of SQL Query
		
		while (result>0){ //Iterating through result set to print the result
			//System.out.println(result.getInt("ID"));
			System.out.println("The row inserted is "+result+"\n The updated table is :");	
			break;
			
		}
		
ResultSet resultset= stmt.executeQuery("Select * from eproduct");//Execution of SQL Query
		
		while (resultset.next()){ //Iterating through result set to print the result
			//System.out.println(result.getInt("ID"));
			System.out.println(resultset.getInt("ID")+"  "+ resultset.getString("Name")+"  "+ resultset.getString("price"));		
			
		}
		conn.close();
			

	}

}
