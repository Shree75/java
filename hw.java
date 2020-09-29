import java.util.Scanner;
public class hw {
    public static void main(String ... args) {
        Scanner sc = new Scanner(System.in);
        hw ob = new hw();
        System.out.println("Enter a number and a character");
        int m = sc.nextInt();
        var ch = sc.next().charAt(0);
        System.out.println("Enter two numbers");
        var a = sc.nextInt();
        var b = sc.nextInt();
        ob.calculate(m, ch);
        ob.calculate(a, b, ch);
    }

    public void calculate(int l, char chr) {
        if (chr == 's') {
            if (l % 7 == 0) {
                System.out.println("Divisible by seven");
            }
        }
    }

    public void calculate(int x, int y, char str){
        if(str =='g'){
            if (x > y) {
                System.out.println("Greater number is: " + x);
            } else {
                System.out.println("Greater number is: " + y);
            }
        }
        else {
            if(x < y){
                System.out.println("Smaller integer is: " + x);
            }else {
                System.out.println("Smaller of integer is: "+ y);
            }
        }
    }
    
}
