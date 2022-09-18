class Odd extends Thread
{
	public void run()
	{
         for(int i=1;i<=20;i++)
         {
         	if(i%2!=0)
         	{
         		System.out.println(Thread.currentThread().getName()+":"+i);
         	}
         }
    }
}

class Even extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
         {
         	if(i%2==0)
         	{
         		System.out.println(Thread.currentThread().getName()+":"+i);
         	}
         }
	}
}

class q11
{
	public static void main(String[] args)
	{
         Odd num1 = new Odd();
         Even num2 = new Even();
         Thread t1 = new Thread(num1);
         Thread t2 = new Thread(num2);
         t1.setName("odd thread");
         t2.setName("even thread");
         t1.start();
         t2.start();
	}
}
