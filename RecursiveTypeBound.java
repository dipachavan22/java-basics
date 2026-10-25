class RecursiveTypeBound
{
	static<T extends Comparable <T>> T getMax(T a,T b)
	{
		if(a.compareTo(b)>0)
		{
			return a;
		}
		else 
		{
			return b;
		}
		
	}
	
	public static void main(String args[])
	{
		System.out.println(getMax(10,20));
		System.out.println(getMax("Apple","Banana"));
	}
}