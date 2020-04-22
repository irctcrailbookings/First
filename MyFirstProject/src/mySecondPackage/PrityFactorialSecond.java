package mySecondPackage;

import java.util.Scanner;

public class PrityFactorialSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adding an extra line to commit 
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a number of your choice");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact= fact*i;
		}
		System.out.println("Factorial of "+n+ " 5is= " +fact);
		
	}

}
