package basic;

public class PatternProg {

	public static void main(String[] args) {
		int n=5;
		int i,j;
		
		for(i=1,i<=n,i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print((i%2)+"");
				
			}
			System.out.println();
		}

	}

}
