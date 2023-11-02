package metody;

public class Metoda3 {
    public static void main(String[] args) {
        int liczba1 =10, liczba2 = 7;
        int suma;

        suma = dodaj(liczba1,liczba2);

        System.out.println("Suma wynosi: " + suma);
    }
    public static int dodaj(int a, int b){
        //int wynik = a+b;
        //return wynik;


        return a+b;
        //int liczba17 = 18;
    }
    public static int[] makeArray(){
        return new int[5];
    }
}
