package metody;

public class Metoda5 {
    public static void main(String[] args) {
        int number1 = 17, number2 = 24;
        double number3 = 13.7, number4 =5.74;




        System.out.println(dodaj(number1,number2));
        System.out.println(dodaj(number3,number4));
        System.out.println(dodaj(number1,number4));
        System.out.println(dodaj(number3,number2));

        System.out.println();

        double wynik = dodaj(number2,number3);
        System.out.println(wynik);


    }
    public static int dodaj(int liczba1, int liczba2){

        return liczba1+liczba2;
    }
    public static double dodaj(double liczba1, double liczba2){

        return liczba1+liczba2;
    }
    public static double dodaj(double liczba1, int liczba2){
        return liczba1+liczba2;
    }
    public static double dodaj(int liczba1, double liczba2){
        return liczba1+liczba2;
    }
//    public static int dodaj(double liczba1, double liczba2){
//        return (int)(liczba1+ liczba2);
//    }

}
