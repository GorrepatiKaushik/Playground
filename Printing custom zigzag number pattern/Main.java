import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j,k,fn,count=2;
      for(i=1;i<=n;i++)
      {
        if(i%2==1)
        {
          for(j=1;j<=n;j++)
          {
            if(j!=n)
              System.out.print(i);
            else
              System.out.print(count);
          }
          System.out.println();
          count++;
        }
        else
        {
           for(j=1;j<=n;j++)
          {
            if(j!=1)
              System.out.print(i);
            else
              System.out.print(count);
          }
          count++;
          System.out.println();
        }
      }
          
	}
}