package ru.gerch.ex6;

import ru.gerch.ex5.Rectangle;

public class MovableRectangle extends Rectangle implements Movable{
    private MovablePoint topLeftPoint;

    public MovableRectangle(String color, Boolean isFilled, int width, int height, int x, int y) {
        super(color, isFilled, width, height);
        topLeftPoint = new MovablePoint(x, y);
    }

    @Override
    public void moveIt(int x, int y)
    {
        topLeftPoint.moveIt(x, y);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "center=" + topLeftPoint +
                '}';
    }
}
