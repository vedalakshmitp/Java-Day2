package pg4;

public class NestedIf {

	public static void main(String[] args) {
		int number=10;
		if(number<=10)
		{
			if(number==5)
			{
				System.out.println("number is equal to 5");
			}
			else
			{
				System.out.println("number is not equal to 5");
			}
		}
		else
		{
			System.out.println("number is greater than 10");
		}
	}
}
			