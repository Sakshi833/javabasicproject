package simple;
import java.util.Scanner;
class Teststock
{
	private long code;
	private int qty;
	private double price;
	private double total,discount,netPrice;
	
	Teststock(long n,int q,double p)
	{
		code=n;
		qty=q;
		price=p;
	}
	public void Compute()
	{
		total= qty*price;
		discount=total*0.25;
		netPrice=total-discount;
		
		
	}
	public void Display()

	{
		System.out.println("Display details of product");
		System.out.println("Code"+code);
		System.out.println("Price"+price);
		System.out.println("Toatl"+total);
		System.out.println("Discount"+discount);
		System.out.println("NetPrice"+netPrice);
	}
}

public class Stock {

	public static void main(String[] args) {
		
		TestStock s=new TestStock(101,5,5000.05);
		s.compute();
		s.Display();
	}

}
