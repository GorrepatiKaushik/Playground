import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int arr1[]=new int[n];
      int i,count=0,count2=0;
      for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
      for(i=0;i<n;i++)
      {
        if(arr[i]!=0)
        {
          arr1[count]=arr[i];
          count++;
        }
      }
      //System.out.println(count2);
      for(i=0;i<n;i++)
      {
        if(arr1[i]!=0)
        arr[i]=arr1[i];
        else
        arr[i]=0;
      }
      for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
      
      
    }
}