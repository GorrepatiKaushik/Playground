import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j,k;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
        {
          if(i==j|| i+j==n+1)
            System.out.print("*");
          
          else
             System.out.print(" ");
         //  System.out.print(" ");
          
        }
        System.out.println();
      }
	}
}