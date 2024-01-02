package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task();
    }

    static void task() {
        System.out.println("Input two indexes:");
        Scanner input = new Scanner(System.in);
        int firstIndex = input.nextInt();
        int secondIndex = input.nextInt();

        LR_1 firstArray = new LR_1(new int[]{1, 4, 5, 2, 2, 5});
        LR_1 secondArray = new LR_1();
        secondArray.inputArray();
        LR_1 thirdArray = new LR_1(firstArray.getArr(), secondArray.getArr());

        firstArray.print();
        secondArray.print();
        thirdArray.print();
        System.out.println("Sum of positive numbers in array: " + thirdArray.task2());
        System.out.println("Sum of numbers: " + thirdArray.task1(firstIndex, secondIndex));
    }
}
