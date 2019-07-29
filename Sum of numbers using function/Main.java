import java.util.Scanner;
class Main{
    public static int son(int n)
    {
      int sum=0;
      while(n>=0)
      {
        sum=sum+n;
        n--;
      }
      return sum;
    }
        
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(son(n));
	}
}