
/*
 * 6:Write a program to find factorial of a given number.
 */

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, fact = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number..");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial is " + fact);

		sc.close();
	}

}
