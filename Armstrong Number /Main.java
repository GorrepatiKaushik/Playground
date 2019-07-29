import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=n,k=m,sum1=1,sum=0,d;
      int count=0,c1;
      while(n!=0)
      {
        n=n/10;
        count++;
      }
      c1=count;
      while(m!=0)
      {
        d=m%10;
        m=m/10;
        
        sum += Math.pow(d, count);
      /* while(c1!=0)
        {
          sum1=d*sum1;
          c1--;
        } */
        
      }
       if(k==sum)
         System.out.println("Armstrong Number");
      else
         System.out.println("Not a Armstrong Number");
      
 }
}