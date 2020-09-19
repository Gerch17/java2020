package ru.gerch.ex5;

public class Square extends Shape {
    private int side;

    public Square(String color, Boolean isFilled, int side) {
        super(color, isFilled);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea()
    {
        return side*side;
    }

    @Override
    public double getPerimeter()
    {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
