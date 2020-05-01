package myLogic;

import sun.security.util.Length;

public class MyAssignmentThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern();

		String[] name = { "ok", "pk", "dk", "ck", "ok", "pk", "ok", "lk", "ok" };

		countWordOK(name);
		countWord(name, "pk");
	}

	public static void countWordOK(String[] arr) {

		int count = 0;

		for (int l = 0; l < arr.length; l++) {
			if (arr[l] == "ok") {
				count++;
							}

		}

		System.out.println("Total count of Ok is " + count);

	}

	public static void countWord(String[] arr, String word) {

		int i = 0;
		for (int s = 0; s < arr.length; s++) {
			if (arr[s] == word)

			{
				i++;
			}

		}

		System.out.println("Total no. repetetion of " + word + " is " + i);

	}

	public static void MaxReoccurence(String[] arr) {

	}

	/*
	 * +++ ++ +
	 */

	public static void pattern() {
//		int i = 5;
//
//		for (int k = 4; k > 0; k--) {
//			if (k == 3) {
//				System.out.println("+++");
//
//			}
//			if (k == 2) {
//				System.out.println("++");
//			}
//			if (k==1) {
//				System.out.println("+");
//			}
//		
//		
//		}
		for (int j = 5; j > 0; j--) {

			for (int p = j; p > 0; p--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
