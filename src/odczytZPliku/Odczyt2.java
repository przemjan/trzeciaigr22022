package odczytZPliku;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Odczyt2 {
    public static void main(String[] args) throws IOException {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku do odczytania: ");
        String nazwaPliku = klawiatura.nextLine();


        File mojPlik = new File(nazwaPliku);

        if (!mojPlik.exists()) {
            System.out.println(" Plik nie istnieje");
            System.exit(0);
        }

        Scanner czytelnikPlik = new Scanner(mojPlik);

        while (czytelnikPlik.hasNext()) {
            String linia =  czytelnikPlik.nextLine();
            System.out.println("Kolejna linia pliku to " + linia);
        }

        czytelnikPlik.close();

    }
}
