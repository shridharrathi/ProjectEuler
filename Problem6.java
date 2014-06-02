
public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long max =100 ;
		 long sumOfSquare = calculateSumOfSquare(max);
		 long squareofSum = calculateSquareofSum(max);
		 
		 System.out.print(squareofSum - sumOfSquare);
	}

	private static long calculateSquareofSum(long max) {
		long sum = 0;
		for(long i=1; i<=max;i++)
		{
			sum = sum + i;
			
		}
		return sum * sum;
	}

	private static long calculateSumOfSquare(long max) {
		
		long sum = 0;
		for(long i=1; i<=max;i++)
		{
			sum = sum + (i*i);
			
		}
		return sum;
	}

}
