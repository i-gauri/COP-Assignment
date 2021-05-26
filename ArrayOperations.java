/*
 * Write a program to create an array of integers and perform following operations on that array like 
finding the sum, average, maximum and minimum number in that array. Accept the numbers of the 
array from user.
 */

import java.util.Scanner;

public class ArrayOperations {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0, max, min, i;
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five elements");
		for (i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		for (i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum= " + sum);
		avg = sum / arr.length;
		System.out.println("Average =" + avg);

		max = arr[0];
		min = arr[0];

		for (i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			else if (arr[i] < min)
				min = arr[i];

		}

		System.out.println("Largest Number : " + max);
		System.out.println("Smallest Number : " + min);

		sc.close();

	}

}
