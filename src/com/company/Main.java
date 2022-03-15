package com.company;

public class Main {

    public static void main(String[] args) {
//1
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

        float[] secondArray = {1.57f, 7.654f, 9.9856f};

        int[] thirdArray = {-10, 0, 10, 100};

//2
        for (int i = 0; i < firstArray.length -1; i++) {
            System.out.print(firstArray[i]+",");
        }
        System.out.println(firstArray[firstArray.length-1]);

        for (int i = 0; i < secondArray.length -1; i++) {
            System.out.print(secondArray[i]+",");
        }
        System.out.println(secondArray[secondArray.length-1]);

        for (int i = 0; i < thirdArray.length -1; i++) {
            System.out.print(thirdArray[i]+",");
        }
        System.out.println(thirdArray[thirdArray.length-1]);

//3
        for (int i = firstArray.length - 1; i > 0; i--) {
            System.out.print(firstArray[i]+",");
        }
        System.out.println(firstArray[0]);

        for (int i = secondArray.length - 1; i > 0; i--) {
            System.out.print(secondArray[i]+",");
        }
        System.out.println(secondArray[0]);

        for (int i = thirdArray.length - 1; i > 0; i--) {
            System.out.print(thirdArray[i]+",");
        }
        System.out.println(thirdArray[0]);

//4
        for (int i = 0; i < firstArray.length-1; i++) {
            if(firstArray[i]%2 != 0){
                firstArray[i] = firstArray[i]+1;
            }
            System.out.print(firstArray[i]+",");
        }
        if(firstArray[firstArray.length-1]%2 != 0){
            firstArray[firstArray.length-1] = firstArray[firstArray.length-1]+1;
        }
        System.out.println(firstArray[firstArray.length-1]);
    }
}
