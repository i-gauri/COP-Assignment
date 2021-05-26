
/*
 * 12: Write a  program to enter a number and print its reverse.
 */

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i, rev = 0;

		System.out.println("Enter number...");
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		while (n != 0) {
			i = n % 10;
			rev = rev * 10 + i;
			n = n / 10;

		}

		System.out.println("Reverse number is " + rev);
		sc.close();

	}

}
