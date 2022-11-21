package conditionStatement;

public class SwithCase1 {

	public static void main(String[] args) {
		double d =350.65, a = 250.55;
		char operation = '+';
		switch (operation) {
		case '+':
			System.out.println(d + a);
			break;     //if we not write break here it will execute next statement without checking condition
		case '-':
			System.out.println(d - a);
			break;

		case '*':
			System.out.println(d * a);
			break;
		case '/':
			System.out.println(a / d);
			break;
		case '%':
			System.out.println(d % a);
			break;

		default:
			System.out.println("Please add valid operation");

		}

	}

}
