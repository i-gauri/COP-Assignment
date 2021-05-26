/*
 * 10: Write a  program to input basic salary of an employee and calculate its Gross salary according to 
following: Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95%
 */

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		float basic_salary, da, hra, GrossPayment;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Basic Salary Of Employee: ");
		basic_salary = scan.nextFloat();

		if (basic_salary <= 10000) {
			da = (float) (basic_salary * 0.8);
			hra = (float) (basic_salary * 0.2);
		}

		else if (basic_salary <= 20000) {
			da = (float) (basic_salary * 0.9);
			hra = (float) (basic_salary * 0.25);
		} else {
			da = (float) (basic_salary * 0.95);
			hra = (float) (basic_salary * 0.3);
		}

		GrossPayment = basic_salary + da + hra;

		System.out.println("Gross Salary Of Employee: " + GrossPayment);
		scan.close();

	}

}
