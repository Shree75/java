import java.util.Scanner;

public class name {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ct[] = new String[10];
		String t = " ";
		int i, j;
		System.out.println(" Enter array elements: ");
		for(i = 0;i < 10;i++) {
			ct[i] = sc.nextLine();
		}
		for (i = 0;i < 9;i++) {
			for (j = 0;j < (9-i);j++) {
				if(ct[j].compareTo(ct[j+1]) > 0) {
					t = ct[j];
					ct[j] = ct[j+1];
					ct[j+1] = t;
				}
			}
		}
		for (i = 0;i < 10;i++) {
			System.out.println(ct[i]);
		}
	}
}