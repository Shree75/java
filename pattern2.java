import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, p, k = 1;
		String st;
		System.out.println("Eneter a word to be print in a pattern: ");
		st = sc.next();
		b = st.length();
		System.out.println("The Pattern: ");
		for (a = b;a >= 0;a-- ) {
			for (p = 1;p <=k;p++) {
				System.out.print(" ");
			}
			System.out.println(st.substring(0, a));
			k++;
		}
	}
}