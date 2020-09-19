package ru.gerch.ex6;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle("blue", true, 0.2, 0, 0);
        System.out.println(circle);
        circle.moveIt(10, 50);
        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle("red", true, 22, 25, 0, 0);
        System.out.println(rectangle);
        rectangle.moveIt(100, 50);
        System.out.println(rectangle);
    }
}
