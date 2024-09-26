package Assignment26;

import java.util.Scanner;

public class Grading {
	private int s1, s2, s3, avg;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter 3 subject marks");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		avg = (s1 + s2 + s3) / 3;
	}

	public void checkPass() {
		if (avg >= 60 && s1 > 40 && s2 > 40 && s3 > 40)
			System.out.println("Student is pass");
		else
			System.out.println("Student is not pass");
	}
}
