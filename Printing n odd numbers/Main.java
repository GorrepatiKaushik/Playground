import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=1,count=1;
      while(count<=n)
      {
        
        if(i%2==1)
        {
          System.out.println(i);
          count++;
        }
       i++;
      }
	}
}