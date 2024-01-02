package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task();
       // checkSorts();
    }
    static void checkSorts(){
        LR_1 first = new LR_1();
        LR_1 second = new LR_1();
        System.out.println("Bubble sort:");

        long bubbleTime = System.currentTimeMillis();
        first.bubbleSort();
        System.out.println(System.currentTimeMillis() - bubbleTime);
        first.print();
        System.out.println("Shaker sort:");
        long shakerTime = System.currentTimeMillis();
        second.shakerSort();
        System.out.println(System.currentTimeMillis() - shakerTime);
        second.print();
    }
    static void task() {
        LR_1 firstArray = new LR_1(new int[]{1, 4, 5, 2, 2, 5});
        LR_1 secondArray = new LR_1();
        secondArray.inputArray();
        LR_1 thirdArray = new LR_1(firstArray.getArr(), secondArray.getArr());
        firstArray.shakerSort();
        secondArray.shakerSort();
        thirdArray.shakerSort();

        firstArray.print();
        secondArray.print();
        thirdArray.print();
        System.out.println("Multiply between min and max el in array:");
        System.out.println(thirdArray.calculate(thirdArray.indexOfMin(), thirdArray.indexOfMax()));

        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        int index = in.nextInt();
        if (thirdArray.getLength() < index) {
            System.out.println("We can not calculate multiply.");
        } else {
            System.out.println(thirdArray.calculate(thirdArray.indexOfMin(), thirdArray.indexOfMax()));
        }
    }
}
