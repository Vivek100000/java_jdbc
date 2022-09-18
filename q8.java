import java.util.*;

class Card
{
	
	 void checkcard(String str){};
}

class Visa extends Card
{
    void checkcard(String str)
    {
    	
    	if(str.charAt(0)=='4'     &&      (str.length()==13||str.length()==16))
    	{
    		System.out.println("valid Visa card");
    	}
    	else
    	{
    		System.out.println("invalid Visa card");
    	}

    }
}
class AmericanExpress extends Card
{
    void checkcard(String str)
    {
    	
    	if(str.charAt(0)=='3'    &&     (str.charAt(1)=='4'||str.charAt(1)=='7')   &&  (str.length()==15))
    	{
    		System.out.println("valid AmericanExpress card");
    	}
    	else
    	{
    		System.out.println("invalid AmericanExpress card");
    	}

    }
}

class MasterCards extends Card
{
    void checkcard(String str)
    {
    	
    	if(str.charAt(0)=='5'  &&   ('1'<=str.charAt(1)&&str.charAt(1)<='5')   &&    str.length()==16)
    	{
    		System.out.println("valid Master card");
    	}
    	else
    	{
    		System.out.println("invalid Master card");
    	}

    }
}
 
class q8
{
	public static void main(String[]args)
	{
        Card check;
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("enter the card number: ");
        str = sc.nextLine();
        check = new Visa();
        check.checkcard(str);
        check = new MasterCards();
        check.checkcard(str);
        check = new AmericanExpress();
        check.checkcard(str);
        sc.close();
	}
}