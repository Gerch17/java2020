package ru.gerch.ex12;

public enum Planets {
    Jupiter("Юпитер", 1.899e+27, 71490),
    Saturn("Сатурн", 5.685e+26, 60270),
    Uranus("Уран", 8.682e+25, 25560),
    Neptune("Нептун", 	1.024e+26, 24760),
    Mercury ("Меркурий", 3.301e+23, 2440),
    Venus ("Венера", 	4.867e+24, 6052),
    Earth("Земля", 5.972e+24, 6378),
    Mars("Марс", 6.417e+23, 3397);

    private String name;
    private double weight;
    private double radius;
    public static final double G = 6.67;


    double gravity() {
        return G * (weight / (radius * radius));
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return name;
    }

    Planets(String text, double weight, double radius) {
        this.name = text;
        this.weight = weight;
        this.radius = radius;
    }

}