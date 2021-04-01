package assignment328;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static String removeDuplicates(String input) {
		String result = "";

		char[] charArray = input.toCharArray();
		Set<Character> chart = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if (chart.add(charArray[i])) {
				result += (charArray[i]);
System.out.println(charArray[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "PayPal India";
		System.out.println(removeDuplicates(st));
	}

}
