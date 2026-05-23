package Dis.Bank;

public class Client {
    String name;
    boolean vip;
    int pos = 0;

    public Client(String name, boolean vip) {
        this.name = name;
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Bank.Client{" +
                "name='" + name + '\'' +
                ", vip=" + vip +
                ", pos=" + pos +
                '}';
    }
}
