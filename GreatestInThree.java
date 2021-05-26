
/*
 * 15:Write a program to find greatest of three numbers using nested if-else.
 */

import java.util.Scanner;

public class GreatestInThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter Second number");
		b = sc.nextInt();
		System.out.println("Enter Thrid number");
		c = sc.nextInt();

		if (a >= b && a >= c)
			System.out.println(a + " is the largest Number");

		else if (b >= a && b >= c)
			System.out.println(b + " is the largest Number");
		else

			System.out.println(c + " is the largest number");
		sc.close();
	}

}
