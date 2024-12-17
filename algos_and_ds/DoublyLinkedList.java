package algos_and_ds;

public class DoublyLinkedList {

    // Внутренний класс для представления узла списка
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

    private Node head; // Ссылка на первый узел списка
    private Node tail; // Ссылка на последний узел списка

    // Конструктор для инициализации пустого списка
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Метод для добавления элемента в начало списка
    public void addFirst(int data) {
        Node newNode = new Node(data); // Создаем новый узел
        if (head == null) {
            head = newNode;
            tail = newNode; // Если список пуст, новый узел становится и головой, и хвостом
        } else {
            newNode.next = head; // Новый узел указывает на текущий первый узел
            head.prev = newNode; // Текущий первый узел указывает на новый узел как на предыдущий
            head = newNode; // Голова списка теперь указывает на новый узел
        }
    }

    // Метод для добавлен��я элемента в конец списка
    public void addLast(int data) {
        Node newNode = new Node(data); // Создаем новый узел
        if (tail == null) {
            head = newNode;
            tail = newNode; // Если список пуст, новый узел становится и головой, и хвостом
        } else {
            newNode.prev = tail; // Новый узел указывает на текущий последний узел как ��а предыдущий
            tail.next = newNode; // Текущий последний узел указывает на новый узел как на следующий
            tail = newNode; // Хвост списка теперь указывает на новый узел
        }
    }

    // Метод для удаления первого элемента списка
    public void removeFirst() {
        if (head != null) {
            if (head.next == null) {
                head = null;
                tail = null; // Если в списке был только один элемент, очищаем список
            } else {
                head = head.next; // Голова списка теперь указывает на второй узел
                head.prev = null; // Новый первый узел не имеет предыдущего узла
            }
        }
    }

    // Метод для удаления последнего элемента списка
    public void removeLast() {
        if (tail != null) {
            if (tail.prev == null) {
                head = null;
                tail = null; // Если в списке был только один элемент, очищаем список
            } else {
                tail = tail.prev; // Хвост списка теперь указывает на предпоследний узел
                tail.next = null; // Новый последний узел не имеет следующего узла
            }
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
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.display(); // 10 20 30
        list.removeFirst();
        list.display(); // 20 30
        list.removeLast();
        list.display(); // 20
    }
}

/*
Node: Внутренний класс, представляющий узел списка. Содержит данные (data), ссылку на следующий узел (next) и ссылку на предыдущий узел (prev).
head: Ссылка на первый узел списка.
tail: Ссылка на последний узел списка.
DoublyLinkedList(): Конструктор для инициализации пустого списка.
addFirst(int data): Метод для добавления элемента в начало списка.
addLast(int data): Метод для добавления элемента в конец списка.
removeFirst(): Метод для удаления первого элемента списка.
removeLast(): Метод для удаления последнего элемента списка.
display(): Метод для отображения всех элементов списка.
main(String[] args): Основной метод для тестирования функциональности списка.*/
