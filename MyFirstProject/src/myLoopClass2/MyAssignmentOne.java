package myLoopClass2;

public class MyAssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum(28468, 3789698);
		// prityReverse(7586574);
		// reverseMethod(347);
		swap(3, 5);
	}

	public static void swap(int i, int j) {
		int c = i;
		i = j;
		j = c;
		System.out.println("int i: " + i);
		System.out.println("int j: " + j);
	}

	public static void reverseMethod(int number) {
		// Prity code goes here
		int reverse = 0;
		int length = (number + "").length(); // (7586574+"")= 7586574.length()
		for (int i = 0; i < length; i++) {
			int x = number % 10;
			reverse = (reverse * 10) + x; // 7, 70+4 = 74, 740+3 = 743
			number = number / 10;

		}
		System.out.println(reverse);

	}

	public static void sum(int i, int j) {
		// Vaibhav chnage only inside this method

		int addition = 0;
		addition = i + j;
		System.out.println("Sum of both number is " + addition);
	}

	// 7586574
	public static void prityReverse(int number) {
		// Prity code goes here
		int rev = 0;
		while (number > 0) {
			int x = number % 10;// 7
			rev = rev * 10 + x; // 47 *10 +7 = 475
			number = number / 10; // 7586574/10 = 758657
		}
		System.out.println("Reverse number is =" + rev);
	}

	public static void primeOrnotVaibhav(int number) {

	}

	public static void primeOrnotPrity(int number) {

	}

}
