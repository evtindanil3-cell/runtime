package Dis.Comparable;

import java.util.Objects;

public class Order implements Comparable<Order>{
    String client;
    int totalPrice;
    int productsCount;

    public Order(String client, int totalPrice, int productsCount) {
        this.client = client;
        this.totalPrice = totalPrice;
        this.productsCount = productsCount;
    }

    @Override
    public String toString() {
        return "Orderqw.Order{" +
                "client='" + client + '\'' +
                ", totalPrice=" + totalPrice +
                ", productsCount=" + productsCount +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Order order = (Order) object;
        return totalPrice == order.totalPrice && productsCount == order.productsCount && Objects.equals(client, order.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, totalPrice, productsCount);
    }

    @Override
    public int compareTo(Order o) {
        int restotalPrice = Integer.compare(this.totalPrice,o.totalPrice);
            if (restotalPrice != 0){
                return restotalPrice;
            }
        int resProductsCount = Integer.compare(this.productsCount,o.productsCount);
            if (resProductsCount != 0){
                return resProductsCount;
            }

        return 0;
    }
}
