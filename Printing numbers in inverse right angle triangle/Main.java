import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,k;
      for(i=n;i>=1;i--)
      {
        for(k=i;k>=1;k--)
           System.out.print(k);
        System.out.println();
      }
	}
}