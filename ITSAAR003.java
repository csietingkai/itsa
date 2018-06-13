import java.util.*;

public class ITSAAR003
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		while(scanner.hasNext())
		{
			String line = scanner.nextLine();
			//System.out.println(line);
			
			String nums[] = line.split(" ");
			for(int i = nums.length-1; i >= 0; i--)
			{
				int a = Integer.parseInt(nums[i]);
				//System.out.println(a);
				sum += a*a*a;
			}
			System.out.println(sum);
		}
		
		scanner.close();
	}
}
