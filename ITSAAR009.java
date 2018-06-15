import java.io.*;
import java.util.*;

public class ITSAAR009
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String line[] = scanner.nextLine().split(",");
		Integer nums[] = new Integer[line.length];
		for(int i = 0; i < line.length; i++)
		{
			nums[i] = Integer.parseInt(line[i]);
			//System.out.println(nums[i]);
		}
		
		Arrays.sort(nums);
		String min = "";
		for(int i = 0; i < line.length; i++)
		{
			min += nums[i];
			//System.out.println(nums[i]);
		}
		
		Arrays.sort(nums, Collections.reverseOrder());
		String max = "";
		for(int i = 0; i < line.length; i++)
		{
			max += nums[i];
			//System.out.println(nums[i]);
		}
		
		//System.out.println(max);
		//System.out.println(min);
		System.out.println(Integer.parseInt(max)-Integer.parseInt(min));
		
		scanner.close();
	}
}
