import java.io.*;
import java.util.*;

public class ITSAAR042
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextLine())
		{
			String elements[] = scanner.nextLine().split(" ");
			HashMap<Integer, Integer> numCount = new HashMap<Integer, Integer>();
			for(String e : elements)
			{
				if(numCount.containsKey(Integer.parseInt(e)))
				{
					Integer ni = numCount.get(Integer.parseInt(e))+1;
					numCount.remove(Integer.parseInt(e));
					numCount.put(Integer.parseInt(e), ni);
				}
				else
				{
					numCount.put(Integer.parseInt(e), 1);
				}
			}
			
			boolean found = false;
			for(Integer n : numCount.keySet())
			{
				//System.out.println(n+" "+numCount.get(n));
				if(numCount.get(n) > elements.length/2)
				{
					System.out.println(n);
					found = true;
					break;
				}
			}
			//System.out.println(elements.length);
			if(found == false)
			{
				System.out.println("NO");
			}
		}
		
		scanner.close();
	}
}
