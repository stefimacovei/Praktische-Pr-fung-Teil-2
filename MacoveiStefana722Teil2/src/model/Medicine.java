package model;

public class Medicine {
    private String name;
    private String illness;
    private int price;

    public Medicine(String name, int price, String illness){
        this.name=name;
        this.price=price;
        this.illness=illness;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int Price) {
        this.price = Price;
    }
    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
    public int getId() {
        return price;
    }

    public void setId(int Price) {
        this.price = Price;
    }
}
