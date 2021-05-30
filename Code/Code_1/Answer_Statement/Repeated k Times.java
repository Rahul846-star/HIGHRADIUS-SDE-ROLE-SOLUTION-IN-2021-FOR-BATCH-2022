import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Main {
	static int minimumBox(int []arr, int n)
	{
		  Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        ArrayList<Integer> a1=new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
           if(entry.getValue()==n)
           {
               a1.add(entry.getKey());
           }
        }
        Collections.sort(a1);
        return a1.get(0);
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
	    int q=sc.nextInt();

		System.out.println(minimumBox(arr, q));
	}
}

