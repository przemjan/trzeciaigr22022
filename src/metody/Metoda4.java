package metody;

public class Metoda4 {
    public static void main(String[] args) {
        System.out.println("Jestem w metodzie głównej");
        drukuj1();
        System.out.println("Znowu jestem w metodzie głównej");
    }
    public static void drukuj1(){
        System.out.println("Jestem w metodzie drukuj1");
        drukuj2();
        System.out.println("Wróciłem do metody drukuj1");
    }
    public static void drukuj2(){
        System.out.println("Jestem w metodzie drukuj2");
    }
}
