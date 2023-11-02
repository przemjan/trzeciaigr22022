package metody;
import java.util.Random;
public class Main {

    public static void printArray(int[] ints){
        for(int i:ints){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void fillArray(int[] ints){
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt();
        }
    }
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5};
        printArray(ints);
        fillArray(ints);
        printArray(ints);
    }


}
