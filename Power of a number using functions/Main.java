import java.util.Scanner;
class Main{
  public static int pwn(int b,int e)
  {
    int s=1;
    while(e!=0)
    {
      s=s*b;
      e--;
    }
    return s;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    //System.out.println("base = ");
    int b=sc.nextInt();
    //System.out.println("exponent = ");
    int e=sc.nextInt();
    System.out.println(pwn(b,e));
  }
}
      