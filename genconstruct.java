import java.io.*;
import java.util.*;
class genconstruct
{
	<T> genconstruct ( T val)
	{
		System.out.println(val);
	}
	public static void main(String args[])
	{
			genconstruct obj1 = new genconstruct("Dipa");
			genconstruct obj2 = new genconstruct(120);
	}
}