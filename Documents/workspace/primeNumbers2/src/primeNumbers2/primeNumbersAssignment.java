package primeNumbers2;

public class primeNumbersAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prime_Numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int loopLimit = prime_Numbers.length;
		for (int i = 0; i < loopLimit; i++) {
			boolean isPrime = true;
			if (prime_Numbers[i] == 1)

				isPrime = false;
			else {
				// check to see if the numbers are prime
				for (int j = 2; j <= prime_Numbers[i] / 2; j++)
				{
					if (prime_Numbers[i] % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime){
				if (prime_Numbers[i] == 0){}
				else {
					System.out.print(prime_Numbers[i] + " , ");
				}
			}}
		System.out.println(" Are the prime numbers in the array ");
		}


	}


