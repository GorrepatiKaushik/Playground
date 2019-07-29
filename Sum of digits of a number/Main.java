import java.util.Scanner;
class Main {
	public static void main (String[] args){
	 Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int rem,sum=0;
     int i=0;
      while(n!=0)
      { 
        rem=n%10;
         n=n/10;
         sum=sum+rem;
      }
      
     System.out.println(sum);
	}
}