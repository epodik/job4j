package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] result = tracker.findByName(name);
        for (Item item : result) {
            System.out.println("name: " + item.getName() + " id: " + item.getId());
        }
        if (result.length == 0) {
            System.out.println("=== Ничего не нашлось ===");
        }
        return true;
    }
}
