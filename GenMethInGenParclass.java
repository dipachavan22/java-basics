class parent<T>
{
	void show(T val)
	{
		System.out.println(val);
	}
	<U> void display(U val)
	{
		System.out.println(val);
	}
	
}
class GenMethInGenParclass
{
	public static void main(String args[])
	{
		parent<String> c=new parent<>();
		
		c.show("Dipa");
		c.display(100);
		
	}
}