package conditionStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		int age = 85;
		if (age >= 18) {
			if (age <= 65) {
				System.out.println("elligible");}
			 else {
				System.out.println("Not elligible more age");}
			}
		 else {
			System.out.println("NOt elligible less age");
		}

	}
}
