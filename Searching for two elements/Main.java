import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int as1=-1,as2=-1,i;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int num[]=new int[n];
      for(i=0;i<n;i++)
        num[i]=sc.nextInt();
      int s1=sc.nextInt();
      int s2=sc.nextInt();
      for(i=0;i<n;i++)
      {
        if(num[i]==s1)
          as1=i;
        if(num[i]==s2)
          as2=i;
      }
      System.out.println(as1);
      System.out.println(as2);
        
        
    }
}