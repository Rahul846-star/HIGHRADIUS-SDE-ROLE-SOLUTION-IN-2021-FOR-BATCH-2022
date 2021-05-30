mport java.util.*;

public class Main {

	static int minimumBox(int a,int b)
	{
	    int temp=b-a;
	    int count=0;
	    int y=0;
	    int flag=0;
	     while(temp>0)
	     {
	         y=a*2;
	         a=y;
	         temp=temp-y;
	         if(temp<0)
	         {
	             flag=1;
	             break;
	         }
	         count++;
	     }
	     if(flag==1)
	     {
	        temp=temp+y; 
	        count=count+temp;
	     }
	
	     return count;
	    
	 
	}
	
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
        int b=sc.nextInt();

		System.out.println(minimumBox(a,b));
	}
}