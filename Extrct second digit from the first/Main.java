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
      
      while(i>2)
      {
        div=div*10;
        i--;
      }
    
      int res=m/div;
      res=res%10;
      System.out.println(res);
      
	}
}