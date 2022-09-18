import java.util.*;
public class q5 {
	 static void modification(String str)
	  {
	    char ch[] = str.toCharArray();
	    for(int i=0;i<str.length();i++)
	    {
	      for(int j=i+1;j<str.length();j++)
	      {
	        if(ch[i]==ch[j])
	        {
	          
	          ch[j] = '0';
	        }
	      }
	    }
	    char che[] = new char[str.length()];
	    int m,k;
	    for( m=0,k=0;k<str.length();)
	    {
	         if(ch[k]!='0')
	         {
	            che[m] = ch[k];
	            m++;
	            k++;
	         }
	         else if(ch[k]=='0')
	         {
	             k++;
	         }
	    }
	    for(int i=0;i<m;i++)
	    {
	      System.out.print(che[i]);
	    }
	  }
	  public static void main(String[] args)
	  {
	    String str;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("enter the string: ");
	    str = sc.nextLine();
	    modification(str);
	    sc.close();
	  }

}
