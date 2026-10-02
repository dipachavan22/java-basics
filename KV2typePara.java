import java.io.*;
import java.util.*;

class pair<K,V>
{
	K val1;
	V val2;
	
	void set(K val1,V val2)
	{
		this.val1=val1;
		this.val2=val2;
	}
	
	void display()
	{
		System.out.println(val1);
		System.out.println(val2);
		
	}
}


class KV2typePara
{
	public static void main(String args[])
	{
		pair <String,Integer> p1=new pair <>();
		
		p1.set("Dipa",102);
		
		p1.display();
	}
}