import java.util.Arrays;

public class Anagram {

	public boolean isAnagram(String Str, String Str2)
	{
		char[] chars1 = Str.toCharArray();
		char[] chars2 = Str2.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		//System.out.println(chars1[1] + " " + chars2[1]);
		
		return new String(chars1).equals(new String(chars2));
	}
}
