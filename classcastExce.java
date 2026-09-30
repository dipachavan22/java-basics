import java.io.*;
import java.util.*;
class classcastExce
{
    public static void main(String args[])
    {
        ArrayList li=new ArrayList();
        li.add("Dipa");
        li.add(100);
       String nm1=(String) li.get(0);
       String nm2=(String) li.get(1);
        System.out.println(nm1);
        System.out.println(nm2);
    }
}