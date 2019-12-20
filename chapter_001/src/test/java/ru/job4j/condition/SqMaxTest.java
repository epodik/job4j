package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {

    @Test
    public void whenFirstMax() {
        int result = SqMax.max(5, 4, 3, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax() {
        int result = SqMax.max(1, 5, 3, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenThirdMax() {
        int result = SqMax.max(1, 4, 5, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenForthMax() {
        int result = SqMax.max(1, 4, 3, 5);
        assertThat(result, is(5));
    }

}
