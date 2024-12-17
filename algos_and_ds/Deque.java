package algos_and_ds;

public class Deque {

    // Внутренний класс для представления узла очереди
    private static class Node {

        int data; // Данные, хранящиеся в узле
        Node next; // Ссылка на следующий узел
        Node prev; // Ссылка на предыдущий узел

        // Конструктор для инициализации узла
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node front; // Ссылка на первый узел очереди
    private Node rear; // Ссылка на последний узел очереди

    // Конструктор для инициализации пустой очереди
    public Deque() {
        this.front = null;
        this.rear = null;
    }

    // Метод для добавления элемента в начало очереди
    public void addFirst(int data) {
        Node newNode = new Node(data); // Создаем новый узел
        if (front == null) {
            front = newNode;
            rear = newNode; // Если очередь пуста, новый узел становится и началом, и концом
        } else {
            newNode.next = front; // Новый узел указывает на текущий первый узел
            front.prev = newNode; // Текущий первый узел указывает на новый узел как на предыдущий
            front = newNode; // Новый узел становится первым
        }
    }

    // Метод для добавления элемента в конец о��ереди
    public void addLast(int data) {
        Node newNode = new Node(data); // Создаем новый узел
        if (rear == null) {
            front = newNode;
            rear = newNode; // Если очередь пуста, новый узел становится и началом, и концом
        } else {
            newNode.prev = rear; // Новый узел указывает на текущий последний узел как на предыдущий
            rear.next = newNode; // Текущий последний узел указывает на новый узел как на следующий
            rear = newNode; // Новый узел становится последним
        }
    }

    // Метод для удаления элемента из начала очереди
    public int removeFirst() {
        if (front == null) {
            throw new IllegalStateException("Deque is empty"); // Если очередь пуста, выбрасываем исключение
        }
        int data = front.data; // Сохраняем данные первого узла
        front = front.next; // Голова очереди теперь указывает на второй узел
        if (front == null) {
            rear = null; // Если очередь стала пустой, обновляем указатель на конец
        } else {
            front.prev = null; // Новый первый узел не имеет предыдущего узла
        }
        return data; // Возвращаем данные удаленного узла
    }

    // Метод для удаления элемента из конца очереди
    public int removeLast() {
        if (rear == null) {
            throw new IllegalStateException("Deque is empty"); // Если очередь пуста, выбрасываем исключение
        }
        int data = rear.data; // Сохраняем данные последнего узла
        rear = rear.prev; // Хвост очереди теперь указывает на предпоследний узел
        if (rear == null) {
            front = null; // Если очередь стала пустой, обновляем указатель на начало
        } else {
            rear.next = null; // Новый последний узел не имеет следующего узла
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
        Deque deque = new Deque();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.display(); // 5 10 20
        System.out.println("Removed from front: " + deque.removeFirst());
        deque.display(); // 10 20
        System.out.println("Removed from rear: " + deque.removeLast());
        deque.display(); // 10
        System.out.println("Is empty: " + deque.isEmpty());
    }
}

/*
Node: Внутренний класс, представляющий узел очереди. Содержит данные (data), ссылку на следующий узел (next) и ссылку на предыдущий узел (prev).
front: Ссылка на первый узел очереди.
        rear: Ссылка на последний узел очереди.
Deque(): Конструктор для инициализации пустой очереди.
addFirst(int data): Метод для добавления элемента в начало очереди.
addLast(int data): Метод для добавления элемента в конец очереди.
removeFirst(): Метод для удаления элемента из начала очереди.
removeLast(): Метод для удаления элемента из конца очереди.
isEmpty(): Метод для проверки, пуста ли очередь.
display(): Метод для отображения всех элементов очереди.
main(String[] args): Основной метод для тестирования функциональности очереди.*/
