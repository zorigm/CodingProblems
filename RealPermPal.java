package endstarttesting;

public class RealPermPal {

	public boolean isPermPal(String Str)
	{
		int[] letters = new int[26];
		char[] chars = Str.toCharArray();
		for(int i = 0; i < chars.length; i++)
		{
			letters[Character.getNumericValue(chars[i]) - 10]++;
			//System.out.println(Character.getNumericValue(chars[i]));
			//System.out.println(Character.getNumericValue('z'));
		}
		
		int oddCount = 0;
		
		for(int i = 0; i < letters.length; i++)
		{
			if(letters[i] % 2 == 1)
			{
				oddCount++;
			}
		}
		
		return oddCount == 1;
	}
}
