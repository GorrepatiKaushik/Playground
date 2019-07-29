import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int list[]=new int[n];
    int i,pos=-1;
    for(i=0;i<n;i++)
      list[i]=sc.nextInt();
    int big=list[0];
    for(i=1;i<n;i++)
    {
      if(big<list[i])
      {
        big=list[i];
        pos=i;
      }
    }
    System.out.println(pos);
  }
}