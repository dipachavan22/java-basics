import java.io.*;
import java.util.*;
//for String
class StringBox
{
	String value;
	void set(String value)
	{
		this.value=value;
	}
	String get()
	{
		return value;
	}
}

//Integer
class IntegerBox
{
	Integer value;
	void set(Integer value)
	{
		this.value=value;
	}
	Integer get()
	{
		return value;
	}
}

class WithoutGenericReuse
{
	public static void main(String args[])
	{
		StringBox b1=new StringBox();
		b1.set("Dipa");
		System.out.println(b1.get());
		IntegerBox b2=new IntegerBox();
		b2.set(120);
		System.out.println(b2.get());
		
	}
}
