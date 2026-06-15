//palindrom means reverse==origenal number
import java.io.*;
import java.util.*;
class palindromNm
{
	public static void main(String arg[])
	{
	 
	 Scanner s=new Scanner(System.in);
		 System.out.println("Enter Number");
		 int a=s.nextInt();
	 //int a=121;
	 int origi=a;
	 int rev=0;
	 
	 while(a!=0)
	 {
		 int digit=a%10;
		 rev=rev*10+digit;
		 a=a/10;
		 
	 }
	 if(origi==rev)
	 {
		 System.out.println("palindrom");
		 
	 }
	 else
	 {
		 System.out.println("Not palindrom");
	 }
	}
}