/*
 * 3:Write function to swap two numbers.
 */

import java.util.Scanner;

public class SwapFun {

	public static void swap() {
		Scanner sc = new Scanner(System.in);
		int temp, a, b;
		System.out.println("Enter Two numbers");
		a = sc.nextInt();
		b = sc.nextInt();

		temp = a;
		a = b;
		b = temp;

		System.out.println("After Swapping " + a + " " + b);
		sc.close();
	}

	public static void main(String[] args) {
		swap();

	}

}
