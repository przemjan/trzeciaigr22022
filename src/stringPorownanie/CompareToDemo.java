package stringPorownanie;

public class CompareToDemo {
    public static void main(String[] args) {
        String imie1 = "Zenon", imie2 = "Zuzia";

        if (imie1.compareToIgnoreCase(imie2) < 0){
            System.out.println(imie1 + " jest pierwszy alfabetycznie  " );
        }

        else if (imie1.compareTo(imie2) == 0) {
            System.out.println(imie1 + " jest równy względem " + imie2 + ".");
        }

        else if (imie1.compareTo(imie2) > 0){
            System.out.println(imie2 + " jest pierwszy alfabetycznie");
        }

    }
}
