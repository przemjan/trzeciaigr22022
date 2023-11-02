package petle;

import java.util.Scanner;public class PetlaWhile2 {
    public static void main(String[] args) {
        boolean twierdzenie =true;
        Scanner scan = new Scanner(System.in);
        int liczba;

        while (twierdzenie) {

            System.out.println("Podaj liczbę 1-10");
            liczba= scan.nextInt();

            if(liczba<1||liczba>10) {
                twierdzenie = true;
            }else {
                twierdzenie = false;

            }

            System.out.println("Podałeś "+ liczba);


        }
        System.out.println("Wyszedłem z pętli.");
    }
}
