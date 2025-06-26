package com.softserve.edu.task09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public List<Integer> generateList(int size) {
        Random random = new Random();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int randomInt = random.nextInt(100);
            list.add(randomInt);
        }
        return list;
    }

    public void printAll(List<Integer> list) {
        for (int n : list) {
            System.out.println(n);
        }
    }

    public int findMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public int findMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public double calculateAverage(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum = sum + num;
        }
        return sum / list.size();
    }

    public boolean containsNum(List<Integer> list, int num) {
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            if (n == num) {
                return true;
            }

        }
        return false;
    }


}
