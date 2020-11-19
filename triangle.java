import java.util.Scanner;

public class triangle {

	public double area(double a, double b, double c) {
		double s, ar;
		s = (a + b + c)/2;
		ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return(ar);
	}
	public double area(int a, int b, int height) {
		double ar;
		ar = 1.0/2.0 * height * (a + b);
		return(ar);
	}
	public double area(double diagonal1, double diagonal2) {
		double ar;
		ar = 1.0/2.0 * (diagonal1 * diagonal2);
		return(ar);
	}
}

