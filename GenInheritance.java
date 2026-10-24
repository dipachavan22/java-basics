import java.io.*;
import java.util.*;
class parent<T>
{
	T val;
		void set(T val)
		{
			this.val=val;
		}
		T get()
		{
			return val;
		}	
}
class child extends parent<String> 
{	}
class GenInheritance
{
	public static void main(String args[])
	{
		child n=new child();
		n.set("Generic Inheritance");
		System.out.println(n.get());
	}
}