package Food;

public class Soup  extends Product {
    private String type;
    private boolean thick;

    public Soup(){
        super();
        type = "";
        thick = false;
    }

    public Soup(String type, String name, float price){
        super(name, price);
        this.type = type;
        thick = false;
    }

    public Soup(String type, boolean thick, String name, float price){
        super(name, price);
        this.type = type;
        this.thick = thick;
    }

    public String getType() {
        return type;
    }

    public boolean getThick() {
        return thick;
    }
    public void printInfo(){
        super.printInfo();
        System.out.print("Тип : " + type + "   ");
        if(thick)
            System.out.print("Густой");
        else
            System.out.print("Негустой\n");
    }
}
