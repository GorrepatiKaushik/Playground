import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      StringBuilder sb=new StringBuilder(sc.nextLine());
      StringBuilder sb1=new StringBuilder();
      int i,l;
      String s,s1;
      l=sb.length();
      for(i=l-1;i>=0;i--)
      {
        sb1.append(sb.charAt(i));
      }
      s=sb.toString();
        s1=sb1.toString();
      if(s.equals(s1))
       System.out.println("Yes");
      else
        System.out.println("No");
      //System.out.println(sb+"  "+sb1);
      
        
      
        
    } }