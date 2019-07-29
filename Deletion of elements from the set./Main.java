import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      TreeSet ts=new TreeSet();
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      int i;
      String line=br.readLine();
      String[] larr=line.split(",");
      for(i=0;i<larr.length;i++)
        ts.add(larr[i]);
      int s=larr.length;
      s=s-1;
      System.out.println(ts);
      while(s!=-1)
      {
        try{
        Object obj=ts.last();
        ts.remove(obj);
        System.out.println(ts);
        s--;
        }
        catch(Exception e){}
      }
      
      
    }
}
