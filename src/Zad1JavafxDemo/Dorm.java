package Zad1JavafxDemo;

public class Dorm {
    private String name;
    private double price;
    private String period;

    private Dorm(String name, double price, String period){
        this.name =name;
        this.price = price;
        this.period = period;

    }
    private Dorm(Dorm dorm){
        this.name = dorm.name;
        this.price = dorm.price;
        this.period = dorm.period;

    }

    public static Dorm make(String name, double price, String period){
        return new Dorm(name,price,period);

    }
    public  Dorm copy(){

        return new Dorm(this);
    }
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(o instanceof Dorm)) return false;

        Dorm dorm = (Dorm) o;

        if (Double.compare(dorm.getPrice(), getPrice()) != 0) return false;
        if (!getName().equals(dorm.getName())) return false;
        return getPeriod().equals(dorm.getPeriod());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName().hashCode();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getPeriod().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return
                 name +
                " - cena: " + price +
                "zł za " + period ;
    }
}
