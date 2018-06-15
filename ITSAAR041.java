import java.io.*;
import java.util.*;

public class ITSAAR041
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextLine())
		{
			String elements[] = scanner.nextLine().split(" ");
			double sum = 0.0;
			for(String e : elements)
			{
				sum += Double.parseDouble(e);
			}
			System.out.println("Size: "+elements.length);
			System.out.printf("Average: %.3f", sum/elements.length);
			System.out.println();
		}
		
		scanner.close();
	}
}
