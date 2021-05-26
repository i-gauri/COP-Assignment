
/*
Write a menu driven program for stationary shop.Items are 1:Pen 2:Pencil 3:NoteBook 4:Bottle 5:ColorBox.
1 pen cost is 10Rs,Pencil is 5 rs.NoteBook is 20 rs Bottle is 30 rs and ColorBox is at 50 Rs.
Calculate Total of all purchased items. 
*/
import java.util.Scanner;

public class GroceryShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("-----------Menu-------------");
		System.out.println("1.Pen");
		System.out.println("2.Pencil");
		System.out.println("3.Notebook");
		System.out.println("4.Bottle");
		System.out.println("5.Colorbox");
		System.out.println("6.Exit");

		int choice, quant, price1 = 0, price2 = 0, price3 = 0, price4 = 0, price5 = 0;
		boolean flag = false;
		while (flag != true) {
			System.out.println("Enter Choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter quantity of Pen");
				quant = sc.nextInt();
				price1 = quant * 10;
				break;
			case 2:
				System.out.println("Enter quantity of Pencil");
				quant = sc.nextInt();
				price2 = quant * 5;

				break;
			case 3:
				System.out.println("Enter quantity of Notebook");
				quant = sc.nextInt();
				price3 = quant * 20;

				break;
			case 4:
				System.out.println("Enter quantity of Bottle");
				quant = sc.nextInt();
				price4 = quant * 30;
				break;
			case 5:
				System.out.println("Enter quantity of Colorbox");
				quant = sc.nextInt();
				price5 = quant * 50;
				break;

			case 6:
				flag = true;
				break;

			}

		}
		int total = price1 + price2 + price3 + price4 + price5;
		System.out.println("Total of all perchased item :" + total);
		sc.close();

	}

}
