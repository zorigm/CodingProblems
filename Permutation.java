import java.util.Arrays;

public class Permutation {

	public boolean isPermutation(String Str, String Str2)
	{
		
		if(Str.length() != Str2.length())
		{
			return false;
		}
		
		char[] chars1 = Str.toCharArray();
		char[] chars2 = Str2.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		if(new String(chars1).equals(new String(chars2)))
		{
			return true;
		}
		return false;
	}
}
