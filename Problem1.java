public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0;
		double number = 0;
		while (number < 1000) {
			if (number % 3 == 0)
				total = total + number;
			else if (number % 5 == 0)
				total = total + number;
			
			number++;
		}
		
		System.out.println("total is " + total);
	}

}
