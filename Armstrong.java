
/*
 * 14:Write a program to check entered number is Armstrong number or not.
 */

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n, t, sum = 0, i;
		System.out.println("Enter the number...");
		n = sc.nextInt();
		t = n;

		while (n > 0) {
			i = n % 10;
			sum = sum + (i * i * i);
			n = n / 10;
		}
		if (t == sum)
			System.out.println("Given number is armstrong number");
		else
			System.out.println("Given number is not armstrong number");
		sc.close();
	}

}
