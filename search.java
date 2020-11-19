import java.util.*;
public class search
{
	public boolean search(int m[],int ns)
	{
		int i;
		boolean p = false;
		for (i=0;i<m.length;i++) 
		{
			if(m[i]==ns)
			{
				p = true;
			}	
		}
		return p;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i, ns;
		int m[] = new int[10];
		boolean y;
		search ob = new search();
		for (i=0;i<10;i++) 
		{
			System.out.println("Enter yoyr marks: ");
			m[i] = sc.nextInt();
		}
			System.out.println("Enter the number to be searched");
			ns = sc.nextInt();
			y = ob.search(m, ns);
			if(y == true){
				System.out.println("found");
			}
			else {
				System.out.println("Not found");
			}
	}
}
