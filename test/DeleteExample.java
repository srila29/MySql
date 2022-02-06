package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DeleteExample
{

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			Class.forName("com.mysql.cj.jdbc.Driver");// Extending the driver for the connection class
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");//Creating connection with authentication (Connection string)
			Statement stmt=conn.createStatement(); //Create statement object to execute SQL query
			int result= stmt.executeUpdate(" Delete from eproduct where Id>6");//Execution of SQL Query
			
			while (result>0){ //Iterating through result set to print the result
				//System.out.println(result.getInt("ID"));
				System.out.println("The rows are deleted"+result+"\n The updated table is :");	
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
