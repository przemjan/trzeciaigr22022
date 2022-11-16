package Decyzje;

import java.util.Scanner;

public class Przedzialy {
    public static void main(String[] args) {
        int x, y;

        y=0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj liczbę x :");
        x = keyboard.nextInt();

        if (x >=2 && x<=10) {
            System.out.println("Sukces! Trafiłeś");
        }

        if (x <2 || x >10) {
            System.out.println("Nie trafiłeś!");
        }
    }
}
