package ru.gerch.ex7;

public class Test {
    public static void main(String[] args) {
        System.out.println("=========================\nТест класса FurnitureShop\n=========================");
        Furniture stool = new Stool("Stool",15, 1,"AMD", true, "kitchen", true);
        FurnitureShop shop = new FurnitureShop();
        shop.setShop(stool);
        shop.getStuff(0);

        Furniture chair = new Chair("Chair", 30, 2, "Intel", "Leather", "Grey", 50);
        shop.setShop(chair);
        shop.getStuff(1);

        Furniture table = new Table("Table", 25, 0, "MSI", 4, false, 150);
        shop.setShop(table);
        shop.getStuff(2);

        shop.getInfo();

        System.out.println("\n==================\nТест класса Basket\n==================");
        Basket basket = new Basket();
        basket.setBasket(stool, chair, table);
        System.out.println("В корзине находится товаров на " + basket.getTotalPrice() + "$");
        basket.getInfo();
    }
}
