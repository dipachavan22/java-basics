import java.io.*;
import java.util.*;
interface conta<T>
{
	void add(T val);
	T get();
}
class Myconta<T> implements conta<T>
{
	private T val;
	public void add(T val)
	{
		this.val=val;
	}
	 public T get()
	{
	return val;	
	}
}

class ImpleGenInterfaceWithSpecType
{
	public static void main(String as[])
	{
		
	Myconta<Integer> c1=new Myconta<>();
	Myconta<String> c2=new Myconta<>();
	
	c1.add(100);
	c2.add("Dipa");
	
	System.out.println(c1.get());
	System.out.println(c2.get());
	}
}