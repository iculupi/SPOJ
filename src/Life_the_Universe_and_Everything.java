import java.util.Scanner;

public class Life_the_Universe_and_Everything
{
    private static final int EVERYTHING = 42;
    public static void main (String[] args)
    {
        int a;
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            a = scanner.nextInt();
            if(a == EVERYTHING)
                break;
            System.out.println(a);
        }
    }

}
