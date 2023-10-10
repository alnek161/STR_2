package Food;

import Food.Product;

public class HotDish  extends Product {
    private String type;
    private boolean spicy;

    public HotDish(){
        super();
        type = "";
        spicy = false;
    }

    public HotDish(String type, String name, float price){
        super(name, price);
        this.type = type;
        spicy = false;
    }

    public HotDish(String type, boolean spicy, String name, float price){
        super(name, price);
        this.type = type;
        this.spicy = spicy;
    }

    public String getType() {
        return type;
    }

    public boolean getSpisy() {
        return spicy;
    }

    public void printInfo(){
        super.printInfo();
        System.out.print("Тип : " + type + "   ");
        if(spicy)
            System.out.print("Острый");
        else
            System.out.print("Неострый\n");
    }
}
