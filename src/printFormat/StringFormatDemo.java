package printFormat;

public class StringFormatDemo {
    public static void main(String[] args) {

        int age = 1777;
        double averageTemp = 19876.77777757;
        String name = "Alojzy";

        String napis = String.format( "wiek: %,-10d, temperatura: %,-10f, stopni, imię: %10s", age, averageTemp, name);
        System.out.println(napis);


        // ubuckp zadania2if.pdf

    }
}
