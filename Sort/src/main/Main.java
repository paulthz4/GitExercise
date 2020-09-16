package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/*
	 * This class asks the user if they want to sort numbers or a string, then sorts
	 * the input
	 */

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// asks user for input and call method for appropriate input
		int a;
		System.out.println("Are you sorting an array of numbers(n) or a string(s)? (n/s)");
		String str = in.next();
		if (str.contains("n")) {
			System.out.println("How long is your array?");
			a = in.nextInt();
			intSort(a);
		} else {
			stringSort();
		}

	}
	//this passes the test
	// sorts numbers
	public static String intSort(int a) {
		int[] b = new int[a];
		for (int i = 0; i < a; i++) {
			System.out.println("Enter a number");
			b[i] = in.nextInt();
		}
		Arrays.sort(b);
		System.out.printf("Sorted array : %s \n", Arrays.toString(b));
		return "Sorted array: "+Arrays.toString(b);
	}
	//this passes the test
	// sorts a string input
	public static String stringSort() {
		System.out.println("Enter your string:");
		String c = in.next();
		char[] z = c.toCharArray();
		Arrays.sort(z);
		System.out.println("Sorted array: " + Arrays.toString(z));
		return "Sorted array: "+Arrays.toString(z);
	}

}
