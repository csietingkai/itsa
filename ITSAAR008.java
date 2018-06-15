import java.io.*;
import java.util.*;

public class ITSAAR008
{
	static boolean[] primes = new boolean[100001];
	public static void fillSieve()
	{
		Arrays.fill(primes, true);
		
		primes[0] = false;
		primes[1] = false;
		
		for (int i = 2; i < primes.length; i++)
		{
		    //if the number is prime, 
		    //then go through all its multiples and make their values false.
		    if(primes[i])
		    {
		        for (int j = 2; i*j < primes.length; j++)
		        {
		            primes[i*j] = false;
		        }
		    }
		}
	}
	
	public static boolean isPrime(int number)
	{
		return primes[number];
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int max = 0;
		fillSieve();
		
		String number = scanner.nextLine();
		if(isPrime(Integer.parseInt(number)))
		{
			//System.out.println("true");
		}
		else
		{
			//System.out.println("false");
		}
		
		for(int i = 0; i < number.length(); i++)
		{
			for(int j = i+1; j <= number.length(); j++)
			{
				int subnum = Integer.parseInt(number.substring(i, j));
				//System.out.println(subnum);
				if(isPrime(subnum) && subnum > max)
				{
					max = subnum;
				}
			}
		}
		if(max == 0)
		{
			System.out.println("No prime found");
		}
		else
		{
			System.out.println(max);
		}
		
		scanner.close();
	}
}
