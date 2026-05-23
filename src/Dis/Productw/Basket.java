package Dis.Productw;

import java.util.ArrayList;

public class Basket {
    public ArrayList<Product> products = new ArrayList<>();


    public void Add(String name, int price, int quantity) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().contains(name)) {
                products.get(i).setQuantity(products.get(i).quantity + quantity);
                return;
            }
        }
        products.add(new Product(name,price,quantity));
    }

    public void delete(int index) {
        products.remove(index);
    }

    public void search(String str) {
        for (Product k : products) {
            if (str.equals(k.getName())) {
                System.out.println(k);
            }
        }
    }

    public void show() {
        for (Product k : products) {
            System.out.println("Название:" + k.name + "Цена:" + k.price + "Колличество:" + k.quantity);
        }
    }

    public void allPrice() {
        int result = 0;
        for (Product k : products) {
            result += k.price * k.quantity;
        }
        System.out.println("Общая стоимость всех товаров:" + result);
    }

    public void amountTop() {
        int result = 0;

        for (int i = 0; i < products.size() - 1; i++) {
            if (products.get(i).price < products.get(i + 1).price) {
                result = i + 1;
            }
        }
        System.out.println("Самый дорогой товар:" + products.get(result));
    }


    @Override
    public String toString() {
        return "Productw.Basket{" +
                "Название=" + products +
                '}';
    }
}
