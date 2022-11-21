package loops;

public class VowelPrint {

	public static void main(String[] args) {
		char ch = 'a';
		while(ch <= 'z' ) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') // if we want vowel
			System.out.println(ch);
			ch++;
		}
		
		char ch1 = 'A';
		while(ch1 <= 'Z' ) {
			System.out.println((int)ch1);
			ch1++;
		}
	}

}
