import java.util.*;

public class ITSAAR001 // it can also pass AR02
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext())
		{
			String line = scanner.nextLine();
			//System.out.println(line);
			
			String nums[] = line.split(" ");
			for(int i = nums.length-1; i >= 0; i--)
			{
				System.out.print(nums[i]+(i == 0 ? "" : " "));
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
