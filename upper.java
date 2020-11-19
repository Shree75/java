import java.util.Scanner;

public class upper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = "";
		int i, p;
		char ch1, ch2;
		str = "" + str;
		p = str.length();
		for (i = 0;i < p;i++) {
			ch1 = str.charAt(i);
			if(ch1 == ' ') {
				ch2 = str.charAt(i + 1);
				str1 = str1 + ' ' + Character.toUpperCase(ch2);
				i++;
			} else {
				str1 += ch1;
			}
		}
		System.out.println(str1);
	}
}