import java.util.Scanner;
class Main{
  public static int great(int n1,int n2)
  {
    int big=0;
    if(n1>n2)
      big=n1;
    else if(n2>n1)
      big=n2;
    return big;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int big;
      big=great(n1,n2);
      big=great(big,n3);
      System.out.println(big);
      
	}
}