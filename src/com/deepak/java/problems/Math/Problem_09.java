package com.deepak.java.problems.Math;

/**
 * Find if a given number is a palindrome
 * 
 * @author Deepak
 */
public class Problem_09 {

	/**
	 * Method to check if a given number is a palindrome
	 * 
	 * @param n
	 * @return {@link boolean}
	 */
	public static boolean isPalindrome(int n) {
		return n == reverse(n);
	}

	/**
	 * Method to find the reverse of a number 
	 * 
	 * @param n
	 * @return {@link int}
	 */
	private static int reverse(int n) {
		/* Already explained in previous porgram */
		int x = Math.abs(n);
		int result = 0;
		while (x != 0) {
			result = (result * 10) + (x % 10);
			x = x/10;
		}
		if (n < 0) {
			result *= -1;
		}
		if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
			return 0;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(2332));
		System.out.println(isPalindrome(1234));
	}

}
