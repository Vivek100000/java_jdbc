public class q9 
{
    public static void main(String[] args) 
	{
		try 
		{
		  int i=0, sum =0, temp;
		  while(i<args.length)
		  {
			temp = Integer.parseInt(args[i]);
			 sum = sum + temp;
			 i++;
		  }
		 System.out.println("the sum is:"+sum);
	    }
	      catch(NumberFormatException e)
	    {
	    	System.out.println("invalid integer input");
	    }
	}
}
