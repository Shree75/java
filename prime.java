import java.util.Scanner;

public class prime {

	int check(int n) {
		int i, c = 0, f = 0;
		for (i = 1;i <= n;i++) {
			if(n % i == 0)
				c += 1;
		}
		if(c == 2)
			f = 1;
		return(f);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, k;
		System.out.println("Enter Your Number: ");
		a = sc.nextInt();
		prime ob = new prime();
		k = ob.check(a);
		if(k == 1)
			System.out.println(a + " is a prime number");
		else
			System.out.println(a + " is not a prime number");
	}
}