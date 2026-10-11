import java.io.*;
import java.util.*;
class GenTargetTypeInference
{
	public static <T> T getValue()
	{
		return null;
	}
	public static void main(String args[])
	{
		String name =GenTargetTypeInference.<String> getValue("Dipa");
		System.out.println(name);
	}
}