import java.util.Scanner;
public class q7
{
	public static void main(String[] args)
	{
		int []arr = new int[6];
		int n=0;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("give the vote to candidate: ");
			n=sc.nextInt();
			if(n==0)
			{
				break;
			}
			switch(n)
			{
			case 1:arr[0]++;break;
			case 2:arr[1]++;break;
		    case 3:arr[2]++;break;
		    case 4:arr[3]++;break;
		    case 5:arr[4]++;break;
		    case 6:arr[5]++;break;
		    default:break;
			}
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("votes won by candidate "+(i+1)+" : "+arr[i]);
		}
		System.out.println("NOTA "+arr[5]);
		sc.close();
	}
}