package myLoopClass2;

public class MyIfBloack {

	public static void main(String[] args) {
		String variable = "odd";
		for (int i = 0; i <= 20; i++) {
			if (i > 0) {
				if ((i % 2 == 0) && variable.equalsIgnoreCase("even")) {
					System.out.println(i);
				} else {
					if (variable.equalsIgnoreCase("odd") && (i % 2 != 0)) {
						System.out.println(i);
					}
				}
			}
		}

	}

}
