import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Scanner;
public class department extends Frame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection conn = null;
    public PreparedStatement stmt = null;
    ResultSet rs;
	Button btncl;
	Choice employee_name;
	Panel p1, p2;
	Label l1,l2,l3,l4;
	TextField txt1, txt2, txt3;
	department()throws ClassNotFoundException, SQLException
	{
		Scanner sc = new Scanner(System.in);
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/departmentinfo","root","");
	    
	    setLayout(new FlowLayout());
		setSize(400,150);
		setTitle("depart_records");
		setVisible(true);
		btncl = new Button("search");
		txt1 = new TextField(20);
		txt2 = new TextField(20);
		txt3 = new TextField(20);
		employee_name = new Choice();
		employee_name.add("Varun rawat");
		employee_name.add("Vivek negi");
		employee_name.add("Anish");
		employee_name.add("Aryan");
		employee_name.add("Deepak");
		employee_name.add("bhavesh");
		employee_name.add("mungfali");
		p1 = new Panel(new GridLayout(4,1));
		p2 = new Panel(new GridLayout(4,1));
		l1 = new Label("Name");
		l2 = new Label("dno");
		l3 = new Label("location");
		l4 = new Label("designation");
		p1.add(l1);p1.add(l2);p1.add(l3);p1.add(l4);
		p2.add(employee_name);p2.add(txt1);p2.add(txt2);p2.add(txt3);
		add(p1);
		add(p2);
		add(btncl);
		btncl.addActionListener(this);
		addWindowListener(new WindowAdapter()
				{
			   
				public void windowClosing(WindowEvent e)
				{
				    try 
				    {
						conn.close();
					} 
				    catch (SQLException e1)
				    {
						e1.printStackTrace();
					}
					System.exit(0);
				}
			
				});
		sc.close();
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		   new department();
		 
		
    }
	public void actionPerformed(ActionEvent e)
	{
		try
		{
		    
		   stmt = conn.prepareStatement("SELECT * FROM departmentrecords WHERE DeptName=?");
		   stmt.setString(1, employee_name.getSelectedItem());
		   rs = stmt.executeQuery();
		   while(rs.next())
		   {
		    txt2.setText(rs.getString("location"));
		    txt1.setText(String.valueOf(rs.getInt("dno")));
		    txt3.setText(rs.getString("designation"));
		   }
		   
		}
		catch(Exception e1)
		{
			System.out.print(e1);
		}
		finally
		{
	         System.out.println("details fetched");
		}
	}

}
