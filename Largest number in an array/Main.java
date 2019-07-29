import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int i;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int num[]=new int[n];
      for(i=0;i<n;i++)
        num[i]=sc.nextInt();
      int big=num[0];
      for(i=1;i<n;i++)
      {
        if(num[i]>big)
          big=num[i];
      }
      System.out.println(big);
    }
}