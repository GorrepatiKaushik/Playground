import java.util.Scanner;
public class Main{
  public static int gcd(int a, int b)
  {
    int gcd;
    if(b>a)
      gcd=a;
    else
      gcd=b;
    for(int i=gcd;i>=1;i--)
    {
      if(a%i==0 && b%i==0)
      {
        gcd=i;
        break;
      }
    }
    return gcd;
  }
	public static void main (String[] args)
	{
	  Scanner sc=new Scanner(System.in);
      int gcd;
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      gcd=gcd(n1,n2);
      gcd=gcd(gcd,n3);
      System.out.println(gcd);
	}
}