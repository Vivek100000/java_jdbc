class Acc implements Runnable 
 {
 	int available = 1;
 	int wanted;
 	Acc(int temp)
 	{
 		wanted = temp;
 	}
 	synchronized public void run() 
 	{
 		if((Thread.currentThread().getName()).equalsIgnoreCase("passenger1"))
 		{
 			if(available > 0)
 			{
 				
 				System.out.println("berth reservation successful for:"+Thread.currentThread().getName());
 				available = available - wanted;
 			}
 			else if(available == 0)
 			{
 				System.out.println("berth reservation unsuccessful for:"+Thread.currentThread().getName());
 			}
 		}
 		else if((Thread.currentThread().getName()).equalsIgnoreCase("passenger2"))
 		{
 			if(available > 0)
 			{
 				System.out.println("berth reservation successful for:"+Thread.currentThread().getName());
                available = available - wanted;
 			}
 			else if(available == 0)
 			{
 				System.out.println("berth reservation unsuccessful for:"+Thread.currentThread().getName());
 			}
 		}
 	}
}

public class q14 
{
	public static void main(String args[]) throws InterruptedException
	{
		Acc ac1 = new Acc(1);
		Thread t1 = new Thread(ac1,"passenger1");
		Thread t2 = new Thread(ac1,"passenger2");
		t2.start();
		t1.start();
    }
}