/*
 * 4:Write functions for making addition of diffrent types(use FunctionOverloading);

 */

import java.util.Scanner;

public class AdditionFun {

	public static void add1() {
		Scanner sc = new Scanner(System.in);
		int a, b, sum;
		System.out.println("Enter Two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		sum = a + b;
		System.out.println("Addition = " + sum);
		sc.close();
		System.out.println("---------------");
	}

	public static void add(int a, double b) {
		double sum;
		sum = a + b;
		System.out.println("Addition = " + sum);
		System.out.println("----------------");
	}

	public static int add() {
		int a = 10, b = 30;
		int sum = a + b;

		System.out.println("Addition = " + sum);
		System.out.println("--------------");
		return sum;

	}

	public static double add(int a, int b, double c) {
		double sum;
		sum = a + b;
		System.out.println("Addition = " + sum);
		System.out.println("--------------");
		return sum;
	}

	public static void main(String[] args) {
		int a = add();
		System.out.println(a);
		int c = 10, d = 10;
		add(c, d);
		add1();
		int e = 55, f = 66;
		add(e, f);

	}

}
