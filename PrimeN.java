
/*
 * 13:Write a  program to print all Prime numbers between 1 to n. 
 */

import java.util.Scanner;

public class PrimeN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		boolean flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			flag = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					flag = true;
			}
			if (flag == false) {
				System.out.println(i);
			}

		}
		sc.close();

	}

}
