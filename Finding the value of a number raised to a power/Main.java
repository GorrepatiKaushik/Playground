import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int n=sc.nextInt();
      int res=1;
      while(n>=1)
      {
        res=res*a;
        n--;
      }
      System.out.println(res);
    }
}