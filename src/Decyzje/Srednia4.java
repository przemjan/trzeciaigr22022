package Decyzje;

public class Srednia4 {
    public static void main(String[] args) {
        int ocena1 = 6,  ocena2 = 6;
        int iloscOcen = 2;

        double srednia;
        srednia = (double)(ocena1 + ocena2) /iloscOcen;

        if (srednia >=6) {
            System.out.println("Świetnie " + srednia);
        }
        else if (srednia > 5) {
            System.out.println("Bardzo dobrze" + srednia);
        }
        else if (srednia > 4) {
            System.out.println("Dobrze " + srednia);
        }
        else if (srednia > 3) {
            System.out.println("Średnio " + srednia);
        }
        else if (srednia >2) {
            System.out.println("kiepsko" + srednia);
        }
        else if(srednia <2) {
            System.out.println("Bardzo zle " + srednia);
        }
        else {
            System.out.println("Nieprzewidziane dane błąd 404" );
        }
    }
}
