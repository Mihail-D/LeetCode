package algos_and_ds;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    // Внутренний класс для представления элемента очереди с приоритетом
    private static class Element implements Comparable<Element> {

        int data; // Данные, хранящиеся в элементе
        int priority; // Приоритет элемента

        // Конструктор для инициализации элемента
        Element(int data, int priority) {
            this.data = data;
            this.priority = priority;
        }

        // Метод для сравнения элементов по приоритету
        @Override
        public int compareTo(Element other) {
            return Integer.compare(this.priority, other.priority);
        }
    }

    private final PriorityQueue<Element> queue; // Очередь с приоритетами

    // Конструктор для инициализации пустой очереди
    public PriorityQueueExample() {
        queue = new PriorityQueue<>();
    }

    // Метод для добавления элемента в очередь
    public void enqueue(int data, int priority) {
        Element newElement = new Element(data, priority); // Создаем новый элемент
        queue.add(newElement); // Добавляем элемент в очередь
    }

    // Метод для удаления элемента с наивысшим приоритетом
    public int dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty"); // Если очередь пуста, выбрасываем исключение
        }
        return queue.poll().data; // Удаляем и возвращаем элемент с наивысшим приоритетом
    }

    // Метод для проверки, пуста ли очередь
    public boolean isEmpty() {
        return queue.isEmpty(); // Если очередь пуста, возвращаем true
    }

    // Метод для отображения всех элементов очереди
    public void display() {
        for (Element element : queue) {
            System.out.print("(" + element.data + ", " + element.priority + ") ");
        }
        System.out.println();
    }

    // Основной метод для тестирования функциональности очереди
    public static void main(String[] args) {
        PriorityQueueExample pq = new PriorityQueueExample();
        pq.enqueue(10, 2);
        pq.enqueue(20, 1);
        pq.enqueue(30, 3);
        pq.display(); // (20, 1) (10, 2) (30, 3)
        System.out.println("Dequeued: " + pq.dequeue());
        pq.display(); // (10, 2) (30, 3)
        System.out.println("Is empty: " + pq.isEmpty());
    }
}

/*
Element: Внутренний класс, представляющий элемент очереди с приоритетом. Содержит данные (data) и приоритет (priority).
compareTo(Element other): Метод для сравнения элементов по приоритету.
queue: Очередь с приоритетами.
PriorityQueueExample(): Конструктор для инициализации пустой очереди.
enqueue(int data, int priority): Метод для добавления элемента в очередь.
dequeue(): Метод для удаления элемента с наивысшим приоритетом.
isEmpty(): Метод для проверки, пус��а ли очередь.
display(): Метод для отображения всех элементов очереди.
main(String[] args): Основной метод для тестирования функциональности очереди.*/
