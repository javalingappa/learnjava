package easy;

import java.util.Arrays;
import java.util.Collections;

public class FindKthLargestOrSmallElementsInArray {

	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 1, 3, 2, 4, 6, 8, 7, 5 };
		int k = 3;
		display(largestOrSmallestKthElements(arr, k, false),"The Smallest");
		System.out.println();
		display(largestOrSmallestKthElements(arr, k, true), "The Largest");
	}

	private static void display(Integer[] array,String type) {
		System.out.print(type+" "+ array.length + " (k-th) sorted elements are : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static Integer[] largestOrSmallestKthElements(Integer[] input, int k, boolean isLargest) {
	
		if (input != null && input.length < k) {
			System.out.println("Array elements " + input.length + " are lesser than kth  " + k + " required elements");
			return null;
		} else if (input.length == k) {
			if (isLargest) {
				Arrays.sort(input, Collections.reverseOrder());
			} else {
				Arrays.sort(input);
			}
			return input;
		} else {
			Integer[] ret = new Integer[k];
			if (isLargest) {
				Arrays.sort(input, Collections.reverseOrder());
			} else {
				Arrays.sort(input);
			}
			for (int i = 0; i < k; i++) {
				ret[i] = input[i];
			}
			return ret;
		}
	}

}
