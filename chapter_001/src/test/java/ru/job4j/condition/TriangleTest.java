package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Triangle trg = new Triangle(new Point(1, 1), new Point(4, 5), new Point(5, 2));
        boolean result = trg.exist();
        assertThat(result, is(true));
    }

    @Test
    public void whenNotExist() {
        Triangle trg = new Triangle(new Point(1, 1), new Point(3, 3), new Point(8, 8));
        boolean result = trg.exist();
        assertThat(result, is(false));
    }
}