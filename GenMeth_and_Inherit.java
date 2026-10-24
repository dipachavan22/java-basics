class Parent
{
	<T> void print(T val)
	{
		System.out.println(val);
	}
}
class Child extends Parent
{
	
}

class GenMeth_and_Inherit
{
	public static void main(String arg[])
	{
		Child n=new Child();
		
		n.print("Hii");
		n.print(120);
		
	}
}