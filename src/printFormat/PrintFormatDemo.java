package printFormat;

public class PrintFormatDemo {
    public static void main(String[] args) {

        int age = 1777;
        double averageTemp = 19876.77777757;

        String napis = "Jakiś tekst";


        System.out.printf("Wiek: %d lat\n",age);
        System.out.printf("Średnia temperatura %f stopni C \n", averageTemp);

        //minimalna szerokość pola = 10
        System.out.printf("Wiek: %10d lat\n",age);
        System.out.printf("Średnia temperatura %10f stopni C \n", averageTemp);

        //precyzja (zaokraglanie)
        System.out.printf("Średnia temperatura %.2f stopni C \n", averageTemp);

        //wizaualne oddzielanie
        System.out.printf("Wiek: %,d lat\n",age);
        System.out.printf("Średnia temperatura %,f stopni C \n", averageTemp);

        //dopełnianie początkowymi zerami (tylko przy podanej minimalnej szerokości pola)
        System.out.printf("Wiek: %010d lat\n",age);
        System.out.printf("Średnia temperatura %010f stopni C \n", averageTemp);

        //łączenie parametrów (ważna kolejność!)
        System.out.printf("Wiek: %,010d lat\n",age);
        System.out.printf("Średnia temperatura %,010.2f stopni C \n", averageTemp);

        //wyrównanie liczb do lewej
        System.out.printf("Wiek: %,-10d lat\n",age);
        System.out.printf("Średnia temperatura %,-10.2f stopni C \n", averageTemp);

        //łączenie różnych typów zmiennych

        //formatowanie stringów (wyrównanie do lewej, stała szerokość pola)
        String name1 = "Franek", name2 ="Zosia", name3 = "Zdzisek", name4 = "Zenek",name5 = "Walek", name6 = "Grażyna";

        System.out.printf("%-10s %-10s\n", name1, name2);
        System.out.printf("%-10s %-10s\n", name3, name4);
        System.out.printf("%-10s %-10s\n", name5, name6);

        //łączenie różnych typów zmiennych
        System.out.printf("wiek: %,-10d, temperatura: %,-10f, stopni, imię: %10s", age, averageTemp, name3);

    }
}
