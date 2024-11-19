package pg4;
import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter a number:");
		int number=scanner.nextInt();
		if(number>0) {
			System.out.println("the number is positive.");
		}
		else if(number<0) {
			System.out.println("the number is negative.");
		}
		else {
			System.out.println("the number is zero.");
		}
	}
}
		