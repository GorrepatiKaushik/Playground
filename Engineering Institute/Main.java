import java.util.Scanner;

class Faculty
{
  public void salary(int baseSalary)
  {
    System.out.println("Base Salary: "+baseSalary);
  }
}
class CSE extends Faculty
{
  public void salary(int baseSalary)
  {
    System.out.println("CSE Faculty: "+(baseSalary+3000));
  }
}
class IT extends CSE
{
  public void salary(int baseSalary)
  {
     System.out.println("IT Faculty: "+(baseSalary+5000));
  }
}
class ECE extends IT
{
  public void salary(int baseSalary)
  {
    System.out.println("ECE Faculty: "+(baseSalary+4500));
  }
}
class Main{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sal=sc.nextInt();
if(sal>0)
{
Faculty f=new Faculty();
f.salary(sal);
CSE c=new CSE();
c.salary(sal);
IT i=new IT();
i.salary(sal);
ECE e=new ECE();
e.salary(sal);
}
else
System.out.println("null");
}
}
