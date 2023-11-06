package Zad1JavafxDemo;

public class Boarding {
    private int mealPeriod;
    private int mealNumber;
    private double price;
    private String pricePeriod;


    private Boarding (int mealPeriod, int mealNumber, double price,String pricePeriod){
        this.mealPeriod = mealPeriod;
        this.mealNumber = mealNumber;
        this.price = price;
        this.pricePeriod=pricePeriod;
    }
    public static Boarding make(int period, int mealNumber, double price,String pricePeriod){
        return  new Boarding(period,mealNumber,price,pricePeriod);
    }
    private Boarding(Boarding boarding){
        this.mealPeriod = boarding.mealPeriod;
        this.mealNumber = boarding.mealNumber;
        this.price = boarding.price;
        this.pricePeriod = boarding.pricePeriod;
    }
    public static Boarding copy(Boarding boarding){

        return new Boarding(boarding);
    }


    public String getPricePeriod() {
        return pricePeriod;
    }

    public void setPricePeriod(String pricePeriod) {
        this.pricePeriod = pricePeriod;
    }



    public int getMealPeriod() {
        return mealPeriod;
    }

    public void setMealPeriod(int mealPeriod) {
        this.mealPeriod = mealPeriod;
    }

    public int getMealNumber() {
        return mealNumber;
    }

    public void setMealNumber(int mealNumber) {
        this.mealNumber = mealNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boarding)) return false;

        Boarding boarding = (Boarding) o;

        if (getMealPeriod() != boarding.getMealPeriod()) return false;
        if (getMealNumber() != boarding.getMealNumber()) return false;
        return Double.compare(boarding.getPrice(), getPrice()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getMealPeriod();
        result = 31 * result + getMealNumber();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {

        if(mealNumber==0){
            return "nieograniczona liczba posiłków - "+price+" za "+ pricePeriod;
        }

        if(mealPeriod==7){
            return mealNumber+ " posiłków tygodniowo - " + price +" za "+ pricePeriod;
        }
        return mealNumber+ " na "+mealPeriod+ " dni - " + price +" za " + pricePeriod;
    }
}
