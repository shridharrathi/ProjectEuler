public class Problem9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for (long a = 100; a < 9978; a++) {
			for (long b = a + 1; b < 998; b++) {
				if (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) % 1 == 0
						&& (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a + b == 1000)) {
					flag = true;
					System.out.println((long) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) * a * b);
					break;
				}
			}

			if (flag)

				break;
		}

	}

}
