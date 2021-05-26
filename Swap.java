
/*
 * 5:Write a program to swap two numbers.
 */

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, temp;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers ");
		a = sc.nextInt();
		b = sc.nextInt();

		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping: " + a + "   " + b);
		sc.close();

	}

}
