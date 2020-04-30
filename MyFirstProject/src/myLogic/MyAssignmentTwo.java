package myLogic;

public class MyAssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void leapYearV(int number) {
		if (number % 4 == 0)

		{
			System.out.println("Ohh Yes It's a leap year");
		} else {
			System.out.println("Sorry It's not a leap year");
		}
		
	}

	public static void leapYearP(int number) {
		if (number % 4 == 0 && number % 100 == 0 && number % 400 == 0) {
			System.out.println(number + " is a leap year");
		} else {
			System.out.println(number + " is not a leap year");
		}
	}

	public static void determineTrainagleV(int a, int b, int c) {
		if (a + b > c && b + c > a && c + a > b) {
			if (a == b && b == c && c == a) {

				System.out.println("It's a Equalateral Traingle");
			}

			else if (a == b || a == c || b == c) {
				System.out.println("It's Isosceles traingle");
			} else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
				System.out.println("It's a Right anglr traingle");
			} else if (a != b || b != c || c != a) {
				System.out.println("It's a Scalene traingle");
			}
		} else {
			System.out.println("It's not a traingle");
		}

	}

	public static void determineTrainagleP(int a, int b, int c) {
		if (a + b > c && b + c > a && c + a > b) {
			System.out.println("Yes it is a triangle");
		} else {
			System.out.println("No it is not a triangle");
		}
	}

	public static void printLeapYearP(int yearOne, int yearTwo) {
		int count = 0;
		for (int i = yearOne; i <= yearTwo; i++) {
			if (i % 4 == 0 && i % 100 == 0 && i % 400 == 0) {
				System.out.println(i + " is a leap year");
				count = 1;
				break;
			} else if (count == 0) {
				System.out.println(i + " is not a leap year");
			}
		}
	}

	public static void printLeapYearV(int yearOne, int yearTwo) {

	}

}
