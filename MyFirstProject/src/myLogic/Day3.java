package myLogic;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,5,6,8,9,10,5};
		//getSecondLastNumber(array);
		prime(67);
	}
	
	public static void getSecondLastNumber(int[] arr) {
		int j = -1;
		for(int k =0; k <arr.length; k++) {
			
			if(k == arr.length-1) {
				System.out.println(arr[j]);
			}
			j++;
		}
		
	}
	
	public static void prime(int number) {
		int count = 0;
		for(int i = 2; i <=number; i++) {
			if(number%i ==0) {
				count++;
			}
		}
		
		if(count==1 || number == 1) {
			System.out.println("It is a prime number");
		}
		
		
	}


}
