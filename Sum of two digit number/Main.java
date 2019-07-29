import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int i=sc.nextInt();
      int fn=i/10;
      int sn=i%10;
      int sum=fn+sn;
      System.out.println(sum);
	}
}