package myArray;

public class MyClass {

	static String v[] = { "Vaibhav", "Subhash", "Priti", "Pragya" };
	static String[] si = { "Subhash", "Pragya", "Prity", "Vaibhav" };
	static String[] s = { "Subhash", "Pragya", "Prity", "Vaibhav" };

	public static void main(String[] args) {
		for (int k = 0; k < si.length; k++) {
			System.out.println(si[k]);
		}

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			// System.out.println(Arrays.toString[s]);
		}
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}

}
