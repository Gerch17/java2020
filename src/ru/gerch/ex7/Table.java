package ru.gerch.ex7;

public class Table extends Furniture {
    private int legAmount;
    private Boolean isPortable;
    private int length;

    public Table(String typeOf, int cost, int amount, String manufacturer, int legAmount, Boolean isPortable, int length) {
        super(typeOf, cost, amount, manufacturer);
        this.legAmount = legAmount;
        this.isPortable = isPortable;
        this.length = length;
    }

    public int getLegAmount() {
        return legAmount;
    }

    public Boolean getPortable() {
        return isPortable;
    }

    public int getLength() {
        return length;
    }

    public void setLegAmount(int legAmount) {
        this.legAmount = legAmount;
    }

    public void setPortable(Boolean portable) {
        isPortable = portable;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Table{" +
                "Количество ног = " + legAmount + "\'" +
                ", Складной = " + isPortable + "\'" +
                ", Длина = " + length + "\'" +
                ", Производитель = '" + getManufacturer() + '\'' +
                ", Цена = '" + getCost() + '\'' +
                ", Количество = '" + amount() + "\'" +
                '}';
    }
}
