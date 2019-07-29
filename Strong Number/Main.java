import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=n,i,d;
      int sum=0,fac=1;
      while(n!=0)
      {
        d=n%10;
        n=n/10;
        fac=1;
        for(i=1;i<=d;i++)
          fac=fac*i;
        sum=sum+fac;
        
      }
       //System.out.println(sum);
        if(sum==m)
          System.out.println("Yes");
        else
          System.out.println("No");
            
	}
}