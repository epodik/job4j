package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenSearchAll() {
        Tracker tracker = new Tracker();
        Tracker tracker1 = new Tracker();
        tracker.add(new Item("test1"));
        tracker.add(new Item("test2"));
        tracker1.add(new Item("test1"));
        tracker1.add(new Item("test2"));
        Item[] result = tracker.findAll();
        Item[] result1 = tracker1.findAll();
        for (int i = 0; i < result.length; i++) {
            assertThat(result[i].getName(), is(result1[i].getName()));
        }
    }

    @Test
    public void whenSearchByName() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("test1"));
        tracker.add(new Item(null));
        tracker.add(new Item("test2"));
        tracker.add(new Item("test1"));
        Item[] result = tracker.findByName("test1");
        for (int i = 0; i < result.length; i++) {
            assertThat(result[i].getName(), is("test1"));
        }
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}