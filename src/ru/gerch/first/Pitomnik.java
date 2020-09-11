package ru.gerch.first;

import java.util.ArrayList;

public class Pitomnik {
    private static Dog[] pit = new Dog[20];
    private static int kol = 0;

    public static void setDog(Dog ... dog)
    {
        for(int q = 0; q < dog.length; q++)
        {
            pit[kol] = dog[q];
            kol++;
        }
    }
}