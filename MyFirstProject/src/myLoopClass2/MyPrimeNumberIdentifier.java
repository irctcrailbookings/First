package myLoopClass2;


public class MyPrimeNumberIdentifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for (int num=2; num<=20; num++ )
		
	{
		int count = 0;
		for(int i=2; i<num;i++)
		{
			if (num%i==0)
			{
				count = count+1;
			}	
		}
		if(count==0)
		{
			System.out.println(num+"is a prime number");
		}
		else
		{
			System.out.println(num+"is not a prime number");
		}	
		
	}
}
}