package Decyzje;

import java.util.Scanner;

public class Srednia2 {
    public static void main(String[] args) {
        int ocena1,  ocena2;
        int iloscOcen = 2;
        double srednia;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ocenę1 " );
        ocena1 = scanner.nextInt();
        System.out.println("Podaj ocenę2 ");
        ocena2 = scanner.nextInt();

        srednia = (double)(ocena1 + ocena2) / iloscOcen;

        if (srednia > 4) {

            System.out.println("Dobrze " + srednia);
        }
        else{
            System.out.println("Niedobrze! " + srednia);
            System.out.println("Musisz się poprawić");

        }
    }
}
