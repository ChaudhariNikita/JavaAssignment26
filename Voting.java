package Assignment26;
import java.util.Scanner;
public class Voting {
private boolean isCitizen=true;
private int age;

Scanner sc=new Scanner(System.in);
public void accept()
{
	System.out.println("Enter age");
	age=sc.nextInt();
	}
public void checkVoting()
{
	if(isCitizen==true && age>=18)
		System.out.println("Eligible for voting");
	else
		System.out.println("Not Eligible for voting");
}
}
