package algos_and_ds;

public class Stack {

    // Массив для хранения элементов стека
    private final int[] stack;
    // Индекс верхнего элемента стека
    private int top;
    // Максимальный размер стека
    private final int size;

    // Конструктор для инициализации стека заданного размера
    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1; // Изначально стек пуст
    }

    // Метод для добавления элемента в стек
    public void push(int item) {
        if (top == size - 1) { // Проверка на переполнение стека
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = item; // Увеличиваем top и добавляем элемент
    }

    // Метод для удаления элемента из стека
    public int pop() {
        if (top == -1) { // Проверка на пустоту стека
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--]; // Возвращаем верхний элемент и уменьшаем top
    }

    // Метод для получения верхнего элемента стека без его удаления
    public int peek() {
        if (top == -1) { // Проверка на пустоту стека
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top]; // Возвращаем верхний элемент
    }

    // Метод для проверки, пуст ли стек
    public boolean isEmpty() {
        return top == -1; // Если top равен -1, стек пуст
    }

    // Метод для проверки, полон ли стек
    public boolean isFull() {
        return top == size - 1; // Если top равен size - 1, стек полон
    }

    // Метод для отображения всех элементов стека
    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Основной метод для тестирования функциональности стека
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        System.out.println("Popped: " + stack.pop());
        stack.display();
        System.out.println("Peeked: " + stack.peek());
        stack.display();
        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("Is full: " + stack.isFull());
    }
}
