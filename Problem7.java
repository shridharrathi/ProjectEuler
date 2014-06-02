
public class Problem7 extends Prime {
	public static void main(String[] args) {
		int limit = 10001;
		int count = 1; // as 2 will not be passed to isPrime()
		int number = 2;
				
		while (count < limit)
		{
			number++;
			if(isPrime(number))
				count++;
			
		}
		
		System.out.println(number);
		
		
	}
}
