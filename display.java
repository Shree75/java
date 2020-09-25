import java.util.Scanner;
public class display 
{
    public static void main(final String ... args)
    {
        final Scanner sc = new Scanner(System.in);
        final display ob = new display();
        System.out.println("Enter a sentence");
        final String na = sc.nextLine();
        System.out.println("Enter 1 if uppecase else lower case");
        final int a = sc.nextInt();
        System.out.println("Enter v for vowels eld=se consonants");
        final char ch = sc.next().charAt(0);
        ob.dis(na, a);
        ob.dis(na, ch);
    }

    public void dis(final String na, final int b)
    {
        System.out.println();
        try
        {
            for (int i = 0; i <= na.length(); i++) 
            {
                final char ch = na.charAt(i);
                final boolean a = Character.isUpperCase(ch);
                if (a && b == 1) {
                    System.out.print(ch + " ");
                } else if (b != 1 && !a) {
                    System.out.print(ch + " ");
                }
            }
        }
        catch(final StringIndexOutOfBoundsException e)
        {
            System.out.println("number exceeded");
        }
    }

    public void dis(String str, final char chr)
    {
        str = str.toLowerCase();
        System.out.println();
        try
        {
            for(int i=0;i<=str.length();i++)
            {
                final char ch = str.charAt(i);
                if((ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') && chr == 'v')
                {
                    System.out.print(ch + " ");
                }
                else if(chr != 'v' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                {
                    System.out.print(ch+" ");
                }
            }
        }
        catch(final StringIndexOutOfBoundsException e)
        {
            System.out.println("number exceeded");
        }
    }
       
}
