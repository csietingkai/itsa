import java.util.*;

public class ITSAAR004
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int testCount = Integer.parseInt(scanner.nextLine());
		while(testCount-- != 0)
		{
			String wh[] = scanner.nextLine().split(" ");
			int height = Integer.parseInt(wh[0]);
			int width = Integer.parseInt(wh[1]);
			
			boolean map[][] = new boolean[height][width]; // if is zero, then false
			
			for(int i = 0; i < height; i++)
			{
				String nums[] = scanner.nextLine().split(" ");
				//System.out.println(nums.length);
				for(int j = 0; j < width; j++)
				{
					map[i][j] = nums[j].equals("0") ? false : true;
				}
				//System.out.println();
			}
			
			for(int i = 0; i < height; i++)
			{
				for(int j = 0; j < width; j++)
				{
					if(map[i][j] == false) // 0
					{
						System.out.print("_ ");
					}
					else
					{
						if((i > 0 && map[i-1][j] == false)||
						   (i < height-1 && map[i+1][j] == false)||
						   (j > 0 && map[i][j-1] == false)||
						   (j < width-1 && map[i][j+1] == false))
						{
							System.out.print("0 "); 
						}
						else
						{
							System.out.print("_ ");
						}
					}
				}
				System.out.println();
			}
			
			if(testCount != 0)
			{
				System.out.println();
			}
		}
		
		scanner.close();
	}
}
