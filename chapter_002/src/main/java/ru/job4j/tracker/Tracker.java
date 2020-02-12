package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item findById(String id) {
        int index = indexOf(id);
        if (index >= 0) {
            return items[index];
        } else {
            return null;
        }
    }

    public Item[] findByName(String key) {
        Item[] item = new Item[position];
        int index = 0;
        for (int i = 0; i < position; i++) {
            if (key.equals(items[i].getName())) {
                item[index++] = items[i];
            }
        }
        item = Arrays.copyOf(item, index);
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, position - index);
            items[position] = null;
            position--;
            return true;
        } else {
            return false;
        }
    }
}