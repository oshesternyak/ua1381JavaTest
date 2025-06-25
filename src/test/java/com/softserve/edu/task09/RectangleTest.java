package com.softserve.edu.task09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    private Rectangle rectangle;

    @BeforeEach
    public void setap() {
        rectangle = new Rectangle();
    }


    @Test
    public void calculateArea_positive() {

        double expected;
        double actual;

        expected = 1.0;
        actual = rectangle.calculateArea();

        Assertions.assertEquals(expected, actual, "Area is invalid");
    }

    @Test
    public void calculateArea_negative() {
        double expected;
        double actual;

        expected = 3;
        actual = rectangle.calculateArea();
        Assertions.assertNotEquals(expected, actual, "Area is invalid");
    }

    @Test
    public void calculatePerimeter_positive() {

        double expected;
        double actual;

        expected = 4.0;
        actual = rectangle.calculatePerimeter();

        Assertions.assertEquals(expected, actual, "Perimeter is invalid");

    }

    @Test
    public void calculatePerimeter_negative(){

        double expected;
        double actual;

        expected = 0;
        actual = rectangle.calculatePerimeter();
        Assertions.assertNotEquals(expected, actual, "Perimeter is invalid");
    }

    @Test
    public void getDiagonal_positive() {

        double expected;
        double actual;

        expected = 1.4142135623730951;
        actual = rectangle.getDiagonal();

        Assertions.assertEquals(expected, actual, "Diagonal is invalid");
    }

    @Test
    public void getDiagonal_negative(){

        double expected;
        double actual;

        expected = 0;
        actual = rectangle.getDiagonal();
        Assertions.assertNotEquals(expected, actual, "Diagonal is invalid");
    }


}
