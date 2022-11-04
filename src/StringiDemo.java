public class StringiDemo {
    public static void main(String[] args) {

        String name = "Eustachy";

        int dlugosc = name.length();

        char inicjal = name.charAt(4);
        System.out.println("Litera: " + inicjal);

        String male, duze;

        name = name.toLowerCase();

        duze = name.toUpperCase();

        System.out.println(name);

    }
}
