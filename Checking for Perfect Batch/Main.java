import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,j,count=0,flag=0;
    int arr[]=new int[n];
    int sum[]=new int[n/3];
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    for(i=0;i<n;i=i+3)
    {
      for(j=i;j<i+3;j++)
      {
        sum[count]=sum[count]+arr[j];
      }
      count++;
    }
    n=n/3;
    for(i=0;i<n-1;i++)
    {
      if(sum[i]==sum[i+1])
        flag=0;
      else
        flag=1;
    }
    if(flag==0)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}