/*
 * 4:Write a program to calculate power of a number.
 */

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int base,expo;
		int res=1;
		System.out.println("Enter Base value");
		base=sc.nextInt();
		System.out.println("Enter Exponential value");
		expo=sc.nextInt();
		
		while(expo!=0)
		{
			res=res*base;
			expo--;
		}
		
		System.out.println("Result is "+res);
		sc.close();
	}

}
