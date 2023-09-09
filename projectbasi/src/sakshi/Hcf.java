package sakshi;
import java.util.Scanner;
/*public class VowelOrConsonant {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabet in the vowel");
		ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+"is a vowel");
		}
		else
		{
			System.out.println(ch+"is a consonant");
		}
		

	}

}
*/
/*public class VowelOrConsonant{
	public static void main(String[]args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabets in the vowel");
		ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+"is a vowel");
		}
		else
		{
			System.out.println(ch+"is a consonant");
		}
				
	}
}*/
public class Hcf
{
	int hcf(int num1,int num2) {
		int hcf=1;
		for(int i=1;i<=num1&&i<num2;i++)
		{
			if(num1%i==0&&num2%i==0)
			{
				hcf=i;
			}
		}
		return hcf;
	}
	public static void main(String[]args)
	{
		int num1=24,num2=36,hcf;
		
		TestLcm ob=new TestLcm();
		hcf=ob.hcf(num1,num2);
		System.out.println("hcf of a number:"+hcf);
		
		
		
	}
		
	}
