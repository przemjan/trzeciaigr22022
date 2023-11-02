package odczytZPliku;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Odczyt1 {
    public static void main(String[] args) throws IOException {

        File mojPlik = new File ("danie.txt");


        Scanner fileScanner = new Scanner (mojPlik);


        String linia;

        linia = fileScanner.nextLine();

        System.out.println("Pierwsza linia pliku to: " + linia);

        //scanner odczytuje kolejne linie pliku (przechowuje pozycję odczytu)
        String linia2 = fileScanner.nextLine();
        System.out.println("Druga lina pliku to: " + linia2);
        linia = fileScanner.nextLine();

        fileScanner.close();
    }
}
