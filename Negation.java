package Assignment26;

import java.util.Scanner;

public class Negation {
	private int no;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter number");
		no = sc.nextInt();
	}

	public void checkValidation() {
		if (!(no>=10 && no<=20))
			System.out.println("no is " + no);
		else
			System.out.println("No is between 10 to 20");
	}
}
