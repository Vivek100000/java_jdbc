import java.util.*;
class MyException extends Exception
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyException(String str)
	{
		super(str);
	}
}

public class checking_exception 
{
     public static void main(String args[])
     {
    	 try
    	 {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("enter the value of the string:\t");
    	 String str = sc.next();
    	 sc.close();
    	 if(str.equalsIgnoreCase("GEHU"))
    	 {
    		 System.out.print("valid string");
    	 }
    	 else
    	 {
    		 throw new MyException("this is a invalid string");
    	 }
    	 }
    	 catch(MyException e)
    	 {
    		 System.out.print(e.getMessage());
    	 }
    	 
     }
}
