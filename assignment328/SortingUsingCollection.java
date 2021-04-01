package assignment328;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {

		String[] input = { "HCL", "Wipro", "Aspire Systems", "CTS" };
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

//		get the length of the array		
		int length = input.length;
//		sort the array		
		int size = length;

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < length; j++) {
//compares each elements of the array to all the remaining elements  
				if (input[i].compareTo(input[j]) > 0) {
//swapping array elements  
					String temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		System.out.println("input0: " + Arrays.toString(input));
		String[] input1 = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		Arrays.sort(input1);
		System.out.println("input1: " + Arrays.toString(input1));
//		Iterate it in the reverse order
		System.out.println("reversred array");
		for (int i = size - 1; i >= 0; i--) {
//			print the array
			System.out.print(input[i] + ", ");
		}


//		Required Output: Wipro, HCL , CTS, Aspire Systems

	}

}