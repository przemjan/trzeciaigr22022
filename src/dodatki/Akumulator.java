package dodatki;

public class Akumulator {
    public static void main(String[] args) {
        int sumaWyplat=0, wyplata =1;

        for (int i = 0; i < 200; i++ ) {
            System.out.println("W dniu " + i + " pensja wynosi " + wyplata + "zł");

            wyplata = wyplata+1;
            sumaWyplat +=wyplata;
        }

        System.out.println("W sumie pracownik zarobił " + sumaWyplat + "zł");
    }
}
