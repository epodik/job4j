package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance1() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 5;
        int y2 = 4;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2() {
        int x1 = 3;
        int y1 = 1;
        int x2 = 7;
        int y2 = 4;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
