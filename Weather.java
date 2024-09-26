package Assignment26;

import java.util.Scanner;

public class Weather {
	private int temp;
	private boolean isRainy;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter the temperature and weather is rainy");
		temp = sc.nextInt();
		isRainy = sc.nextBoolean();
	}

	public void checkCondition() {
		if (temp <= 20 && temp >= 30 && isRainy == false) {
			System.out.println("it's safe to go outside");
			System.out.println("It should not be rainy");
		} else {
			System.out.println("Not safe to go outside");
			System.out.println("It should be rainy");
		}

	}

}
