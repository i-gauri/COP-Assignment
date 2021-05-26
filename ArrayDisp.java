/*
 * 
5:Write a program to accept array of 5 numbers and display it.
 */

import java.util.Scanner;

public class ArrayDisp {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five elements");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		sc.close();

	}

}
