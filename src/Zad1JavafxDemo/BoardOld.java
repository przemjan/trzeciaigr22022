package Zad1JavafxDemo;

import java.util.HashMap;

public class BoardOld {
    private HashMap<Integer,Double> boardingPrices;

    public BoardOld(){
        boardingPrices = new HashMap<>();
    }

    public void addBoard(int mealNumber,double price){
        boardingPrices.put(mealNumber,price);
    }
    public double getPrice(int mealNumber){

        //double temp;
//        return (double) (boardingPrices.get(mealNumber)!=null);
        return boardingPrices.get(mealNumber);
    }

    public int[] getKeys(){
        int[] temp = new int[boardingPrices.size()];
        int i =0;
        for(Integer integer:boardingPrices.keySet()){

            temp[i]=integer;
            i++;
        }
        return temp;
    }

}
