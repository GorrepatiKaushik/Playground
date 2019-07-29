import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int n1=num%10;
    n1=n1*100;
    int n2=num%100;
    n2=n2/10;
    n2=n2*10;
    int n3=num/100;
    int sum=n1+n2+n3;
    System.out.println(sum);
  }
}