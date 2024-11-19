package pg4;
import java.util.Scanner;
public class MarksValidation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter marks:");
		int marks=scanner.nextInt();
		if(marks>=81 && marks<=100) {
			System.out.println("Distinction");
		}else if(marks>=60 && marks<=80) {
			System.out.println("First Class");
		}else if(marks>=49 && marks<=59) {
			System.out.println("Second Class");
		}else if(marks>=35 && marks<=48) {
			System.out.println("Pass");
		}else if(marks>=0 && marks<=34) {
			System.out.println("Fail");
		}else {
			System.out.println("invalid marks");}
		scanner.close();
	}
}
		