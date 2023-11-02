package metody;

public class Metoda2 {
    public static void main(String[] args) {

        int liczba1 = 10, liczba2 = 7;

        dodajDrukuj(liczba1,liczba2);

        System.out.println("Liczba2 w metodzie main: " + liczba2);
    }
    public static void dodajDrukuj(int liczba1, int liczba2){

        int wynik = liczba1+liczba2;

        liczba2 = 14;
        System.out.println("Wynik wynosi: " +wynik);
        System.out.println("Liczba2 w metodzie dd: " + liczba2);

    }
}
