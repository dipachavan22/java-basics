import java.io.*;
import java.util.*;
interface container<T>
{
	void add(T val);
	 T get();
}
class StringContainer implements container<String>
{
	private String val;
	public void add (String val)
	{
		this.val=val;
	}
	public String get()
	{
		return val;
	}
	
}
 class GenInterfaceWithSpeType
 {
	 public static void main(String args[])
	 {
		 StringContainer k=new StringContainer();
		 k.add("Generic Interface with specific type");
		 System.out.println(k.get());
	 }
 }