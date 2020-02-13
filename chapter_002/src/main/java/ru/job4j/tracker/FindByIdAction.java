package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find by ID ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item result = tracker.findById(id);
        if (result == null) {
            System.out.println("=== Нет такого id ===");
        } else {
            System.out.println("name: " + result.getName() + " id: " + result.getId());
        }
        return true;
    }
}
