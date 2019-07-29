import java.util.Scanner;
import java.lang.String;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      int n=sc.nextInt();
      String str3=str1.replace(str1,str2);
      String[] res=str3.split(" ",n);
      for(String word: res)
        System.out.println(word);
    }
}