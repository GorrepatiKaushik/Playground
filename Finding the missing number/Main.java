import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,is_present=0,j;
      int arr[]=new int[n];
      for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
      int min=arr[0];
      for(i=1;i<n;i++)
        if(arr[i]<min)
          min=arr[i];
      //System.out.println(min);
       int max=arr[0];
      for(i=1;i<n;i++)
        if(arr[i]>max)
          max=arr[i];
      //System.out.println(max);
      min=min+1;
      while(min<=max)
      {
      for(i=0;i<n;i++)
      {
        if(arr[i]==min)
        {
          is_present=1;
          break;
        }
      }
        if(is_present==0)
          System.out.println(min);
        min++;
        is_present=0;
        //System.out.println(min);
      }
    }
}