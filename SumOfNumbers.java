
/*
 * 
9:Sum of series :
	1+2+3+….+n
 */

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		System.out.println("Enter number");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum is " + sum);
		sc.close();

	}

}
