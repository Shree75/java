import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Eneter a word to be print in a pattern: ");
		String st = sc.next();
		b = st.length();
		System.out.println("The Pattern: ");
		for (a=0;a<=b;a++) {
			System.out.println(st.substring(0, a));
		}
	}
}