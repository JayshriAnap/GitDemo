package conditionStatement;

public class IfElseLadder {

	public static void main(String[] args) {
		int marks = 55;
		if (marks >= 75) {
			System.out.println("Distintion");
		} else if (marks >= 65) {
			System.out.println("First Class");
		} else if (marks >= 55) {
			System.out.println("Second Class");
		} else if (marks >= 35) {
			System.out.println("Pass Class");
		} else {
			System.out.println("Failed");
		}
	}
}
