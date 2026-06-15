 //153 have 3 digits
 //digits are power of each num in 153
 //1^3+5^3+3^3 that sum is == to number
 //1^3+5^3+3^3=153
 
 import java.io.*;
 import java.util.*;
 class ArmstrongNO
 {
	 public static void main(String arg[])
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter Number");
		 int a=s.nextInt();
		 //int a=153;
		 int org=a;
		 int sum=0;
		 
		 while(a!=0){
			 int dig=a%10;
			 sum=sum+(dig*dig*dig);
			 a=a/10;
		 }
		 if(org==sum)
		 {
			 System.out.println("Armstrong number");
			 
		 }
		 else{
		 System.out.println("Not Armstrong Number");
		 }
	 }
 }