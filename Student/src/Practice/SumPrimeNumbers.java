package Practice;

public class SumPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0, result;
		boolean b = false;
		
		for (int i = 1; i<=100; i++)
		{
			b = false;
			// identify prime number
			for (int j=2; j<i; j++)
			{
				result = i%j;
				if (result == 0)
					b = true;
			}
			// sum prime number
			if (b == false && i!=1) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of prime numbers between 1 to 100 : " + sum);
	}

}
