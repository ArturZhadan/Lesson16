package com.home;

public class Main {

    public static void main(String[] args) {
        int [] array = {1, 2, 2, 30, 5, 70, 44, 30};
        printArray(array);
        findDuplicateInArray(array);

    }
    public static void findDuplicateInArray(int [] array){
        for (int i = 0; i < array.length; i++){
            for (int j=i+1; j<array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
    }

    public static void printArray(int [] array){
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            if (i > 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
