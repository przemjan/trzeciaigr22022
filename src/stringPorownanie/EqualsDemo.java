package stringPorownanie;

public class EqualsDemo {
    public static void main(String[] args) {
        String imie1 = "Arnold";
        String imie2 = "arnold";

        if( imie1.equalsIgnoreCase(imie2) )    {
            System.out.println("Te imiona są takie same");
        }
        else {
            System.out.println("Te imiona różnią się");
        }
    }
}
