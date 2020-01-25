package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To1Then1() {
        int result = Max.max(5, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenEqualThen1() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenThree() {
        int result = Max.max(2, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenFour() {
        int result = Max.max(3, 8, 2, 10);
        assertThat(result, is(10));
    }
}