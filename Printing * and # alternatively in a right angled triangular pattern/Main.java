import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n=in.nextInt();
      int count=1;
      for(int row=1;row<=n;row++)
      {
        for(int col=1;col<=row;col++)
        {
          if(count%2!=0)
            System.out.print("*");
          else
            System.out.print("#");
          count++;
        }
        System.out.println();
      }
          
    }
}