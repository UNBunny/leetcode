package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task01 task01 = new Task01();
        System.out.println(Arrays.toString(task01.twoSum(new int[]{3, 3, 9, 7, 2}, 16)));

        Task09 task09 = new Task09();
        System.out.println(task09.isPalindrome(121));

        Task35 task35 = new Task35();
        System.out.println(task35.searchInsert(new int[]{1, 3, 5, 7, 9}, 4));
    }
}