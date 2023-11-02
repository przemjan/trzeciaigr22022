package tablice;

public class TabliceDemo3 {
    public static void main(String[] args) {
        int[] liczby = new int[10];

        //automatyczne uzupełnienie tablicy
        for(int i = 0; i<liczby.length; i++){
            liczby[i] = i+10;
        }


        for (int i:liczby){
            System.out.println(i);

        }

    }
}
