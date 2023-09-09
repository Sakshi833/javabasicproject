package basic;

public class array {

	public static void main(String[] args) {
		int[][] data= {{2,3},{5,6},{7,5,6}};
		for(int[]inner:data) {
			for(int value: inner) {
				System.out.println(value);
			}
		}

	}

}
