package Food;

import Food.Product;

import java.util.Objects;

public class Drink  extends Product {
    private float volume;//Объем
    private boolean carbonated;//Газированность

    public Drink(){
        super();
        volume = 0;
        carbonated = false;
    }

    public Drink(float volume, String name, float price){
        super(name, price);
        this.volume = volume;
        carbonated = false;
    }

    public Drink(float volume, boolean carbonated, String name, float price){
        super(name, price);
        this.volume = volume;
        this.carbonated = carbonated;
    }

    public float getVolume() {
        return volume;
    }

    public boolean getCarbonared() {
        return carbonated;
    }

    public void printInfo(){
        super.printInfo();
        System.out.print("Объем : " + volume + "мл,   ");
        if(carbonated)
            System.out.print("Газированный");
        else
            System.out.print("Негазированный\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return Objects.equals(volume, drink.volume)
                && Objects.equals(getName(), drink.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName()+volume);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + getName() + '\'' +
                '}';
    }
}