import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      int c=sc.nextInt();
      int i,j,k;
      for(i=1;i<=r;i++)
      {
        for(j=c;j>c-i;j--)
          System.out.print(j);
        for(k=1;k<=c-i;k++)
          System.out.print(r-i+1);
        System.out.println();
      }
    }
}