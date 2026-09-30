import java.io.*;
import java.util.*;
class TypeCasting
{
    public static void main(String args[]) 
    {
        ArrayList list =new ArrayList();
        list.add("Dipa");
        String nm=(String)list.get(0);
        System.out.println(nm);

    }
}
