import java.io.*;
import java.util.*;

public class ITSAAR050
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		int index = 0;
		
		while(index < count)
		{
			if(list.contains(list.get(index)*2+1) == false)
			{
				list.add(list.get(index)*2+1);
			}
			if(list.contains(list.get(index)*3+1) == false)
			{
				list.add(list.get(index)*3+1);
			}
			index++;
			Collections.sort(list);
		}
				
		for(int i = 0; i < count; i++)
		{
			System.out.println(list.get(i));
		}
		
		//for(Integer num : list)
		//	System.out.println(num);
		
		scanner.close();
	}
}
