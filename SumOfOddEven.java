
/*
 * 11:Write a  program to find sum of all even and odd numbers between 1 to n. 
 */

import java.util.Scanner;

public class SumOfOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, even = 0, odd = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number...");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)

				even = even + i;

			else
				odd = odd + i;

		}
		System.out.println("Sum of even numbers are " + even);
		System.out.println("Sum off odd numbers are " + odd);
		sc.close();
	}

}
