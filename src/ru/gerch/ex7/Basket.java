package ru.gerch.ex7;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Furniture> shop = new ArrayList<>();
    private int kol = 0;
    private int totalPrice = 0;

    public void setBasket(Furniture... furniture) {
        for (int i = 0; i < furniture.length; i++) {
            if (furniture[i].amount() != 0)
            {
                shop.add(kol, furniture[i]);
                kol++;
                totalPrice += furniture[i].getCost();
                furniture[i].remove();
                System.out.println("Товар " + furniture[i].getTypeOf() + " был добавлен в корзину");
            }else
            {
                System.out.println("Товара " + furniture[i].getTypeOf() + " нет в наличии");
            }
        }
    }

    public void getStuff(int id) {
        System.out.println(shop.get(id).getTypeOf() + " " + shop.get(id).getCost() + "$");
    }

    public void removeStuff(int id)
    {
        totalPrice -= shop.get(id).getCost();
        shop.remove(id);
        kol--;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void getInfo()
    {
        for(int i = 0; i < kol; i++)
            System.out.println("id: " + i + " " + shop.get(i));

        System.out.println("Price: " + totalPrice + "$");
    }
}
