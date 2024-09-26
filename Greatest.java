package Assignment26;

import java.util.Scanner;

public class Greatest {
	private int a;
	private int b;
	private int c;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter 3 number");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	}

	public void checkgreatest() {
		int great = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("greatest number from three number is " + great);
	}

}
