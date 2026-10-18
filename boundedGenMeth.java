import java.io.*;
import java.util.*;
class boundedGenMeth
{
	static <T extends Number> double square(T n)
	{
			double val=n.doubleValue();
			return val*val;
	}
 public static void main(String arg[])
 {
	System.out.println(square(2));
	System.out.println(square(2.9));

 }
}
