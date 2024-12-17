package algos_and_ds;

public class Tree {

    // Внутренний класс для представления узла дерева
    private static class Node {

        int data; // Данные, хранящиеся в узле
        Node left; // Ссылка на левый дочерний узел
        Node right; // Ссылка на правый дочерний узел

        // Конструктор для инициализации узла
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node root; // Ссылка на корневой узел дерева

    // Конструктор для инициализации пустого дерева
    public Tree() {
        this.root = null;
    }

    // Метод для добавления элемента в дерево
    public void add(int data) {
        root = addRecursive(root, data);
    }

    // Рекурсивный метод для добавления элемента в дерево
    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data); // Если текущий узел пуст, создаем новый узел
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data); // Добавляем элемент в левое поддерево
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data); // Добавляем элемент в правое поддерево
        }

        return current; // Возвращаем текущий узел
    }

    // Метод для проверки наличия элемента в дереве
    public boolean containsNode(int data) {
        return containsNodeRecursive(root, data);
    }

    // Рекурсивный метод для проверки наличия элемента в дереве
    private boolean containsNodeRecursive(Node current, int data) {
        if (current == null) {
            return false; // Если текущий узел пуст, элемент не найден
        }

        if (data == current.data) {
            return true; // Элемент найден
        }

        return data < current.data
                ? containsNodeRecursive(current.left, data) // Ищем элемент в левом поддереве
                : containsNodeRecursive(current.right, data); // Ищем элемент в правом поддереве
    }

    // Метод для обхода дерева в порядке in-order
    public void traverseInOrder() {
        traverseInOrderRecursive(root);
    }

    // Рекурсивный метод для обхода дерева в порядке in-order
    private void traverseInOrderRecursive(Node node) {
        if (node != null) {
            traverseInOrderRecursive(node.left); // Обходим левое поддерево
            System.out.print(node.data + " "); // Посещаем узел
            traverseInOrderRecursive(node.right); // Обходим правое поддерево
        }
    }

    // Основной метод для тестирования функциональности дерева
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);

        tree.traverseInOrder(); // 3 4 5 6 7 8 9
        System.out.println();

        System.out.println("Contains 5: " + tree.containsNode(5)); // true
        System.out.println("Contains 10: " + tree.containsNode(10)); // false
    }
}

/*
Node: Внутренний класс, представляющий узел дерева. Содержит данные (data), ссылку на левый дочерний узел (left) и ссылку на правый дочерний узел (right).
root: Ссылка на корневой узел дерева.
Tree(): Конструктор для инициализации пустого дерева.
add(int data): Метод для добавления элемента в дерево.
addRecursive(Node current, int data): Рекурсивный метод для добавления элемента в дерево.
containsNode(int data): Метод для проверки наличия элемента в дереве.
containsNodeRecursive(Node current, int data): Рекурсивный метод для проверки наличия элемента в дереве.
traverseInOrder(): Метод для обхода дерева в порядке in-order.
traverseInOrderRecursive(Node node): Рекурсивный метод для обхода дерева в порядке in-order.
main(String[] args): Основной метод для тестирования функциональности дерева. */
