/*
 * 2:Write a program to adddition of two numbers also addition of two characters.
 */

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,res1;
		char c1,c2;
		int res2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number");
		n1=sc.nextInt();
		System.out.println("Enter Second number");
		n2=sc.nextInt();
		res1=n1+n2;
		System.out.println("Addition of two number is "+res1);
		System.out.println("Enter First character");
		c1=sc.next().charAt(0);
		System.out.println("Enter Second character");
		c2=sc.next().charAt(0);
		res2=c1+c2;
		System.out.println("Addition of two characters is "+res2);
		sc.close();
	}

}
