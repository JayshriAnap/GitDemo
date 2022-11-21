package conditionStatement;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		int month = 2;

		switch (month) {
		case 1:
			System.out.println("January"); // we can write program nprint in case
			break;
		case 2:
			System.out.println("February");
			System.out.println("Birthday Month");// we can add multiple comments
			break; // *interview imp if break output will be feb march
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		default:
			System.out.println("Please enter valid number");
		}

	}

}
