import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int i=in.nextInt();
      int fn=i/100;
      int sn=i%10;
      int sum=fn+sn;
      System.out.println(sum);
	}
}