import java.lang.Math;
public class ZachHash extends Hasher
{
	public int hash(Object obj)
	{
		String s = obj.toString();
		int[] code = new int[s.length()];
		for (int a=0; a<s.length(); a++)
		{
			char c = s.charAt(a);
			code[a] = (int) c;
		}
		int hashCode = 0;
		for (int spot=1; spot < code.length; spot++)
		{
			hashCode += ( code[spot - 1] * spot );
		}
		return hashCode;
	}
	
	public String getCoderName()
	{
		return "Zach Keller";
	}


}