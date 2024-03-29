package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class LR_1 {
    private int[] arr;
    public int[] getArr(){
        return this.arr;
    }
    public int getLength(){
        return arr.length;
    }
    public void bubbleSort(){
        for (int i = arr.length-1; i > 0;i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        //Arrays.sort(arr);
    }
    public void shakerSort(){
        int left = 0, right = arr.length - 1;
        int flag = 1;
        while ((left < right) && flag > 0)
        {
            flag = 0;
            for (int i = left; i<right; i++)
            {
                if (arr[i]>arr[i + 1])
                {
                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                    flag = 1;
                }
            }
            right--;
            for (int i = right; i>left; i--)
            {
                if (arr[i - 1]>arr[i])
                {
                    int t = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = t;
                    flag = 1;
                }
            }
            left++;
        }
    }
    public LR_1(){
        this.arr= new int[]{1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,
                1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10,
                -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,
                1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10,
                -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0,1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,
                1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10,
                -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0,1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,
                1, 4, 4, 5, -10, -4, 0, 10, 1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10,
                -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 10,1, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 10,101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5,
                -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, 101, 4, 4, 5, -10, -4, 0, };
    }
    public LR_1(int[] array){
        this.arr=array;
    }
    public LR_1(int[] array1, int[] array2){
        this.arr = new int[array1.length+array2.length];
        System.arraycopy(array1, 0,arr,0,array1.length);
        System.arraycopy(array2,0,arr,array1.length,array2.length);
    }
    public int indexOfMin(){
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
            {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
    public int indexOfMax(){
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
    public int calculate(int minIndex, int maxIndex){
        int result = 1;
        minIndex = indexOfMin();
        maxIndex = indexOfMax();
        if (maxIndex > minIndex){
            for (int i = minIndex; i <= maxIndex; i++) {
                result = result*arr[i];
            }
        }else if(maxIndex < minIndex){
            for (int i = maxIndex; i < minIndex; i++) {
                result = result*arr[i];
            }
        }else {
            result = 0;
        }
        return result;
    }
    public void inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input array size:");
        int size = input.nextInt();
        this.arr= new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=input.nextInt();
        }
    }
    public void print(){
        System.out.println(Arrays.toString(this.arr));
    }
    public int getArrByIndex(int index){
        return this.arr[index];
    }

}
