package Dis.Productw;

public class TestBasket {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.Add("aaa",10100,1);
        basket.Add("aaa",500,1);
        basket.Add("ббб",500,1);
        basket.Add("ccc",500,1);
        basket.show();
        basket.allPrice();
        basket.amountTop();
        basket.show();
        basket.search("ccc");
    }
}
