import java.util.Scanner;
class Main {
	public static void main (String[] args){
	 Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      int m=n,div=1;
     int i=0;
      while(n!=0)
      {
         n=n/10;
         i++;
      }
      
      while(i>1)
      {
        div=div*10;
        i--;
      }
    
      int fd=m/div;
      int ld=m%10;
      int sum=fd+ld;
      System.out.println(sum);
      
	}
}