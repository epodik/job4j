package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenFactFrom0() {
        int rsl = Fact.calc(0);
        assertThat(rsl, is(1));
    }
}
