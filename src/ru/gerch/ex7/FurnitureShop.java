package ru.gerch.ex7;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> shop = new ArrayList<>();
    private int kol = 0;

    public void setShop(Furniture... furniture)
    {
        for(int i = 0; i < furniture.length; i++) {
            shop.add(kol, furniture[i]);
            kol++;
        }
    }

    public void getStuff(int id) {
        System.out.println(shop.get(id).getTypeOf() + " " + shop.get(id).getCost() + "$");
    }

    public void removeStuff(int id)
    {
        shop.remove(id);
        kol--;
    }

    public void getInfo()
    {
        for(int i = 0; i < kol; i++)
            System.out.println("id: " + i + " " + shop.get(i));
    }
}
