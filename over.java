import java.util.Scanner;
public class over {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		String str1, str2, str;
		char b = 0;
		System.out.println("Enter a String: ");
		str = sc.nextLine();
		x = str.length();
		System.out.println("The piglatin for the given string string is: ");
		for(y = 0;y < x;y++) {
			b = str.charAt(y);
			if(b =='a'||b == 'e'||b == 'i'||b == 'o'||b == 'u')
				break;
	}
	str1 = str.substring(y, x);
	str2 = str.substring(0, y);
	System.out.println(str1 + str2 + "ay");
	}
}