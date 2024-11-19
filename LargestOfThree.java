package pg4;
import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter first number:");
		int num1=scanner.nextInt();
		System.out.print("enter second number:");
		int num2=scanner.nextInt();
		System.out.print("enter third number:");
		int num3=scanner.nextInt();
		int largest=(num1>num2)?
				(num1>num3?num2:num3):
					(num2>num3?num2:num3);
		System.out.println("The largest of the three number is:"+largest);
	}
}
		
		 
		