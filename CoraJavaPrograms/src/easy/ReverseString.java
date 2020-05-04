package easy;

//import java.util.Scanner;

/**
 * @author https://github.com/javalingappa
 *
 */
public class ReverseString {

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String input = "india";
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Input String \n");
		//input = sc.next();
		System.out.println("Input: " + input);
		System.out.println("Way-1: Reverse String using inbuilt method of StringBuilder reverse");
		System.out.println("Output: " + reverseString.reverseUsingStringInbuiltFunc(input));
		System.out.println("Way-2: Reverse String using inbuilt method toCharArray - Iterative way");
		System.out.println("Output: " + reverseString.reverseUsingCharArray(input));
		System.out.println("Way-3: Reverse String using recursive way");
		System.out.println("Output: " + reverseString.reverseUsingRecursiveFunc(input));
		sc.close();
	}

	public String reverseUsingStringInbuiltFunc(String input) {
		if (input == null || input.length() == 0 || input.length() == 1) {
			return input;
		}
		return new StringBuilder().append(input).reverse().toString();
	}

	public String reverseUsingCharArray(String input) {
		if (input == null || input.length() == 0 || input.length() == 1) {
			return input;
		}
		char[] chars = input.toCharArray();
		String output = "";
		for (int i = chars.length - 1; i >= 0; i--) {
			output = output + chars[i];
		}
		return output.trim();
	}

	public String reverseUsingRecursiveFunc(String input) {
		if (input == null || input.length() == 0) {
			return input;
		}
		return reverseUsingRecursiveFunc(input.substring(1)) + input.charAt(0);
	}

}
