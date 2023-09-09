package basic;
//coprime whoes hcf is 1
public class coprime {
	
	 void findCoprime(int num1,int num2)
	 {
		
		int hcf=0;
		for(int i=1;i<=num1 && i<=num2;i++)
		{
			if((num1%i==0) && (num2%i==0))
			{
				hcf=i;
			}
		}
		if(hcf==1)

	System.out.println("Number is coprime");
		else
			System.out.println("Number is  not coprime");	
	}
	public static void main(String[] args) {
		int num1=13,num2=15;
		new coprime().findCoprime(13,15);
	}
}
