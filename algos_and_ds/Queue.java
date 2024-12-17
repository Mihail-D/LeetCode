package algos_and_ds;

public class Queue {

    // Внутренний класс для представления узла очереди
    private static class Node {

        int data; // Данные, хранящиеся в узле
        Node next; // Ссылка на следующий узел

        // Конструктор для инициализации узла
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front; // Ссылка на первый узел очереди
    private Node rear; // Ссылка на последний узел очереди

    // Конструктор для инициализации пустой очереди
    public Queue() {
        this.front = null;
        this.rear = null;
    }

    // Метод для добавления элемента в конец очереди
    public void enqueue(int data) {
        Node newNode = new Node(data); // Созда��м новый узел
        if (rear == null) {
            front = newNode;
            rear = newNode; // Если очередь пуста, новый узел становится и началом, и концом
        } else {
            rear.next = newNode; // Текущий последний узел указывае�� на новый узел
            rear = newNode; // Новый узел становится последним
        }
    }

    // Метод для удаления элемента из начала очереди
    public int dequeue() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty"); // Если очередь пуста, выбрасываем исключение
        }
        int data = front.data; // Сохраняем данные первого узла
        front = front.next; // Голова очереди теперь указывает на второй узел
        if (front == null) {
            rear = null; // Если очередь стала пустой, обновляем указатель на конец
        }
        return data; // Возвращаем данные удаленного узла
    }

    // Метод для проверки, пуста ли очередь
    public boolean isEmpty() {
        return front == null; // Если front равен null, очередь пуста
    }

    // Метод для отображения всех элементов очереди
    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next; // Переходим к следующему узлу
        }
        System.out.println();
    }

    // Основной метод для тестирования функциональности очереди
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // 10 20 30
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display(); // 20 30
        System.out.println("Is empty: " + queue.isEmpty());
    }
}

/*
Node: Внутренний класс, представляющий узел очереди. Содержит данные (data) и ссылку на следующий узел (next).
front: Ссылка на первый узел очереди.
        rear: Ссылка на последний узел очереди.
Queue(): Конструктор для инициализации пустой очереди.
enqueue(int data): Метод для добавления элемента в конец очереди.
dequeue(): Метод для удаления элемента из начала очереди.
isEmpty(): Метод для проверки, пуста ли очередь.
display(): Метод для отображения всех элементов очереди.
main(String[] args): Основной метод для тестирования функциональности очереди.*/
