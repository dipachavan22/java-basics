import java.io.*;
import java.util.*;
class PrimeNo
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any no.");
		int a=s.nextInt();
		//int a=7;
		int cnt=0;
		
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				cnt++;
			}
		}
		if(cnt==2){
			System.out.println("Is Prime");
		}
		else{
			System.out.println("Not Prime");
		}
		
	}
}