import java.io.*;
import java.util.*;
class printer<T>
{
	void print(T val)
	{
		System.out.println(val);
	}
}
class GenprinterOP
{
	public static void main(String args[])
	{
		printer<String> p1 = new printer<>();
		p1.print("Dipa");
		
		printer<Integer> p2 = new printer<>();
		p2.print(100);
	}	
}