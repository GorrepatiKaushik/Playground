import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      LinkedHashSet lhs=new LinkedHashSet();
      int i;
      String line=br.readLine();
      String[] larr=line.split(",");
      for(i=0;i<larr.length;i++)
        lhs.add(larr[i]);
      System.out.println(lhs);
      System.out.print("Enter the value to be deleted: ");
      String i1=br.readLine();
      //Integer id=new Integer(i);
      System.out.print(i1);
      lhs.remove(i1);
      System.out.println("\n"+lhs);
      System.out.print("Enter the value to be added: ");
      String i2=br.readLine();
      System.out.print(i2);
      //Integer id=new Integer(i);
      lhs.add(i2);
      System.out.println("\n"+lhs);
      
      
    }
}
