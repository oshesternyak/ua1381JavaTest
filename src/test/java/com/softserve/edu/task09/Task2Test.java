package com.softserve.edu.task09;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    private Task2 task2 = new Task2();

    @BeforeEach
    public void before_each() {
        task2 = new Task2();
    }

    @Test
    void generateList() {
        List<Integer> list = task2.generateList(10);
        Assertions.assertEquals(10, list.size());
    }

    @Test
    void findMin() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(29);
        int actual = task2.findMin(list);
        Assertions.assertEquals(5, actual);
    }

    @Test
    void findMax() {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(18);
        list.add(81);
        int actual = task2.findMax(list);
        Assertions.assertEquals(81, actual);
    }

    @Test
    void calculateAverage() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(16);
        list.add(1);
        list.add(30);
        list.add(3);
        double expected = 12.0;
        double actual = task2.calculateAverage(list);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void containsNum() {
        List<Integer> list = new ArrayList<>();
        list.add(79);
        list.add(8);
        boolean actual = task2.containsNum(list, 8);
        Assertions.assertEquals(true, actual);

    }


}