package tablice;

public class TabliceDemo5 {
    public static void main(String[] args) {
        int[][] liczby = new int[10][5];

        //poruszanie się po tablicy dwuwymiarowej
        for (int i = 0; i < liczby.length; i++) {
            for (int j = 0; j < liczby[i].length; j++) {
                liczby[i][j] = i+j;
            }
        }

        for (int i = 0; i < liczby.length; i++) {
            for (int j = 0; j < liczby[i].length; j++) {
                System.out.print(liczby[i][j]+" ");
            }
            System.out.println();
        }


    }
}
