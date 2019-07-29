
//import required packages here
import java.util.Scanner;
class Item
{
  public int price;
  //create various method to return attribute value(s)
  public void setPrice(int n)
  {
    price=n;
  }
  public int getPrice()
  {
    return price;
  }
}
   
class Customer
{
  private String product;
  public int quantity;
  //create various method to return attribute value(s)
   public void setProduct(String s)
  {
    product=s;
  }
   public String getProduct()
  {
    return product;
  }
   public void setQuantity(int n)
  {
    quantity=n;
  }
   public int setQuantity()
  {
    return quantity;
  }
}

class Bill
{
  //implement your logic to calculate total price
  Customer c;
  Item i;
  public void calBill(Item i,Customer c)
  {
   this.c=c;
    this.i=i;
    System.out.println("Total Price is : "+(i.price*c.quantity));
  }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    Scanner sc=new Scanner(System.in);
      String name=sc.nextLine();
    c.setProduct(name);
    int price=sc.nextInt();
    i.setPrice(price);
    int q=sc.nextInt();
    c.setQuantity(q);
    obj.calBill(i,c);
    
  }
}