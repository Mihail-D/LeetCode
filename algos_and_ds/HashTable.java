package algos_and_ds;

import java.util.LinkedList;

public class HashTable {

    // Внутренний класс для представления пары ключ-значение
    private static class Entry {

        String key; // Ключ
        int value; // Значение

        // Конструктор для инициализации пары ключ-значение
        Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final LinkedList<Entry>[] table; // Массив списков для хранения элементов
    private final int size; // Размер хэш-таблицы

    // Конструктор для инициализации хэш-таблицы заданного размера
    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Метод для вычисления хэш-кода для ключа
    private int hash(String key) {
        return Math.abs(key.hashCode()) % size;
    }

    // Метод для добавления пары ключ-значение в хэш-таблицу
    public void put(String key, int value) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Обновляем значение, если ключ уже существует
                return;
            }
        }
        table[index].add(new Entry(key, value)); // Добавляем новую пару ключ-значение
    }

    // Метод для получения значения по ключу
    public Integer get(String key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value; // Возвращаем значение, если ключ найден
            }
        }
        return null; // Возвращаем null, если ключ не найден
    }

    // Метод для удаления пары ключ-значение по ключу
    public void remove(String key) {
        int index = hash(key);
        table[index].removeIf(entry -> entry.key.equals(key)); // Удаляем пару ключ-значение, если ключ найден
    }

    // Метод для проверки наличия ключа в хэш-таблице
    public boolean containsKey(String key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                return true; // Возвращаем true, если ключ найден
            }
        }
        return false; // Возвращаем false, если ключ не найден
    }

    // Основной метод для тестирования функциональности хэш-таблицы
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        hashTable.put("one", 1);
        hashTable.put("two", 2);
        hashTable.put("three", 3);

        System.out.println("Value for 'one': " + hashTable.get("one")); // 1
        System.out.println("Value for 'two': " + hashTable.get("two")); // 2
        System.out.println("Value for 'three': " + hashTable.get("three")); // 3

        hashTable.remove("two");
        System.out.println("Contains 'two': " + hashTable.containsKey("two")); // false
    }
}

/*
Entry: Внутренний класс, представляющий пару ключ-значение. Содержит ключ (key) и значение (value).
table: Массив списков для хранения элементов хэш-таблицы.
size: Размер хэш-таблицы.
HashTable(int size): Конструктор для инициализации хэш-таблицы заданного размера.
hash(String key): Метод для вычисления хэш-кода для ключа.
put(String key, int value): Метод для добавления пары ключ-значение в хэш-таблицу.
get(String key): Метод для получения значения по ключу.
remove(String key): Метод для удаления пары ключ-значение по ключу.
containsKey(String key): Метод ��ля проверки наличия ключа в хэш-таблице.
main(String[] args): Основной метод для тестирования функциональности хэш-таблицы. */
