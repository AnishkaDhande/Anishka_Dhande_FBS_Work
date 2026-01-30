import java.util.*;
class String_ArrayList
{
    public static void main(String args[])
    {
        List<String> namelist=new ArrayList<String>();
         namelist.add("Anishka");
          namelist.add("Aditya");
           namelist.add("Sangita");
            namelist.add("Jayesh");
    for(String name:namelist)
    {
        System.out.print(" "+name);
    }
    }
}