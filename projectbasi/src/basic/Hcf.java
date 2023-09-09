package basic;

public class Hcf {
	int Hcf(int num1,int num2)
	{
		int Hcf1=1;
		for(int i=1;i<=num1 && i<=num2; i++)
		{
			if(num1%i==0 && num2%1==0)
			{
				Hcf1=i;
			}
		}
		return Hcf1;
	}
	
	

	public static void main(String[] args) {
		int num1=24;
		int num2=36;
		int Hcf;
		Hcf ob=new Hcf();
		Hcf=ob.Hcf(num1,num2);
		System.out.println("Hcf of number is:"+Hcf);

	}
}
