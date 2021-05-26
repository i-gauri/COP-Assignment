
/*
 * 7:Write a Java program , accept array ,accept number from user and  
 * find the index of number in array if present else show message not exist.
 */
import java.util.Scanner;

public class ArrayIndex {

	private static void check() {
		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		int value = 0;
		System.out.println("Enter the elements to check");
		value = sc.nextInt();

		for (int i = 0; i < 5; i++) {
			if (arr[i] == value) {

				System.out.println("Element is present at index " + i);

			} else if (i == -1)
				System.out.println("NOTE:Element does not exist");
		}

		sc.close();
	}

	public static void main(String[] args) {

		check();

	}
}
