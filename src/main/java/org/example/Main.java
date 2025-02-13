package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task_01 task_01 = new Task_01();
        System.out.println(Arrays.toString(task_01.twoSum(new int[]{3, 3, 9, 7, 2}, 16)));
    }
}