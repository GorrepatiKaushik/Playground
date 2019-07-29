import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      char c=sc.next().charAt(0);
      int k=sc.nextInt();
      int dv=c-k;
      if(c>='A' && c<='Z')
      {
        if(dv<65)
        dv=80-(65-dv);
      }
      if(c>='a' && c<='z')
      {
        if(dv<97)
        dv=123-(97-dv);
      }
        
      char val=(char)dv;
      System.out.println(val);
      //System.out.println((char)122);
    }
}