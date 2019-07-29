import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,k,l,count=1;
      for(i=1;i<=n;i++)
      {
        for(k=1;k<=n-i;k++)
           System.out.print(" ");
        for(l=1;l<=i;l++)
        {
          System.out.print(count+" ");
          count++;
        }
        System.out.println();
       // count++;
      }
    }    
}