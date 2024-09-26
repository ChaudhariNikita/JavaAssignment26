package Assignment26;

import java.util.Scanner;

public class Job {
	private boolean isBachleorsDegree;
	private boolean isExperience;
	private boolean isCriminalRecord;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("you will complete Bachlors degree");
		isBachleorsDegree = sc.nextBoolean();
		System.out.println("you have an experience");
		isExperience = sc.nextBoolean();
		System.out.println("your criminal record is clear");
		isCriminalRecord = sc.nextBoolean();
	}

	public void checkEligibility() {
		if ((isBachleorsDegree == true || isExperience == true) && (isCriminalRecord == true))
			System.out.println("person is eligible for job");
		else
			System.out.println("Person is not eligible for job");

	}
}
