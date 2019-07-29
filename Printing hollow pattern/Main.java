import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j;
      for(i=1;i<=n;i++)
      {
        if(i==1 || i==n)
        {
          for(j=1;j<=n;j++)
            System.out.print("*");
          System.out.println();
        }
        else
        {
          for(j=1;j<=n;j++)
          {
            if(j==1||j==n)
            System.out.print("*");
            else
               System.out.print(" ");
          }
          System.out.println();
        }
      }
	}
}