package db_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Java_DB_Connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");//mention the type of db to be used;
		
		Connection connection = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/selenium_users", "root", "rootDB@123");//create connection with db;
		
		Statement statement = connection.createStatement();//create a statement
		
		ResultSet result = statement.executeQuery("SELECT * FROM superheros_table");//execute query and store the result in result set;
		
		while(result.next()) {
			System.out.println("Name: "+result.getString(1)+"  Nickname: "+result.getString(2));//get the results from result set;
		}

	}

}
