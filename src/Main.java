import Food.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operation operation = new Operation();
        Menu menu = new Menu();
        ArrayList<Product> order = new ArrayList<Product>();;
        ArrayList<Product> products = menu.createMenu();
        while(true){
            menu.menuOut();//Вывод меню
            int value = scanner.nextInt();
            switch (value){
                case 0: return;
                case 1: order = operation.addProduct(products, order);
                    break;
                case 2: operation.checkOrder(order);
                    break;
                case 3: order = operation.deleteProduct(order);
                    break;
                default: System.out.println("Неверное значение\n");
            }
        }
    }
}