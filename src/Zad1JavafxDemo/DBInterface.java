package Zad1JavafxDemo;

import java.util.HashMap;

public interface DBInterface {

    Dorm getDorm(int id);
    Dorm getDorm(String name);

    HashMap<Integer,Dorm> getDorms();
    HashMap<Integer,Boarding> getBoardings();

    Boarding getBoarding(int id);
    int[] getDormKeys();
    int[] getBoardingKeys();

}
