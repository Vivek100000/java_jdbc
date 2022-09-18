import java.util.Scanner;
class Student
{
	int subject_1;
	int subject_2;
	int subject_3;
	int total;
	 Student(int sub1,int sub2,int sub3)
	{
		subject_1=sub1;
	    subject_2=sub2;
	    subject_3=sub3;
	}
	void sum()
	{
		total = subject_1+subject_2+subject_3;
	}
}
class q6
{
	public static void main( String[] args)
	{
		int tab1=0,tab2=0,tab3=0,tab_total=0;
	    Scanner sc = new Scanner(System.in);
		Student table[]=new Student[10];
	    for(int i=0;i<10;i++)
       {
       	   System.out.println("enter the marks of student "+(i+1)+": ");
       	   table[i] = new Student(sc.nextInt(),sc.nextInt(),sc.nextInt());
       
           table[i].sum();   
        }
       for(int i=0;i<10;i++)
       {
       	   System.out.print("total marks of student "+(i+1)+": ");
       	   System.out.println(table[i].total);
       }
       int s1=table[0].subject_1,s2 = table[0].subject_2,s3 = table[0].subject_3,t=table[0].total;
       for(int k=0;k<10;k++)
       {
       	  if(table[k].subject_1>s1)
       	  {
       	  	  s1 = table[k].subject_1;
              tab1=k+1;
       	  }
       	  if(table[k].subject_2>s2)
       	  {
       	  	  s2 = table[k].subject_2;
              tab2=k+1;
       	  }
       	  if(table[k].subject_3>s3)
       	  {
       	  	  s3 = table[k].subject_3;
              tab3=k+1;
       	  }
       	  if(table[k].total>t)
       	  {
       	  	  t = table[k].total;
              tab_total=k+1;
       	  }
       }
       System.out.println("Roll no. of student topped in subject-1:"+tab1+" marks obtained:"+s1);
       System.out.println("Roll no. of student topped in subject-2:"+tab2+" marks obtained:"+s2);
       System.out.println("Roll no. of student topped in subject-3:"+tab3+" marks obtained:"+s3);
       System.out.println("Roll no. of student topped in total:"+tab_total+" marks obtained:"+t);
       sc.close();
    }
} 