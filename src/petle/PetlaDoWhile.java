package petle;

public class PetlaDoWhile {
    public static void main(String[] args) {
        int numer = 1000;

        do {

            System.out.println("Liczba " + numer);

            numer++;

        }
        while (numer <=10);

        System.out.println("Wyszedłem z pętli");

    }
}
