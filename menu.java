import java.util.Scanner;

public class menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[] = new int[20];
		int s, i, j;
		System.out.println("Enter integer numbers");

		for(i = 0; i < 20; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter your choice");
		int n = sc.nextInt();
		switch(n) {
			case 1:
				for(i = 0; i < 20; i++) {
					s = 0;
					for(j = 1; j < a[i]; j++) {
						if(a[i] % j == 0)
							s += j;
					}
						if(s == a[i])
							System.out.println(a[i]);
				}
			break;

			case 2:
				for(i = 0; i < 20; i++) {
					if(a[i] % 7 == 0 || a[i] % 10 == 0)
						System.out.println(a[i]);
				}   
			break;

			default:
			System.out.println("Invalid Choice");
		}
	}
}