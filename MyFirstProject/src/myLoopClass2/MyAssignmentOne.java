package myLoopClass2;

public class MyAssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(28468, 3789698);
		reverse(7586574);
	}

	public static void sum(int i, int j) {
		// Vaibhav chnage only inside this method

		int addition = 0;
		addition = i + j;
		System.out.println("Sum of both number is " + addition);
	}

	public static void reverse(int number) {
		// Prity code goes here
		int rev = 0;
		while (number > 0) {
			int x = number % 10;// 4
			rev = rev * 10 + x;
			number = number / 10;
		}
		System.out.println("Reverse number is =" + rev);
	}

}
