import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String key=sc.nextLine();
    int i,j,count=0,n1,n2;
    n1=str.length();
    n2=key.length();
    for(i=0;i<=n1-n2;i++)
    {
      for(j=0;j<n2;j++)
        if(str.charAt(i+j)!=str.charAt(j))
          break;
      if(j==n2)
        count++;
    }
    System.out.println(count);
  
  } }