package pg4;
import java.util.Scanner;

public class MaxOfTwo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("enter first number:");
		int num1=scanner.nextInt();
		System.out.print("enter second number:");
		int num2=scanner.nextInt();
		int max=(num1>num2)?
				num1:num2;
		System.out.println("the maximum of the two numbers is:"+max);
	}
}
				
	 

	


