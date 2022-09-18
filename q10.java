import java.util.*;
  class q10
{
    public static void main(String[] args)
    {
      int noofelements=0;
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the number of elements:\t");
      noofelements=sc.nextInt();
      int []arr = new int[noofelements]; 
      System.out.print("enter the elemets of the array:\t");
      for(int i=0;i<noofelements;i++)
      {
          arr[i] = sc.nextInt();
      }
      int count=1, temp=0, ftr=0;
      for(int i=1;i<(noofelements);i++)
      {
          if(arr[i]==arr[i-1])
         {
           count = count+1;
           ftr = count;
         }
         else if(arr[i]!=arr[i-1])
         {  
             if(count>temp)
             {
                 temp = count;
             }
             count = 1;
         }
      }
      if(ftr>temp){temp=ftr;}
      if(noofelements==1){temp=1;}
      if(noofelements==0){temp=0;}
      System.out.print("the largest run is:\t"+temp);
      sc.close();
    }

}