
public class UniqueString {
	
	public boolean isUniqueSlow(String Str)
	{
		//Brute Force if data structures aren't allowed to be used: O(n^2)
		for(int i = 0; i < Str.length() - 1; i++)
		{
			for(int j = i + 1; j < Str.length(); j++)
			{
				if(Str.charAt(i) == Str.charAt(j))
				{
					return false;
				}
			}
			
		}
		return true;
	}
	
	public boolean isUniqueFast(String Str)
	{
		//ASCII has 128 unique characters, if more then it is not unique. O(n)
		if(Str.length() > 128)
		{
			return false;
		}
		
		boolean[] setChar = new boolean[128];
		
		for(int i = 0; i < Str.length(); i++)
		{
			int val = Str.charAt(i);
			if(setChar[val])
			{
				return false;
			}
			setChar[val] = true;
			//System.out.println(val + " " + Str.charAt(i) + " " + Integer.toBinaryString(Str.charAt(i)));
		}
		
		return true;
	}
}
