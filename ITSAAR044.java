import java.io.*;
import java.util.*;

public class ITSAAR044
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext())
		{
			String input = scanner.nextLine();
			String temp1, temp2;
			
			temp1 = input.substring(0, input.length()/2);
			temp2 = input.substring(input.length()/2+(input.length()%2==0?0:1), input.length());
			
			System.out.println((temp1.equals(new StringBuilder(temp2).reverse().toString()))?"YES":"NO");
		}
		
		scanner.close();
	}
}
