
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0 ; //total
		double y  = 1; //fibNum
		double z ; //prev
		double total =0;
		double answer =0;
		while (x + y < 4000000){
			total = x + y;
			x=y;
			y=total;
			
			System.out.println(total);
			
			if(total %2 == 0)
			answer = total + answer;
			
			
		}
		
		System.out.println("Answer is : "+answer);
	}

}


