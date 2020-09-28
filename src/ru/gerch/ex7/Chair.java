package ru.gerch.ex7;

public class Chair extends Furniture{
    private String material;
    private String color;
    private int weight;

    public Chair(String typeOf, int cost, int amount, String manufacturer, String material, String color, int weight) {
        super(typeOf, cost, amount, manufacturer);
        this.material = material;
        this.color = color;
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "Материал = '" + material + '\'' +
                ", Цвет = '" + color + '\'' +
                ", Вес = '" + weight + '\'' +
                ", Производитель = '" + getManufacturer() + '\'' +
                ", Цена = '" + getCost() + '\'' +
                ", Количество = '" + amount() + "\'" +
                '}';
    }
}
