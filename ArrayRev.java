/*
 * 6:Write a program which read aaray of 5 elements and print reverse array.
 */

import java.util.Scanner;

public class ArrayRev {

	public static void main(String[] args) {
		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Array in reverse order");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		sc.close();

	}

}
