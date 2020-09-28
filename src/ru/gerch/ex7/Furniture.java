package ru.gerch.ex7;

public abstract class Furniture {
    private String typeOf;
    private int cost;
    private int amount;
    private String manufacturer;

    public Furniture(String typeOf, int cost, int amount, String manufacturer) {
        this.typeOf = typeOf;
        this.cost = cost;
        this.amount = amount;
        this.manufacturer = manufacturer;
    }

    public String getTypeOf() {
        return typeOf;
    }

    public void setTypeOf(String typeOf) {
        this.typeOf = typeOf;
    }

    public int getCost() {
        return cost;
    }

    public int amount()
    {
        return amount;
    }

    public void remove()
    {
        amount--;
    }

    public int getAmount() {
        if(amount != 0) {
            return amount;
        } else {
            System.out.print("Нет в наличии");
        }
        return 0;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "cost='" + cost + '\'' +
                ", amount=" + amount +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
