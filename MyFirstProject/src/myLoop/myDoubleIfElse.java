package myLoop;

public class myDoubleIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String variable = "Odd";

		for (int i = 0; i <= 20; i++) {
			if (i > 0)

				if (i % 2 == 0 && variable.equalsIgnoreCase("Even")) {
					System.out.println(i);
				} else {
					if (i % 2 != 0 && variable.equalsIgnoreCase("Odd")) {
						System.out.println(i);
					}
				}
		}
	}

}
