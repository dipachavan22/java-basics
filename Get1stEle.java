import java.io.*;
import java.util.*;
class Get1stEle
{
	public static <T> T getFirst(T[] arr)
	{
		return arr[0];
	}
	public static void main(String args[])
	{
		
		String first = getFirst(new  String[]{"A","B","C"});
		System.out.println(first);
	}
}