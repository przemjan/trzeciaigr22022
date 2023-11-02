package tablice;

import java.util.Random;

public class TabliceDemo6 {
    public static void main(String[] args) {

        //tablica ragged - różne długości tablic wewnętrznych
        Random random = new Random();
        int[][] liczby = new int[3][];
        liczby[0] = new int[5];
        liczby[1] = new int [7];
        liczby[2] = new int[3];

        for (int i = 0; i < liczby.length; i++) {
            for (int j = 0; j < liczby[i].length; j++) {
                liczby[i][j] = random.nextInt(785028841);
            }
        }


        for (int[] ints:liczby){
            for(int i:ints){
                System.out.printf("%-10d ",i);
            }
            System.out.println();
        }

    }

}
