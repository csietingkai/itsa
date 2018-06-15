import java.io.*;
import java.util.*;

public class ITSAAR048
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		int c0 = (Integer.parseInt(input.substring(2,3))+7)%10;
		int c1 = (Integer.parseInt(input.substring(3,4))+7)%10;
		int c2 = (Integer.parseInt(input.substring(0,1))+7)%10;
		int c3 = (Integer.parseInt(input.substring(1,2))+7)%10;
		
		String result = "";
		result += Integer.toString(c0) + Integer.toString(c1) + Integer.toString(c2) + Integer.toString(c3);
		//System.out.println(c0);
		//System.out.println(c1);
		//System.out.println(c2);
		//System.out.println(c3);
		System.out.println(result);
		
		scanner.close();
	}
}
