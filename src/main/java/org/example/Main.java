package org.example;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[8];
        boolean flag = true;
        int b = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(10) + 1;
            System.out.print(arr[i] + " ");
            if(b > arr[i]) flag = false;
            b = arr[i];
        }

        if(!flag) System.out.println("\nне является строго возрастающим");
        else System.out.println("\nявляет строго возрастающим");

        for(int i = 0; i < arr.length; i++){
            if((i % 2) == 1)
                arr[i] = 0;
            System.out.print(arr[i] + " ");
        }


    }
}