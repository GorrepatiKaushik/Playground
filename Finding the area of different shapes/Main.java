import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int ch=sc.nextInt();
      switch(ch)
      {
        case 1:
        { 
          int a=sc.nextInt();
        	System.out.println(a*a);
        	break;
        }
        case 2:{
          int a=sc.nextInt();
        	int b=sc.nextInt();
        	System.out.println(a*b);
        	break;
        }
        case 3:{
        int b=sc.nextInt();
        	int h=sc.nextInt();
        	System.out.println(0.5*b*h);
        	break;
        }
        case 4:{
        int a=sc.nextInt();
        	System.out.println(3.14*a*a);
        	break;
        }
      }
      
    }
  
}