import java.util.Scanner;
public class display {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        display ob = new display();
        System.out.println("Enter a sentence");
        String na = sc.nextLine();
        System.out.println("Enter 1 if uppecase else lower case");
        int a = sc.nextInt();
        System.out.println("Enter v for vowels eld=se consonants");
        char ch = sc.next().charAt(0);
        ob.dis(na, a);
        ob.dis(na, ch);
    }

    public void dis(String na, int b) {
        System.out.println();
            for (int i = 0; i <= na.length(); i++) {

                char ch = na.charAt(i);
                boolean a = Character.isUpperCase(ch);
                if (a && b == 1) {
                    System.out.print(ch + " ");
                } else if (b != 1 && !a) {
                    System.out.print(ch + " ");
                }
            }
        }
    }

    public void dis(String str, char chr) {

        str = str.toLowerCase();
        System.out.println();
    
            for(int i=0;i<=str.length();i++) {
                char ch = str.charAt(i);
                if((ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') && chr == 'v') {
                    System.out.print(ch + " ");
                }
                else if(chr != 'v' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    System.out.print(ch+" ");
                }
            }
        }
      