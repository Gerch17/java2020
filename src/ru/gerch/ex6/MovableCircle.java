package ru.gerch.ex6;

import ru.gerch.ex5.Circle;



public class MovableCircle extends Circle implements Movable {
    private MovablePoint center;

    public MovableCircle(String color, Boolean isFilled, double rad, int x, int y) {
        super(color, isFilled, rad);
        center = new MovablePoint(x, y);
    }

    @Override
    public void moveIt(int x, int y)
    {
        center.moveIt(x, y);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                '}';
    }
}
