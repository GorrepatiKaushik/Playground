import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      LinkedHashSet lhs=new LinkedHashSet();
      int i;
      String line=br.readLine();
      String[] larr=line.split(",");
      for(i=0;i<larr.length;i++)
        lhs.add(larr[i]);
      System.out.println(lhs);
    }
}