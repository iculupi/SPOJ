import java.util.Scanner;

public class Half_of_the_half
{
    public static void main (String[] args)
    {
        String[] t = new String[100];
        Scanner scanner = new Scanner(System.in);
        String as = scanner.nextLine();

        int ai = Integer.parseInt(as);
        for (int i=0; i<ai; i++)
        {
            t[i] = scanner.nextLine();
            t[i]  = t[i].substring(0, (t[i].length()/2));
        }
        for (int i=0; i<ai; i++)
        {
            half(t[i]);
        }
    }

    private static void half(String b)
    {
        boolean f = true;

        for (char c: b.toCharArray())
        {
            if (f)
            {
                System.out.print(c);
            }
            f = !f;
        }
        System.out.println();
    }
}
