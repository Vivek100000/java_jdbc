import java.util.*;

class Userdivisorexception extends Exception
{
       /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Userdivisorexception(String str)
       {
       	   super(str);
       }
       
}
public class q12
{
	public static void divider(int n) throws InterruptedException
	{
       try
       {
		int divisor;
		Scanner sc = new Scanner(System.in);
		divisor = sc.nextInt();
		sc.close();
		  if(divisor==0)
		    {
			     throw new Userdivisorexception("this is a invalid divisor\n");
		    }
		   else
		    {
                 for(int i=1;i<=n;i++)
		       {
                   Thread.sleep(2000);
                   System.out.println(i%divisor);
		       }
            }
         }
         catch(Userdivisorexception e)
	    {
	    	System.out.print(e.getMessage());
	    }
      
	}

	public static void main(String[] args)
	{
		try
		{
         Scanner sc = new Scanner(System.in);
         int n = 0;
         System.out.print("enter the value of n:");
         n = sc.nextInt();
        
         divider(n);
         sc.close();
        }
        catch(InterruptedException e)
        {
        	System.out.println(e);
        }
	    /*catch(Exception e)
	    {
	    	System.out.println("all handled");
	    }*/
	    System.out.println("rest of the code");
	   
	}
}
