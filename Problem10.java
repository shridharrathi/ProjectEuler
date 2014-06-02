
public class Problem10 extends Prime{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long limit = 2000000;
		long answer = 2;
		for (long i = 3; i < limit; i++){
			if(isPrime(i)){
				answer = answer + i;	
			}
			
		}
		System.out.println(answer);
	}

}
