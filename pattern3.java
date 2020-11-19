import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, p;
		String st;
		System.out.println("Enter A String");
		st = sc.next();
		p = st.length();
		for (a = 0;a < p;a++) {
			System.out.print(st.substring(a, p));
			System.out.print(st.substring(0, a));
			System.out.println();
		}
	}
}