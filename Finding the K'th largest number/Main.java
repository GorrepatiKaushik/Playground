import java.util.Scanner;
class Main{
   
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i;
      int arr[]=new int[n];
      for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
      int pos=sc.nextInt(); 
      selection_Sort(n,arr);
     // for(i=0;i<n;i++)
        
      System.out.println(arr[n-pos]);
        
        
      } 
  public static void selection_Sort(int n, int arr[])
  {
    int i,min_elem;
    for(i=0;i<=n-2;i++)
    {
      min_elem=find_Min(i,n-1,arr);
      swap(min_elem,i,arr);
    }
  }
  public static void swap(int min_elem, int k, int arr[])
  {
    int temp=arr[min_elem];
    arr[min_elem]=arr[k];
    arr[k]=temp;
  }
  public static int find_Min(int i,int end,int arr[])
  {
    int min_idx=i,k;
    /*if(arr[i]>arr[i+1])
      min_idx=i+1;
    else
      min_idx=i;*/
    for( k=i+1;k<=end;k++)
    {
      if(arr[k]<arr[min_idx])
        min_idx=k;
    }
    return min_idx;
  }
    
}