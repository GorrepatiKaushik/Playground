import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int fac=1;
      while(n>=1)
      {
        fac=fac*n;
        n--;
        //System.out.println(fac);
      }
      System.out.println(fac);
	}
}