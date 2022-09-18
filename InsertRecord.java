import java.sql.*;
public class InsertRecord 
{
    public static void main(String a[]) throws ClassNotFoundException, SQLException
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/departmentinfo","root","");
    	String sql = "insert into records values(?,?,?,?)";
    	PreparedStatement stmt= con.prepareStatement(sql);
    	   	
    	stmt.setInt(1, 789);
    	stmt.setString(2, "bhupesh");
    	stmt.setString(3, "technical lead");
    	stmt.setInt(4, 3);
    	int x = stmt.executeUpdate();
    	System.out.println(x + " Record added in a table");
    	
    	sql = "Select * from records";
    	//Statement stmt1=con.createStatement();
    	ResultSet rs=stmt.executeQuery(sql);
    	System.out.println("Employee Code\t Employee Name\t Designation   \t Department No.");
        while(rs.next())
        {
            System.out.print(rs.getInt("empcode") + "       \t");
            System.out.print(rs.getString("empname")+ "       \t");
            System.out.print(rs.getString("designation")+ "   \t");
            System.out.println(rs.getInt("dno"));
         }

    	con.close();
    }
}