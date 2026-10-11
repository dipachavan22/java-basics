import java.io.*;
import java.util.*;
 class SwapGen
 {
	 public static <T> void swap(T[] array,int i,int j)
	 {
		 T temp = array[i];
		 array[i] = array[j];
		 array[j] = temp;
	 }
  public static void main(String args[])
  {
	  Integer[] num ={10,20};
	  swap (num,0,1);
	  
	  System.out.println(num[0]);
	  System.out.println(num[1]);
  }
 }