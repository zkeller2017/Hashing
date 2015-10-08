public abstract class Hasher
{
	public int collisions = 0;

	public abstract int hash(String s);
	
	public abstract String getCoderName();
}