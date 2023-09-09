package basic;

public class Lcm {
	int Lcm(int num1, int num2)
	{
		int Lcm=0;
		int max=num1>num2?num1:num2;
		while(true)
		{
			if(max%num1==0 && max%num2==0)
			{
				Lcm=max;
				break;
			}
			max++;
		}
		return Lcm;
	}

	public static void main(String[] args) {
		int num1=6;
		int num2=8;
		int Lcm;
		Lcm ob=new Lcm();
		Lcm=ob.Lcm(num1,num2);
		System.out.println("Lcm of  number is:"+Lcm);

	}

}
