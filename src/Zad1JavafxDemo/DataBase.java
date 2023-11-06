package Zad1JavafxDemo;

import java.util.HashMap;

public class DataBase implements DBInterface{

    private static final DataBase INSTANCE = new DataBase();
    private HashMap<Integer, Dorm> dormHashMap;
    private HashMap<Integer,Boarding> boardingHashMap;
    private int dormID =0;
    private int boardingID = 0;

    private DataBase(){
        dormHashMap =new HashMap<>();
        boardingHashMap = new HashMap<>();
        initialize();
    }
    public static DataBase getInstance(){
        return INSTANCE;
    }

    public void addDorm(String name, double price,String period){
        dormHashMap.put(++dormID,Dorm.make(name, price, period));

    }
    public void addBoarding(int mealPeriod,int mealNumber, double price,String pricePeriod){
        boardingHashMap.put(++boardingID,Boarding.make(mealPeriod, mealNumber,price, pricePeriod));
    }

    private void initialize(){
        addDorm("Zaścianek",1800.0,"semestr");
        addDorm("Oaza",2200.0,"semestr");
        addDorm("Arkadia",2800.0,"semestr");
        addDorm("Apartamenty Uniwersyteckie",3000.0,"semestr");

        addBoarding(7,7,600.0,"semestr");
        addBoarding(7,14,1100,"semestr");
        addBoarding(7,0,1800,"semestr");
    }

    @Override
    public Dorm getDorm(int id){
        return dormHashMap.get(id).copy();
    }
    @Override
    public Dorm getDorm(String name){

        Dorm tempDorm=null;
        for(Integer key:dormHashMap.keySet()){
            if(dormHashMap.get(key).getName().equalsIgnoreCase(name)){
                tempDorm=dormHashMap.get(key).copy();
            }
        }
        return tempDorm;
    }
    @Override
    public HashMap<Integer,Dorm> getDorms(){
        HashMap<Integer,Dorm> tempDorms = new HashMap<>();
        for(Integer key:dormHashMap.keySet()){
            tempDorms.put(key,dormHashMap.get(key).copy());
        }
        return tempDorms;
    }
    @Override
    public HashMap<Integer,Boarding> getBoardings(){
        HashMap<Integer,Boarding> tempBoardings = new HashMap<>();
        for (Integer key:boardingHashMap.keySet()){
            tempBoardings.put(key,Boarding.copy(boardingHashMap.get(key)));
        }
        return tempBoardings;
    }

    @Override
    public Boarding getBoarding(int id) {
        return Boarding.copy(boardingHashMap.get(id));
    }


    public int[] getDormKeys() {
        return dormHashMap.keySet().stream().mapToInt(i->i).toArray();
    }

    @Override
    public int[] getBoardingKeys() {
        return boardingHashMap.keySet().stream().mapToInt(i->i).toArray();
    }
}
