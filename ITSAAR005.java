import java.util.*;

public class ITSAAR005
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int testCount = Integer.parseInt(scanner.nextLine());
		
		int size = 25;
		int time[] = new int[size];
		for(int i = 0; i < size; i++)
			time[i] = 0;
		
		while(testCount-- != 0)
		{
			int s = scanner.nextInt();
			int d = scanner.nextInt();
			
			for(int i = s; i < d; i++)
			{
				time[i]++;
			}
		}
		
		int max = 0;
		for(int i = 0; i < size; i++)
		{
			if(time[i] > max)
			{
				max = time[i];
			}
		}
		System.out.println(max);
		
		scanner.close();
	}
}
