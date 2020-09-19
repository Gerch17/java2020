package ru.gerch.ex5;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, Boolean isFilled, int width, int height) {
        super(color, isFilled);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return height*width;
    }

    @Override
    public double getPerimeter()
    {
        return (height+width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
