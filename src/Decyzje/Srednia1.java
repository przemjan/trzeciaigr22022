package Decyzje;

import java.util.Scanner;

public class Srednia1 {
    public static void main(String[] args) {
        int ocena1,  ocena2;
        int iloscOcen =2;
        double srednia;

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj ocenę1 " );
        ocena1 = klawisz.nextInt();

        System.out.println("Podaj ocenę2 ");
        ocena2 = klawisz.nextInt();

        srednia = (double)(ocena1 + ocena2) / iloscOcen;

        if (srednia ==  5) {
            System.out.println("Świetnie! " + srednia);

        }


        if (srednia == 1) {
            System.out.println("Niedobrze! " + srednia);
            System.out.println("Musisz się poprawić!");
        }
    }
}
