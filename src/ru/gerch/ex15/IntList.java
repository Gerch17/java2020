package ru.gerch.ex15;


import java.util.ArrayList;
import java.util.List;

public class IntList {
    private int[] array;
    private int size;

    public IntList(int cap){
        this.array = new int[cap];
    }

    public int size(){
        return size;
    }

    public int get(int i){
        return array[i];
    }

    public int search(int v){
        for (int i = 0; i < size; i++){
            if (array[i] == v){
                return i;
            }
        }
        return -1;
    }

    public void set(int i, int v){
        array[i] = v;
    }

    public void add(int v){
        if(size == array.length - 1){
            int[] tmp = array;
            array = new int[size + 6];
            System.arraycopy(tmp, 0, array, 0, size);
        }
        array[size++] = v;
    }

    public void remove(int index){
        int[] res = new int[size - 1];
        for (int i = 0, k = 0; i < size; i++){
            if (index == i){
                continue;
            }
            res[k++] = array[i];
        }
        this.array = res;
        size--;
    }

    public int getMax(){
        int max = array[0];
        for (int i = 1; i < size; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public int getMin(){
        int min = array[0];
        for (int i = 1; i < size; i++){

            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public double avg(){
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += array[i];
        }
        return (double) sum / size;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("IntegerList {");
        for (int i = 0; i < size; i++) {
            out.append(array[i]);
            out.append((i != size - 1) ? ", " : "");
        }
        out.append("}");
        return out.toString();
    }

}
