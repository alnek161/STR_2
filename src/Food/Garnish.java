package Food;

public class Garnish extends Product {
    private String type;
    private String mainIngredient;

    public Garnish(String s){
        super();
        type = "";
        mainIngredient = "";
    }

    public Garnish(String type, String mainIngredient, String name, float price){
        super(name, price);
        this.type = type;
        this.mainIngredient = mainIngredient;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public String getType() {
        return type;
    }

    public void printInfo(){
        super.printInfo();
        System.out.print("Основной ингридиент : " + mainIngredient + ",   ");
        System.out.print("Тип : " + type + "\n");
    }
}
