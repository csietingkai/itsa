import java.io.*;
import java.util.*;

public class ITSAAR046
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		double input = 0.0;
		double sum = 0.0;
		
		while(scanner.hasNextDouble())
		{
			input = scanner.nextDouble();
			sum += input * input;
		}
		
		System.out.printf("%.6f\n", sum);
		
		scanner.close();
	}
}
