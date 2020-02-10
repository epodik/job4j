package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askInt("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] result = tracker.findAll();
                for (int i = 0; i < result.length; i++) {
                    System.out.println("name: " + result[i].getName() + " id: " + result[i].getId());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                String id = input.askStr("Enter id: ");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.replace(id, item);
                Item result = tracker.findById(id);
                if (result != null) {
                    System.out.println("=== Успешное редактирование ===");
                    System.out.println("name: " + result.getName() + " id: " + result.getId());
                } else {
                    System.out.println("=== Нет такого id ===");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                String id = input.askStr("Enter id: ");
                Item result = tracker.findById(id);
                if (result != null) {
                    tracker.delete(id);
                    System.out.println("=== Успешное удаление ===");
                } else {
                    System.out.println("=== Нет такого id ===");
                }

            } else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                String id = input.askStr("Enter id: ");
                Item result = tracker.findById(id);
                if (result == null) {
                    System.out.println("===Нет такого id===");
                } else {
                    System.out.println("name: " + result.getName() + " id: " + result.getId());
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                String name = input.askStr("Enter name: ");
                Item[] result = tracker.findByName(name);
                for (int i = 0; i < result.length; i++) {
                    System.out.println("name: " + result[i].getName() + " id: " + result[i].getId());
                }
                if (result.length == 0) {
                    System.out.println("=== Ничего не нашлось ===");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }


    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}