class Account implements Runnable 
 {
 	int balance = 1200;
 	String cus1 = "customer1";
 	String cus2 = "customer2";
 	synchronized public void run()
 	{
 		if((Thread.currentThread().getName()).equalsIgnoreCase(cus1))
 		{
 			if(balance>=500)
 			{
 				System.out.println("withrawl successful for:"+Thread.currentThread().getName());
 				balance = balance-500;
 				System.out.println("balance remaining: "+balance);
 			}
 			else 
 			{
 				System.out.println("withrawl unsuccessful for:"+Thread.currentThread().getName());
 			}
 		}
 		else
 		{
 			if(balance>=1000)
 			{
 				System.out.println("withrawl successful for:"+Thread.currentThread().getName());
                balance = balance-1000;System.out.println("balance remaining: "+balance);
 			}
 			else 
 			{
 				System.out.println("withrawl unsuccessful for:"+Thread.currentThread().getName());
 			}
 		}
 	}
}

class q13
{
	public static void main(String args[])
	{
		Account ac1 = new Account();
		Thread t1 = new Thread(ac1,"customer1");
		Thread t2 = new Thread(ac1,"customer2");
		t1.start();
		t2.start();
    }
}