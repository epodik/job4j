package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("=== Успешное редактирование ===");
            System.out.println("name: " + item.getName() + " id: " + item.getId());
        } else {
            System.out.println("=== Нет такого id ===");
        }
        return true;
    }
}
