import java.util.Scanner;
class Security {
	static String n;
	static int h;
	static double r, w;

	public void get(String name, int hour, double rate) {
		 n = name;
		 h = hour;
		 r = rate;
	}
	public void calwage() {
		if(h <= 40) 
			w = r * 40.0;
		if(h > 40 && h <= 60)
			w = (h-40) * 1.5 * r + 40 * r;
		if(h > 60)
			w = (h - 60) * 2 * r + 20 * 1.5 * r + 40 * r;
	}
	public void display() {
		System.out.println("Name" + "\t" + "Hours" + "\t" + "Wage");
		System.out.println(n + "\t" + h + "\t" + w);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.next();
		h = sc.nextInt();
		r = sc.nextDouble();
		Security ob = new Security();
		ob.get(n, h, r);
		ob.calwage();
		ob.display();
	}
}