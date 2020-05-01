package myLogic;

public class MyAssignmentDayTwo910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tableCalculator(7, 2);
		calculator(7,3, "sum");
		calculator(7,3, "subtraction");
		calculator(7,3, "multiplication");
		calculator(7,3, "division");
		
		
	}
	

	public static void tableCalculator(int m, int n) {

		for (int k = 1; k <= m; k++) {
			System.out.println(k * n);
		}

	}

	public static void calculator(int num1, int num2, String operation) {
		if (operation == "sum")

		{
			int k = num1 + num2;
			System.out.println("Sum of the number is " + k);
		} else if (operation == "subtraction") {
			int k = num1 - num2;
			System.out.println("Subtraction of the number is " + k);
		}
		
		else if (operation == "multiplication") {
			int k = num1 * num2;
			System.out.println("Multiplication of the number is " + k);
		}
		
		else if (operation == "division") {
			int k = num1 / num2;
			System.out.println("division of the number is " + k);
		
		}
	}
}	
