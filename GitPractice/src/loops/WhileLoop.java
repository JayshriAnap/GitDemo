package loops;

public class WhileLoop {  //entry control loop
	
	public static void whileLoopPractice() {
		long b = 1;
		while(b <= 30) {
			System.out.println(b);
			b = b + 2;
		}
	}
	

	public static void main(String[] args) {
		long a = 2;
		while(a <= 20) {
			System.out.println(a);
			a = a + 2;
		}
		System.out.println("********************************");
		WhileLoop.whileLoopPractice();
		
		
	}

}
