import Food.*;

import java.util.ArrayList;

public class Menu {
    public ArrayList<Product>  createMenu(){
        ArrayList<Product> products = new ArrayList<Product>();
        Product product1 = new Drink(320, "Клубничный кампот", 0.85f);
        Product product2 = new Drink(320, "Яблочный сок", 1.2f);
        Product product3 = new Garnish("Овощной", "Морковь", "Запеканка овощная", 1.8f);
        Product product4 = new Garnish("Макаронные", "Макароны", "Макароны по-флотски", 0.9f);
        Product product5 = new HotDish("Свинина", false, "Колбаски по-слуцки", 2.3f);
        Product product6 = new HotDish("Курятина", false, "Филе курицы", 4.7f);
        Product product7 = new Soup("Овощной", "Холодник", 0.9f);
        Product product8 = new Soup("Грузинский", true, "Харчо", 1.3f);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        return products;
    }

    public void menuOut(ArrayList<Product> products){
        int i = 1;
        for(Product product : products){
            System.out.print(i + ". ");
            product.printInfo();
            i++;
        }
    }

    public void menuOut(){
        System.out.print("Меню:\n1 - Добавить товар\n2 - Просмотреть заказ\n3 - Удалить товар из заказа\n");
    }
}
