import java.util.Scanner;
public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, t, min;
		int m[] = new int[10];
		for(i = 0;i < 10;i++) {
			System.out.println("Enter the numbers in the cell:");
			m[i] = sc.nextInt();
		}
		for(i = 0;i < 9;i++) {
			min = i;
			for(j = i+1;j < 10;j++) {
				if(m[j] < m[min])
					min = j;
			}
			t = m[i];
			m[i] = m[min];
			m[min] = t;
		}
		for (i = 0;i<10;i++) {
			System.out.println(m[i]);
			
		}
	}
}
