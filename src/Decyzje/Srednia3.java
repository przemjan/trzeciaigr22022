package Decyzje;

public class Srednia3 {
    public static void main(String[] args) {
        int ocena1 = 6,  ocena2 = 6;
        int iloscOcen = 2;

        double srednia;
        srednia = (double)(ocena1 + ocena2) /iloscOcen;


        if(srednia>=2) {
            if(srednia>=3) {
                if(srednia>=4) {
                    if(srednia>=5) {
                        if(srednia>=6) {
                            System.out.println("Świetnie");
                        }
                        else {
                            System.out.println("Bardzo dobrze");
                        }
                    }
                    else {
                        System.out.println("Dobrze");
                    }
                }
                else {
                    System.out.println("Średnio");
                }
            }
            else {
                System.out.println("kiepsko");
            }
        }
        else {
            System.out.println("Bardzo zle");
        }

    }
}
