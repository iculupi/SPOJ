import java.util.Scanner;

public class podatekfizyczny
{
    private static final int PROG_PODATKOWY = 85528;
    public static void main(String[] args)
    {
        // deklaraje zmiennych
        Scanner scanner = new Scanner(System.in);
        String dochodS;
        int dochodI;

        // Pytanie o dochód
        System.out.println("Podaj swój dochód roczny: ");
        // Czytanie wartości (w postaci ciagu znaków)
        dochodS = scanner.nextLine();

        // Zabezpieczenie czy wprowadzono liczbę czy coś zupełnie innego
        try                             // Próba zmiany ciągu znaków na int
        {
            dochodI = Integer.parseInt(dochodS);
        }
        catch (NumberFormatException e) // Nieudana próba zamiany ciągu znaków na int
        {
            System.out.println("Nie podałeś/aś prawidłowej wartości.");
            return; // Kończymy działanie
        }

        // Deklaracja zmiennych
        double podatek;

        if (dochodI < PROG_PODATKOWY)   // jeśli dochój jest miejszy niż PROG_PODATKOWY
        {
            // do 85.528 podatek wynosi 18% dochodI minus 556,02 PLN
            podatek = (dochodI * 0.18) - 556.02;
        }
        else                            // jeśli dochód jest większy lub równy PROG_PODATKOWY
        {
            // od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00
            podatek = 14839.02 + ( (dochodI - PROG_PODATKOWY) * 0.32 ); // (dochodI - PROG_PODATKOWY) == nadwyżka
        }
        System.out.println(" Twój podatek wynosi: " + podatek + " PLN.");
    }
}

