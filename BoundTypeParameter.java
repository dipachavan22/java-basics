import java.io.*;
import java.util.*;
class Numbox<T extends Number>
{
	T val;
	Numbox(T val)
	{
		this.val=val;
	}
	
	double getDoubleValue()
	{
		return val.doubleValue();
	}
}
class BoundTypeParameter
{
	public static void main(String args[])
	{
		Numbox <Integer> n1 = new Numbox<>(100);
		Numbox<Double> n2 = new Numbox<>(56.33);
		
		System.out.println(n1.getDoubleValue());
		System.out.println(n2.getDoubleValue());
	}
}