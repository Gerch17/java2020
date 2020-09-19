package ru.gerch.ex5;

public abstract class Shape {
    private String color;
    private Boolean isFilled;

    public Shape(String color, Boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return isFilled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public void setFilled(Boolean filled) {
        isFilled = filled;
    }
}
