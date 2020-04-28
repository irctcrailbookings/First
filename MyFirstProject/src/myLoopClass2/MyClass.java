package myLoopClass2;

public class MyClass {

	public static void main(String[] args) {
		int x = 0;
		// We can define multiple varibale in for loop
		for (int y = 0, j = 5, k = 8; y < 5; y++) {
			// Redeclaration of a variable in initialization block which is already define
			// is not possible.
			// Variables declared in the initialization block must be of same type
			System.out.println(k);
		}
		//System.out.println(k); //Variables in the loop are accessible only within
		for (int k = 0; k < 5; k++) {
			System.out.println(k);
		}

	}

}
