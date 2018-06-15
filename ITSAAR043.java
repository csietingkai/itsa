import java.io.*;
import java.util.*;
import java.math.*;

public class ITSAAR043
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext())
		{
			BigInteger bi = new BigInteger(Integer.toString(scanner.nextInt()));
			System.out.println(bi.pow(scanner.nextInt()));
		}
		
		scanner.close();
	}
}
