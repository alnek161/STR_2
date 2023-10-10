package Food;

import javax.print.attribute.standard.PrinterInfo;

public abstract class Product {
    private String name;
    private float price;

    Product(){
        name = "";
        price = 0;
    }

    Product(String name, float price){
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void printInfo(){
        System.out.print("Название :  " + name + ",   Цена :  " + price + "р   ");
    }
}
