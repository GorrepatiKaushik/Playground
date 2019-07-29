import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int arr[]=new int[n];
      int idarr[]=new int[k+1];
      int frarr[]=new int[n];
      int i,j;
      for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
      for(i=0;i<k;i++)
        frarr[i]=0;
      
      for(i=0;i<k;i++)
        idarr[i]=i+1;
      for(i=0;i<k;i++)
      {
        for(j=0;j<n;j++)
        {
          if(arr[j]==i+1)
            frarr[i]++;
        }
      }
      for(i=0;i<k;i++)
        System.out.println(idarr[i]+" "+frarr[i]);
            
        
      
        
    }
}
