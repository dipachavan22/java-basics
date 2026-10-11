import java.io.*;
import java.util.*;
 class gentypeInference
 //type inference automatically determain the type 
//we does't need to write   display<String> ("Dipa"); 
 {
	 public static <T> void display(T val)
	 {
		 System.out.println(val);
	 }
	 public static void main(String arg[])
	 {
		 display("Dipa");
		 display(120);
	 }
 }