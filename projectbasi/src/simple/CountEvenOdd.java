package simple;

public class CountEvenOdd {

	public static void main(String[] args) {
		int arr[]= {11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		int even=0,odd=0;
		
		for(int i=0;i<20;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
				
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Contents of the array:");
		for(int i=0;i<20;i++)
		{
			System.out.print(arr[i]+"");
			
		}
		System.out.println("\nTotal Even numbers:"+even);
		System.out.println("\nTotal odd numbers:"+odd);
	

	}

}
