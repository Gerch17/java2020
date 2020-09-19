package ru.gerch.ex5;

public class Circle extends Shape {
    private double rad;

    public Circle(String color, Boolean isFilled, double rad) {
        super(color, isFilled);
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    @Override
    public double getArea()
    {
        return 3.14*rad*rad;
    }

    @Override
    public double getPerimeter()
    {
        return 2*3.14*rad;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "rad=" + rad +
                '}';
    }
}
