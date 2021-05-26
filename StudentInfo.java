/*
 * 2:Write a program which will accept student information like rollno,name,5 subject marks.
 * calculate total and percentage.calculate grade.. 
           per >75 grade :A
           per<74 and >60 :B
           per<59  :C
 */


import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		int rollno, m1, m2, m3, m4, m5, total;
		String name;
		double percentage;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Roll number");
		rollno = sc.nextInt();
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter Physics marks");
		m1 = sc.nextInt();
		System.out.println("Enter Chrmistry marks");
		m2 = sc.nextInt();
		System.out.println("Enter Maths marks");
		m3 = sc.nextInt();
		System.out.println("Enter Biology marks");
		m4 = sc.nextInt();
		System.out.println("Enter English marks");
		m5 = sc.nextInt();

		System.out.println("-----Student Information-----");
		System.out.println("Roll Number: " + rollno);
		System.out.println("Name: " + name);
		System.out.println("Physics: " + m1);
		System.out.println("Chemistry: " + m2);
		System.out.println("Maths: " + m3);
		System.out.println("Biology: " + m4);
		System.out.println("English: " + m5);

		total = m1 + m2 + m3 + m4 + m5;
		percentage = total / 5;

		System.out.println("Total= " + total);
		System.out.println("Percentage= " + percentage);

		if (percentage > 75)
			System.out.println("Grade : A");
		else if (percentage < 74 && percentage > 60)
			System.out.println("Grade : B");
		else if (percentage < 59)
			System.out.println("Grade : C");
		else
			System.out.println("Grade : D");
		sc.close();
	}

}
