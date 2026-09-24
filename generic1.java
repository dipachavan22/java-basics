import java.io.*;
import java.util.*;
 class generic1
 {
	 public static void main (String arg[])
	 {
	
		// with generics
		 ArrayList <String> name = new ArrayList<>();
		 System.out.println(name);// []
		name.add("Dipa");
		name.add("Dipali");
		System.out.println(name);//[Dipa,Dipali]
		 //if  doesn't have []
		System.out.println(name.get(0));//Dipa
		System.out.println(name.get(1));//Dipali
		//System.out.println(name.get(2));//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 2 out of bound
		
		//taking another ArrayList <String> name = new ArrayList<>(); in same program
		ArrayList <Integer> n = new ArrayList<>();
		System.out.println(n);// []
		n.add(123);
		System.out.println(n);
		System.out.println(n.get(0));
		
	 }
	 
 }