package session2;

import java.util.Scanner;

public class Askandcapture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("what is your name");
		Scanner SysIn = new Scanner (System.in);
		Scanner SysIn2 = new Scanner (System.in);
		String name = SysIn.nextLine();
		System.out.println("hi, "+ name);
		System.out.println("how old are you?");
		int age = SysIn2.nextInt();
		System.out.println("what is your gender?");
		String gender = SysIn.nextLine();
		System.out.println("where are you from?");
		String location = SysIn.nextLine();
		System.out.println("I am from "+ location);
		System.out.println("where do you live now?");
		String state = SysIn.nextLine();
		System.out.println("where do you work?");
		String work = SysIn.nextLine();
		System.out.println("what is your salary?");
		String salary = SysIn.nextLine();
		System.out.println("how much raise are you getting next year?");
		String raise = SysIn.nextLine();
		
		System.out.println("Hello");
		System.out.println("my name is Jesus. I am 33 years old, male.\n"
				
				+ "I work at TechFios as Devops Engineer. \n"
				+ "I currently live in Texas. I am from El Salvador \n"
				+ "I make 90,000 dollar. I will get 7,000 as annual raise \n"
				+ "so  my total salary would be 97,000 dollar next year." );
	}

}
