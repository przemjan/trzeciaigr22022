package Decyzje;

import java.util.Scanner;

public class Pozyczka1 {
    public static void main(String[] args) {
        double zarobki, staz;
        double progZarobki, progStaz;

        progZarobki = 1000000;
        progStaz = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ile zarabiasz rocznie: ");
        zarobki = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ile lat pracujesz: ");
        staz = scanner.nextDouble();

        if (zarobki >= progZarobki) {
            if(staz>=progStaz) {
                System.out.print("Gratulacje, dostałeś pożyczkę");
            }
            else {
                System.out.println("Za krótki staż. Nie ma pożyczki.");
            }
        }
        else {
            System.out.print("Za niskie zarobki. Nie dostajesz pożyczki");
        }
    }
}
