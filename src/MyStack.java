import java.util.Arrays;

public class MyStack<T> implements StackInterface<T> {
    private static int capacity = 1;
    private Object[] array = new Object[capacity];
    private Object[] newElementRemove = new Object[capacity];
    private int size;
    private void grow() {
        array = Arrays.copyOf(array, capacity += 1);
    }
    public void push(T value) {
        if (size == capacity) {
            grow();
        }
        array[size] = value;
        size++;
    }
    @Override
    public T peek() {
        if (size == 0) {
            throw new RuntimeException("Stack is empty!");
        }
        return (T) array[(array.length) - 1];
    }
    @Override
    public T pop() {
        if (size == 0) {
            throw new RuntimeException("Nothing to pool! Stack is empty!");
        }
        var lastReturn = array[size - 1];
        array[size - 1] = null;
        size--;
        int countNewStack = 0;
        newElementRemove = new Object[capacity];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                newElementRemove[countNewStack] = array[i];
                countNewStack++;
            }
        }
        array = newElementRemove.clone();
        return (T) lastReturn;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Object[capacity];
        size = 0;
    }

    @Override
    public void printMyStack() {
        if (size == 0) {
            System.out.println("Stack is empty!");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}



