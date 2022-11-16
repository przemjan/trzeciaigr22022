package dodatki;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Zakroaglanie {
    public static void main(String[] args) {
        double liczba = 13.89787954;

        System.out.println(liczba);

        BigDecimal bd = new BigDecimal(liczba).setScale(3, RoundingMode.HALF_UP);
        double liczbaZaokroglona = bd.doubleValue();

        System.out.println(liczbaZaokroglona);
    }
}
