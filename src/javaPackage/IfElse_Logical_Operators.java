package javaPackage;

public class IfElse_Logical_Operators {

	public static void main(String[] args) {
		int age = 20;
		boolean hasTicket = true;

		if (age >= 18 && hasTicket) {
		    System.out.println("You can watch the movie.");
		} else {
		    System.out.println("You cannot watch the movie.");
		}
		
		int age1 = 17;
		boolean hasParentalConsent = true;

		if (age1 >= 18 || hasParentalConsent) {
		    System.out.println("You can participate in the activity.");
		} else {
		    System.out.println("You cannot participate in the activity.");
		}
		
		boolean isRainy = false;

		if (!isRainy) {
		    System.out.println("You can go outside without an umbrella.");
		} else {
		    System.out.println("You need an umbrella.");
		}
		
		int age11 = 20;
		String eligibility = (age11 >= 18) ? "Eligible to vote" : "Not eligible to vote";
		System.out.println(eligibility);

	}
	
	

}
