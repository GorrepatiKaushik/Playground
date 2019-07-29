import java.util.Scanner;
class Main{
  public static void printprime(int n)
  {
    int k,i,j;
    for(i=2;i<=n;i++)
    {
      k=1;
      for(j=2;j<=i;j++)
      {
        if(i%j==0)
          k+=1;
      }
      if(k==2)
        System.out.println(i);
    }
  }
    
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      printprime(n);
      
	}
}