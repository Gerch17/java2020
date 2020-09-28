package ru.gerch.ex7;

public class Stool extends Furniture{
    private Boolean isOnWheels;
    private String type;
    private Boolean isWithBack;

    public Stool(String typeOf, int cost, int amount, String manufacturer, Boolean isOnWheels, String type, Boolean isWithBack) {
        super(typeOf, cost, amount, manufacturer);
        this.isOnWheels = isOnWheels;
        this.type = type;
        this.isWithBack = isWithBack;
    }

    public Boolean getOnWheels() {
        return isOnWheels;
    }

    public String getType() {
        return type;
    }

    public Boolean getWithBack() {
        return isWithBack;
    }

    public void setOnWheels(Boolean onWheels) {
        isOnWheels = onWheels;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWithBack(Boolean withBack) {
        isWithBack = withBack;
    }

    @Override
    public String toString() {
        return "Stool{" +
                "На колёсах = '" + isOnWheels + "\'" +
                ", Тип = '" + type + '\'' +
                ", Имеется Спинка = '" + isWithBack + "\'"+
                ", Производитель = '" + getManufacturer() + '\'' +
                ", Цена = '" + getCost() + '\'' +
                ", Количество = '" + amount() + "\'" +
                '}';
    }
}
