import java.io.*;
import java.util.*;
class calculator
{
    public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
	System.out.println("Enter first NO.=");
	int a=s.nextInt();
	System.out.println("Enter Second NO.=");
	int b=s.nextInt();
	
	System.out.println("Choose Operation");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Choose your choice");
		 int choice=s.nextInt();
		
		switch(choice)
		{
			case 1:
			System.out.println("Addition Is = "+(a+b));
			break;
			case 2:
			System.out.println("Substraction Is = "+(a-b));
			break;
			case 3:
			System.out.println("Multiplication Is = "+(a*b));
			break;
			case 4:
			if(b!=0)
			{
			System.out.println("Division Is = "+(a/b));
			}
			else{
				System.out.println("Can not Divided By 0");
			}
			break;
			default:
			System.out.println("Invalid Choice");
		}
		s.close();
}
}