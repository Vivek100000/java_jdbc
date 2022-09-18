import java.util.*;
class shop
{ 
	int arr[] = new int[10];
	Scanner sc = new Scanner(System.in);
	 synchronized public void formatting(String str)
	{
		if(str.equalsIgnoreCase("producer"))
		{
			for(int i=0;i<10;i++)
            {
                System.out.print("enter the good "+(i+1)+" by producer: ");
                arr[i] = sc.nextInt();
            }
		}
        else if(str.equalsIgnoreCase("consumer"))
        {
        	for(int i=0;i<10;i++)
            {
                System.out.println(" good "+arr[i]+" consumed by consumer");
            }
        }
	}
}

class consumer extends Thread
{
	shop obj;
	consumer(shop obj)
	{
		this.obj = obj;
	}

	public void run()
	{
		obj.formatting("consumer");
	}
}

class producer extends Thread
{
	shop obj;
	producer(shop obj)
	{
		this.obj = obj;
	}

	public void run()
	{
		obj.formatting("producer");
	}
}

public class q15
{
	public static void main(String[] args)
	{
		shop obj = new shop();
		consumer t1 = new consumer(obj);
		producer t2 = new producer(obj);
		  t2.start();
		  t1.start();
	}
}
