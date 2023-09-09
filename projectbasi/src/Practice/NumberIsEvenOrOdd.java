//Java program to check Even Or Odd Integers
package Practice;
import java.util.Scanner;  //package import
public class NumberIsEvenOrOdd {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in); //
		System.out.println("Enter the Integer:");
		x=sc.nextInt();    //Scanner class have nextInt type method through this it i/p the integer value
		if(x%2==0)// 28  if the number is divisible by 2 and the reminder is 0 then the if will execute
		{
			System.out.println("Entered number is even.");//true= the body if is executed
		}         
		else      //23  if the number is divisible by 2 but the reminder if we not get 0 then else is executed
		{
			System.out.println("Entered number is Odd.");//false=the body of else executed
		}

	}

}


/*if...else=for decision making.
     when we may need to run a block of code among multiple alternatives.
     e.g- 
         Assigning grades A,B,C based on the marks obtained by the student.
     Syntax-
         if(testCondition)
         {
            //body of if
         }
         else
         {
             //body of else
         }
*/