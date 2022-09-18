import java.sql.*;
import java.util.*;
public class DeleteRecord 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
   {
       Scanner sc = new Scanner(System.in);
	   PreparedStatement stmt = null;
	   Connection conn = null;
	   try
	   {
		   //STEP 2: Register JDBC driver
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   //STEP 3: Open a connection
		   conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/departmentinfo","root","");

		   //STEP 4: Execute a query
		   System.out.println("Creating statement...");
		   String sql = "Delete from records WHERE empcode=?";
		   stmt = conn.prepareStatement(sql);
      
		   //Bind values into the parameters.
		    System.out.println("Enter Employee Code");
		    int y = sc.nextInt();
 		    stmt.setInt(1, y); // 

     
		   // Let us update age of the record with ID = 102;
		   int rows = stmt.executeUpdate();

		   System.out.println("Rows impacted : " + rows );

		   // Let us select all the records and display them.
		   sql = "SELECT * FROM records";
		   ResultSet rs = stmt.executeQuery(sql);

		   //STEP 5: Extract data from result set
		   System.out.println("Below is the list of employee working in Deptt No.");
	       System.out.println("Employee Code\t Employee Name\t Designation   \t Department No.");
	       while(rs.next())
	       {
	           System.out.print(rs.getInt("empcode") + "       \t");
	           System.out.print(rs.getString("empname")+ "       \t");
	           System.out.print(rs.getString("designation")+ "   \t");
	           System.out.println(rs.getInt("dno"));
	        }
	       //STEP 6: Clean-up environment
		   rs.close();
		   stmt.close();
		   conn.close();
		   sc.close();
	   }catch(SQLException se)
	    {
		   //Handle errors for JDBC
		   se.printStackTrace();
	    }catch(Exception e)
	     {
	    	//Handle errors for Class.forName
	    	e.printStackTrace();
	     }
	     finally
	     {
	    	 //finally block used to close resources
	    	 try
	    	 {
	    		 if(stmt!=null)
	    			 stmt.close();
	    	 }catch(SQLException se2)
	    	   {
	    	   }// nothing we can do
	    	 try
	    	 {
	    		 if(conn!=null)
	    			 conn.close();
	    	 }catch(SQLException se)
	    	  {
	    		 se.printStackTrace();
	    	  }//end finally try
	     }//end try
	     System.out.println("Goodbye!");
   	}//end main
}//end JDBCExample