import java.io.*;
import java.util.*;
 class generic2
 {
	 public static void main (String arg[])
	 {
		// without generics
		ArrayList list = new ArrayList();
		list.add("hii");// String
		list.add(102);// Integer
		System.out.println(list);//[hii,102]
		String n=(String)list.get(0);
		System.out.println(n);
		//String m=(String)list.get(1);
		//System.out.println(m);//Exception in thread "main" java.lang.ClassCastException:
		int m=(Integer)list.get(1);
		System.out.println(m);
	 }
 }	 