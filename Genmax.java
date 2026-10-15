import java.io.*;
import java.util.*;
class Genmax
{
	public static <T extends Comparable<T>> T max(T a,T b)
	{
		if(a.compareTo(b)>0)
	
			return a;
	
		else
		
			return b;
		
	}
	
	public static void main (String args[])
	
	{
		System.out.println(max(10,60));
		System.out.println(max("hoye","oye"));
	}
}