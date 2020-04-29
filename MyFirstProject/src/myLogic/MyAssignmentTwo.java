package myLogic;

public class MyAssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void leapYearV(int number) {

	}
	
	public static void leapYearP(int number) {
		if(number%4==0 && number%100==0 && number%400==0) {
			System.out.println(number+" is a leap year");
		}
		else {
			System.out.println(number+" is not a leap year");
		}
	}
	
	public static void determineTrainagleV(int a, int b , int c) {

	}
	
	public static void determineTrainagleP(int a, int b , int c) {
		if(a+b >c && b+c>a && c+a>b)
		{
			System.out.println("Yes it is a triangle");
		}
		else {
			System.out.println("No it is not a triangle");
		}
	}
	
	public static void printLeapYearP(int yearOne, int yearTwo ) {

	}
	
	public static void printLeapYearV(int yearOne, int yearTwo ) {

	}

	

}
