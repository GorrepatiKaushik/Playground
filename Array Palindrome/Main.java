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
      int first,last,flag=0;
      first=0;
      last=n-1;
      if(n%2!=0)
      {
      while(first!=last)
      {
        if(arr[first]==arr[last])
          flag=1;
        else
          flag=0;
        first++;
        last--;
      }
      }
      else
      {
        while(last-first>=2)
          {
        if(arr[first]==arr[last])
          flag=1;
        else
          flag=0;
        first++;
        last--;
      }
      }
      if(flag==1)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}