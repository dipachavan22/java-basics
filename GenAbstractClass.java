import java.io.*;
import java.util.*;

abstract class dataprocessor<T>
{
    abstract void process(T val);

    void display(T val)
    {
        System.out.println(val);
    }
}


class StringProcessor extends dataprocessor<String>
{
	@Override
	void process(String val)
	{
		System.out.println(val.toUpperCase());
		
	}
}


class GenAbstractClass
{
public static void main(String args[])
{
	StringProcessor s1=new StringProcessor();
	s1.process("java");
	s1.display("hey");
}
}