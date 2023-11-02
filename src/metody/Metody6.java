package metody;

public class Metody6 {
    public static void main(String[] args) {

        double number1 = 6, number2 =3;

        double wynik = pierwiastekSumy(number1,number2);

        System.out.println(wynik);

    }
    public static double pierwiastekSumy(double liczba1, double liczba2){
        double suma = dodaj(liczba1,liczba2);

        return Math.sqrt(suma);
    }
    public static double dodaj(double liczba1, double liczba2){

        return liczba1+liczba2;
    }
}
