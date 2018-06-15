import java.io.*;
import java.util.*;

public class ITSAAR047
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = new int[10];
		for(int i = 9; i >= 0; i--)
		{
			arr[i] = scanner.nextInt();
		}
		for(int i = 0 ; i < 10; i++)
		{
			System.out.print(arr[i] + (i == 9 ? "\n" : " "));
		}
		
		scanner.close();
	}
}
