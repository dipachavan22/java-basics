import java.io.*;
import java.util.*;
class genmethreturnvalorgenreturntype
{
	public static <T> T getValue (T Val)
	{
		return Val;
	}
	public static void main(String args[])
	{
		String s1 = getValue("Dipa");
		Integer s2 =getValue(120);
		System.out.println(s1);
		System.out.println(s2);
	}
}
