package algos_and_ds;

public class SinglyLinkedList {

    // Внутренний класс для представления узла списка
    private static class Node {

        int data; // Данные, хранящиеся в узле
        Node next; // Ссылка на следующий узел

        // Конструктор для инициализации узла
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Ссылка на первый узел списка

    // Конструктор для инициализации пустого списка
    public SinglyLinkedList() {
        this.head = null;
    }

    // Метод для добавления элемента в начало списка
    public void addFirst(int data) {
        Node newNode = new Node(data); // Создаем новый узел
        newNode.next = head; // Новый узел указывает на текущий первый узел
        head = newNode; // Голова списка теперь указывает на новый узел
    }

    // Метод для добавления элемента в конец списка
    public void addLast(int data) {
        Node newNode = new Node(data); // Создаем новый узел
        if (head == null) {
            head = newNode; // Если список пуст, новый узел становится головой
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Идем до конца списка
            }
            current.next = newNode; // Последний узел указывает на новый узел
        }
    }

    // Метод для удаления первого элемента списка
    public void removeFirst() {
        if (head != null) {
            head = head.next; // Голова списка теперь указывает на второй узел
        }
    }

    // Метод для отображения всех элементов списка
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next; // Переходим к следующему узлу
        }
        System.out.println();
    }

    // Основной метод для тестирования функциональности списка
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.display(); // 10 20 30
        list.removeFirst();
        list.display(); // 20 30
    }
}

/*
Node: Внутренний класс, представляющий узел списка. Содержит данные (data) и ссылку на следующий узел (next).
head: Ссылка на первый узел списка.
SinglyLinkedList(): Конструктор для инициализации пустого списка.
addFirst(int data): Метод для добавления элемента в начало списка.
addLast(int data): Метод для добавления элемента в конец списка.
removeFirst(): Метод для удаления первого элемента списка.
display(): Метод для отображения всех элементов списка.
main(String[] args): Основной метод для тестирования функциональности списка.*/
