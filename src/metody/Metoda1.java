package metody;

public class Metoda1 {
    public static void main(String[] args) {

        System.out.println("Jestem w metodzie main");

        drukujPozdrowienie();

        System.out.println("Znowu jest w metodzie main");
    }
    public static void drukujPozdrowienie(){
        System.out.println("Witaj");
        System.out.println("jestem w metodzie drukujPozdrowienie()");
    }

}
