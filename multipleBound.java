import java.io.*;
import java.util.*;
class clculatar<T extends Number & Comparable<T>>
{
	T val;
	clculatar(T val)
	{
		this.val=val;
		
	}
	boolean isGreaterThan(T other)
	{
		return val.compareTo(other)>0;
	}
}
class multipleBound
{
	public static void main(String args[])
	{
	
	clculatar<Integer> c = new clculatar<>(100);
	System.out.println(c.isGreaterThan(20));
	}
}