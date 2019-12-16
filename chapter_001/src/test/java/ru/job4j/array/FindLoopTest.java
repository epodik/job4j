package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas2Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 2, 1};
        int value = 2;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas3ThenNo() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 9};
        int value = 3;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}