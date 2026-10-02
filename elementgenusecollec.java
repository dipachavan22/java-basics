import java.io.*;
import java.util.*;
class MyList<E>
{
	E ele;
	void set(E ele)
	{
		this.ele=ele;

	}
	E get()
	{
		return ele;
		
	}
}


class elementgenusecollec
{
	public static void main(String args[])
	{
		MyList <String> l1=new MyList<>();
		l1.set("Dipa");
		System.out.println(l1.get());
		MyList <Integer> l2=new MyList<>();
		l2.set(102);
		System.out.println(l2.get());
		
	}
}