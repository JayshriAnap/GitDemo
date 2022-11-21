package conditionStatement;

public class NestedIfStatements {

	public static void main(String[] args) {
		long ageGroup = 20;
		if (ageGroup <= 55) {
			if (ageGroup >= 18 && ageGroup <= 55) {
				System.out.println("These people can take vaccine");
			}
		}
		if (ageGroup <= 18 && ageGroup >= 55) // both condition true then && execute otherwise no execution
			System.out.println("These people can't take vaccine");

	}

}
