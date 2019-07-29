import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0,l,i,j,k;
      for(i=1;i<=n;i++)
      {
        l=i+count;
        for(j=1;j<n-count;j++)
            System.out.print(" ");
        for(k=1;k<=l;k++)
           System.out.print("*");
        count++;
        System.out.println();
      }
          
        
	}
}