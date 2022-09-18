import java.util.*;
public class q3 
{
	public static void main(String[]args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the cloth_type:-");
		String cloth_type;
		cloth_type = sc.nextLine();
		System.out.print("enter the amount:- ");
		int amt;
		amt = sc.nextInt();
		if(amt>=1 &&amt<=100 )
		{
			switch(cloth_type)
			{
			case "mill cloth": System.out.println("the amount is:"+amt);break;
		    case "handloom": System.out.println("The amount is:"+(amt-((amt*5)/100.0)));
			}
		}
		else if(amt>=101 &&amt<=200 )
		{
			switch(cloth_type)
			{
			case "mill cloth": System.out.println("the amount is:"+(amt-((amt*5)/100.0)));break;
		    case "handloom": System.out.println("The amount is:"+(amt-((amt*7.5)/100.0)));break;
			}
		}
		else if(amt>=210 &&amt<=300 )
		{
			switch(cloth_type)
			{
			case "mill cloth": System.out.println("the amount is:"+(amt-((amt*7.5)/100.0)));break;
		    case "handloom": System.out.println("The amount is:"+(amt-((amt*10)/100.0)));break;
			}
		}
		else if(amt>=300)
		{
			switch(cloth_type)
			{
			case "mill cloth": System.out.println("the amount is:"+(amt-((amt*10)/100.0)));break;
		    case "handloom": System.out.println("The amount is:"+(amt-((amt*15)/100.0)));break;
			}
		}
		sc.close();		
	}

}
