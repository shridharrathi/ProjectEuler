public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 600851475143L;
		long i = 2;
		while (i * i < n) {
			while (n % i == 0) {
				n = n / i;
			}
			i = i + 1;
		}

System.out.println("Answer is "+ n);
	}

}
