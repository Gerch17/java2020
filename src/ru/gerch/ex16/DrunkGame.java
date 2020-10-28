package ru.gerch.ex16;

import java.util.LinkedList;
import java.util.Queue;

public class DrunkGame {
    public static void main(String[] args) {
        Queue<Integer> first = new LinkedList<>();
        first.offer(1);
        first.offer(3);
        first.offer(5);
        first.offer(7);
        first.offer(9);
        Queue<Integer> second = new LinkedList<>();
        second.offer(2);
        second.offer(4);
        second.offer(6);
        second.offer(8);
        second.offer(0);
        startGame(first, second);
    }
    public static void startGame(Queue<Integer> first, Queue<Integer> second){
        int turn = 0;
        while(!first.isEmpty() && !second.isEmpty() && turn < 106){
            int firstCell = first.remove();
            int secondCell = second.remove();

            if (firstCell == 0 && secondCell == 9){
                first.add(firstCell);
                first.add(secondCell);
            } else if (firstCell == 9 && secondCell == 0){
                second.add(firstCell);
                second.add(secondCell);
            } else if (firstCell > secondCell){
                first.add(firstCell);
                first.add(secondCell);
            } else {
                second.add(firstCell);
                second.add(secondCell);
            }
            turn++;
        }

        if(turn == 106){
            System.out.println("botva :( ");
        }
        if(!first.isEmpty()){
            System.out.println("First " + turn);
        } else{
            System.out.println("Second " + turn);
        }
    }
}
