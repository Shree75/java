import java.util.Scanner;

public class pallindrome {

	int reverse(int n) {
		int d, r = 0;
		do {
			d = n % 10;
			r = r * 10 + d;
			n /= 10;
		}
		while(n != 0);
		return(r);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k, a, c;
		pallindrome ob = new pallindrome();
		System.out.println("Enter your number: ");
		a = sc.nextInt();
		c = a;
		k = ob.reverse(a);
		if(k == c)
			System.out.println(c);
		else
			System.out.println("Not a Palindrome");
	}
}