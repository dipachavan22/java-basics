import java.io.*;
import java.util.*;

class Box<T>
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

class TtypeWithGenReuse
{
	public static void main(String args[])
	{
		
		Box <String> o1=new Box<>();
		o1.set("Hii");
		System.out.println(o1.get());
	}
	
	
}