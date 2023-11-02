package tablice;

public class TabliceDemo4 {
    public static void main(String[] args) {
        //tablica dwuwymiarowa
        int[][] liczby = new int[5][10];

        liczby[3][7] = 17;
        liczby[2][8]= 19;

        System.out.println(liczby[3][7]);
        //komórki niezainicjowane przyjmują wartość zero
        System.out.println(liczby[2][1]);

        System.out.println(liczby[4][9]);


    }
}
