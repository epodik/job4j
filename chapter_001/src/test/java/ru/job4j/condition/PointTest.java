package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance1() {
        double expected = 5;
        Point first = new Point(1, 1);
        Point second = new Point(5, 4);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        double expected = 3.74;
        Point first = new Point(3, 7, 3);
        Point second = new Point(1, 4, 2);
        double dist = first.distance3d(second);
       Assert.assertEquals(expected, dist, 0.01);
    }
}
