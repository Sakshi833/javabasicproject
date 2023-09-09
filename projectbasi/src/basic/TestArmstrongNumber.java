package basic;

/*public class TestArmstrongNumber {
	int digitcount(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
			
		}
		return count;
		
	}
	int power(int digit,int count)
	{
		int result=1;
		for(int i=1;i<=count;i++)
		{
			result*=digit;
		}
		return result;
	}
	void findArmstrong(int num)
	{
		int count=digitcount(num);
		int sum=0;
		int m=num;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+power(digit,count);
			num/=10;
		}
		if(sum==m)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
	}

	public static void main(String[] args) {
		TestArmstrongNumber Ob=new TestArmstrongNumber();
		Ob.findArmstrong(153);
		Ob.findArmstrong(151);
		Ob.findArmstrong(1634);

	}

}*/
/*public class TestArmstrongNumber {
	int digitcount(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
			
		}
		return count;
		
	}
	int power(int digit,int count)
	{
		int result=1;
		for(int i=1;i<=count;i++)
		{
			result*=digit;
		}
		return result;
	}
	void findArmstrong(int l,int u)
	{
		int count=digitcount(num);
		int sum=0;
		int m=num;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+power(digit,count);
			num/=10;
		}
		if(sum==m)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
	}

	public static void main(String[] args) {
		TestArmstrongNumber Ob=new TestArmstrongNumber();
		Ob.findArmstrong(153);
		Ob.findArmstrong(151);
		Ob.findArmstrong(1634);

	}

}
*/