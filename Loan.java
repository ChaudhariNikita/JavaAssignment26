package Assignment26;

import java.util.Scanner;

public class Loan {
	private int age;
	private int income;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter age and income");
		age = sc.nextInt();
		income = sc.nextInt();
	}

	public void checkLoan() {
		if (age >= 18 && age <= 60 && income <= 25000)
			System.out.println("Eligible for loan");
		else
			System.out.println("Not eligible for loan");
	}

	public void display() {
		System.out.println("Age =" + age);
		System.out.println("Income=" + income);
	}
}
