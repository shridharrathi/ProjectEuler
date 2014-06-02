import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> pal = new ArrayList<Integer>();
		for (int i = 999; i > 100; i--) {
			for (int j = i; j > 100; j--) {
				// System.out.println(i + " ,  " + j);
				if (checkPalindrome("" + (i * j))) {
					//System.out.println(i + " ,  " + j + " " + i * j);
					pal.add(i * j);
				}
			}

		}
		Collections.sort(pal);
		System.out.println(pal.get(pal.size() - 1));
	}

	private static boolean checkPalindrome(String num) {
		
		double len = num.length();
		for (int i = 0; i < len / 2; i++) {
			if (num.charAt(i) == num.charAt((int) (len - i - 1))) {
				continue;
			} else
				return false;
		}
		return true;

	}

}
