import java.util.Scanner;
public class q4 {
	static int countoccurence(String text,String str)
	{
		int index=0,count=0;
        while(true)
        {
        	index = text.indexOf(str,index);
        	if(index!=-1)
        	{
        		count++;
        		index+=str.length();
        	}
        	else
        	{
        		break;
        	} 
        }
        return count;
	}
public static void main(String[] args)
 {
   String text = "aabcd aabc aabc baa abcaa";
   String str;
   System.out.print("enter the string whose occurence you want to find: ");
   Scanner sc = new Scanner(System.in);
   str = sc.nextLine();
   int count;
   count = countoccurence(text,str);
   System.out.println("count = "+count);
  sc.close();
 }
}
