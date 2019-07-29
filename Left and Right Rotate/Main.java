import java.util.Scanner;
class Main 
{
  public static void lr(int n, int arr[],int r)
  {
    int fei=2,i,j,lei;
    if(n%2!=0)
      lei=n-1;
    else
      lei=n;
    for(i=1;i<=r;i++)
    {
      int temp=arr[fei];
      for(j=fei+2;j<=lei;j=j+2)
      {
        arr[j-2]=arr[j];
      }
      arr[lei]=temp;
    }
  }
  public static void rr(int n, int arr[],int r)
  {
    int foi=1,i,j,loi;
    if(n%2==0)
      loi=n-1;
    else
      loi=n;
    for(i=1;i<=r;i++)
    {
      int temp=arr[loi];
      for(j=loi-2;j>=1;j=j-2)
      {
        arr[j+2]=arr[j];
      }
      arr[foi]=temp;
    }
  }
  public static void main(String args[])
    {
    	//Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //n=n;
    int arr[]=new int[n+1];
    int i;
    for(i=1;i<=n;i++)
    arr[i]=sc.nextInt();
    int r=sc.nextInt();
    lr(n,arr,r);
    rr(n,arr,r);
    for(i=1;i<=n;i++)
      System.out.print(arr[i]+" ");
    
  	}
}