import Food.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Operation {
    public ArrayList<Product> addProduct(ArrayList<Product> products, ArrayList<Product> order){
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.menuOut(products);
        System.out.print("Выберите товар\n");
        int value = scanner.nextInt();
        if(value > products.size()){
            System.out.print("Неверное значение");
        }
        else{
            order.add(products.get(value - 1));
        }
        return order;
    }
    public void checkOrder(ArrayList<Product> order) {
        System.out.print("\nВаш заказ:\n");
        Menu menu = new Menu();
        menu.menuOut(order);
        float price = 0;
        for (Product product : order) {
            price += product.getPrice();
        }
        System.out.print("Итого:  " + price +"р\n");
    }
    public ArrayList<Product> deleteProduct(ArrayList<Product> order){
        Scanner scanner = new Scanner(System.in);
        this.checkOrder(order);
        System.out.print("\nВыберите товар для удаления\n0 - Назад\n");
        int value = scanner.nextInt();
        if(value > order.size() && value < 0){
            System.out.print("Неверное значение");
        }
        else if (value != 0){
            order.remove(value - 1);
        }
        else{
            return order;
        }
        return order;
    }
}
