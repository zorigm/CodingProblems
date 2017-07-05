
public class URLify {

	public String replaceChars(String Str)
	{
		StringBuilder build = new StringBuilder();
		char[] chars = Str.toCharArray();
		
		
		for(int i = 0; i < Str.length(); i++)
		{
			if(Str.charAt(i)/*chars[i]*/ == ' ')
			{
				build.append("%20");
			}
			else
			{
				build.append(Str.charAt(i));
			}
		}
		
		return build.toString();
	}
}
