/**
 *
 */
package java_project_1_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connect 
{ 
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		
	    static final String DB_URL = "jdbc:mysql://localhost/quiz";

	    public static String success="database_cnt_error.Proceeding in Offline Mode";
	   
	    static final String USER = "root" ;
	    static final String PASS = "";
	   
	    public static void main(String[] args) 
	    {
	    	Connection conn = null;
	    	try 
	    	{
	    		Class.forName("com.mysql.jdbc.Driver");
	    		System.out.println("Connecting to database...");
	    		conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    		success="Connected to database successfully";//used for offline mode detection
	    		System.out.println("Connected to database successfully...");	    	
                }
	    	catch(SQLException se)
	    	{
	    		se.printStackTrace();
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    	finally 
	    	{
	    		try  
	    		{
	    			if(conn!=null)
	    			conn.close(); 
	    		}
	    		catch(SQLException se)
	    		{
	    			se.printStackTrace();
	    		}
	    	}
	    }
}
