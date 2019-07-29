import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      //StringBuilder in1=new StringBuilder(s1);
     // StringBuilder in2=new StringBuilder(s2);
      s1=s1.concat(s1);
      //System.out.println(s1);
      if(s1.contains(s2))
        System.out.println("Yes");
      else
        System.out.println("No");
     
      
      
      
    }
}