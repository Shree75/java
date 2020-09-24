import java.util.Scanner;
public class area
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        area ob = new area();
        System.out.println("enter the base and height of ||gm respectively");
        double base = sc.nextDouble();
        double ht = sc.nextDouble();
        System.out.println("Enter the length of diagonals of rhombus:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Enter the parralel sides of trapezium and the perpendicular distance between them");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double p = sc.nextDouble();
        ob.ar(base, ht);
        ob.ar(d1, d2, 0.5);
        ob.ar(a, b, p, 0.5);
    }

	public void ar(double base, double ht)
    {
        System.out.println("the area of ||gm is: " + (base * ht));
    }

    public void ar(double d1, double d2, double d)
    {
        System.out.println("The area of rhombus: " + Math.round(d * d1 * d2));
    }

    public void ar(double a, double b, double p, double h)
    {
        System.out.println("The area of trapezium is: " + (h * (a + b) * p)); 
    }
}