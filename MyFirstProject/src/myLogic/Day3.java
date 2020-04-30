package myLogic;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,5,6,8,9,10,5};
		getSecondLastNumber(array);
	}
	
	public static void getSecondLastNumber(int[] arr) {
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(i +"       "+ arr[i]);
		}
	}

}
