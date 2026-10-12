import java.io.*;
import java.util.*;
class GenPrintArray
{
	public static <T> void printArr(T[] array)
	{
		for (T val : array)
		{
			System.out.println(val);
		}
	}
	public static void main(String args[])
	{
		String[] nm ={"first","Second","Third"};
		printArr(nm);
	}
}