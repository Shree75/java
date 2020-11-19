import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, k=0, p=0, ns, lb=0, ub=9;
		int m[] = new int[10];
		for(i = 0;i < 10;i++) {
			System.out.println("Enter the numbers in the cell: ");
			m[i] = sc.nextInt();
		}
		System.out.println("Enter the number to be searched: ");
		ns = sc.nextInt();
		while(lb <= ub) {
			p = (lb + ub)/2;
			if(m[p] < ns) 
				lb = p + 1;
			if(m[p] > ns)
				ub = p - 1;
			if(m[p] == ns) {
				k = 1;
				break;
			} 
		}
		if(k == 1)
			System.out.println("Search Succesful");
		else
			System.out.println("Search UnSuccesful");
	}
}