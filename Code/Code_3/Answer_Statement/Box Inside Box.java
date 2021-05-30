import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Main {

	static int minimumBox(int []arr, int n)
	{
		
		Queue<Integer> q = new LinkedList<>();
	
		// sorting the array
		Arrays.sort(arr);
	
		q.add(arr[0]);
		
		for (int i = 1; i < n; i++)
		{
			int now = q.element();
			if (arr[i] >= 2 * now)
			q.remove();
			q.add(arr[i]);
		}
	
		return q.size();
	}
	
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int arr[]=new int[a];
	    for(int i=0;i<a;i++)
	    {
	        arr[i]=sc.nextInt();
	    }

		System.out.println(minimumBox(arr, a));
	}
}