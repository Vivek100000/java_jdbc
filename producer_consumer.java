import java.util.Scanner;
class Mall extends Thread
{ 
	int arr[] = new int[10];
	Scanner sc = new Scanner(System.in);
	 synchronized public void run()
	{
		if((Thread.currentThread().getName()).equalsIgnoreCase("producer"))
		{
			for(int i=0;i<10;i++)
            {
                System.out.print("enter the good "+(i+1)+" by producer: ");
                arr[i] = sc.nextInt();
            }
		}
        else if((Thread.currentThread().getName()).equalsIgnoreCase("consumer"))
        {
        	for(int i=0;i<10;i++)
            {
                System.out.println(" good "+arr[i]+" consumed by consumer");
            }
        }
	}
}


public class producer_consumer
{
	public static void main(String[] args)
	{
		Mall obj = new Mall();
		Thread t1 = new Thread(obj,"producer");
		Thread t2 = new Thread(obj,"consumer");
		  t1.start();
		  t2.start();
	}
}
