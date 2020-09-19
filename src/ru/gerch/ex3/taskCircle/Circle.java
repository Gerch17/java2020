package ru.gerch.ex3.taskCircle;


public class Circle {
    private static double rad;

    public Circle(double rad) {
        Circle.rad = rad;
    }

    public static double getRad() {
        return rad;
    }

    public static void setRad(double rad) {
        Circle.rad = rad;
    }

    public static double getDi()
    {
        return 2*rad;
    }

    public static double getS()
    {
        return 3.14*(rad*rad);
    }

    public static double getP()
    {
        return 2*3.14*rad;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Радиус равен - " + getRad() + "\nДиаметр равен - " + getDi() + "\nПлощадь равна - " + getS() + "\nДлина равна - " + getP();
    }
}