import java.io.*;
import java.util.*;

public class Main
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String strs[] = str.split(",");
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		int c = Integer.parseInt(strs[2]);
		
		//System.out.printf("%d, %d, %d", a, b, c);
		
		for(int x = 0; x <= c/a; x++)
		{
			for(int y = 0; y <= c/b; y++)
			{
				if(a*x+b*y == c)
				{
					System.out.println(x+","+y);
				}
			}
		}
		
		sc.close();
	}
}
