import java.util.Scanner;
public class test3 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[20];
		int n, s, i, j;
		System.out.println("Enter the integer numbers");
		for(i = 0;i < 20;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Menu Items: ");
		System.out.println("1. To Dislay All The Perfect Numbers: ");
		System.out.println("2. To Dislay All The Buzz Numbers: ");
		System.out.println("Enter Your Choice: ");
		n = sc.nextInt();
		switch(n) {
			case 1:
				for(i = 0;i < 20;i++) {
					s = 0;
					for(j = 0;j < a[i];j++) {
						if(a[i] % j == 0)
							s += j;
					}
					if(s == a[i])
						System.out.println(a[i]);
				}
			break;

			case 2:
				for(i = 0; i < 20; i++) {

					if(a[i] % 7 == 0 || a[i] % 10 == 7)
						System.out.println(a[i]);
				}
		
			
			break;

			default:
				System.out.println("Invalid Choice");
			}
	}
}