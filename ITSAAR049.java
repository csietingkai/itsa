import java.io.*;
import java.util.*;

public class ITSAAR049
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		
		String str = scanner.nextLine();
		int shift = scanner.nextInt();
		
		char key;
		char value;
		final int ALPHABET_AMOUNT = 26;
		for(int i = 0; i < ALPHABET_AMOUNT; i++)
		{
			key = (char)('a'+i);
			value = (char)('a'+i+shift);
			if(value > 'z')
			{
				value -= ALPHABET_AMOUNT;
			}
			map.put(key, value);
			
			key = (char)('A'+i);
			value = (char)('A'+i+shift);
			if(value > 'Z')
			{
				value -= ALPHABET_AMOUNT;
			}
			map.put(key, value);
		}
		
		final int NUMBER_AMOUNT = 10;
		for(int i = 0; i < NUMBER_AMOUNT; i++)
		{
			key = (char)('0'+i);
			value = (char)('0'+i+shift);
			if(value > '9')
			{
				value -= NUMBER_AMOUNT;
			}
			map.put(key, value);
		}
		
		String result = "";
		for(int i = 0; i < str.length(); i++)
		{
			result += (map.get(str.charAt(i)) == null ? str.charAt(i) : map.get(str.charAt(i)));
		}
		System.out.println(result);
		
		scanner.close();
	}
}
