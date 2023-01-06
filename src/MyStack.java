import java.util.Arrays;

public class MyStack<T> implements StackInterface<T> {
    private static int capacity = 10;
    private Object[] array = new Object[capacity];
    private Object[] newElementRemove = new Object[capacity];
    private int size;
    private void grow() {
        array = Arrays.copyOf(array, capacity *= 1.5);
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
        if (size() == 0)
            return null;
        return (T) array[size - 1];
    }
    @Override
    public T pop() {
        if (size == 0) {
            throw new RuntimeException("Nothing to pool! Stack is empty!");
        }
        var forReturn = array[0];
        array[0] = null;
        size--;
        int countNewStack = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=null) {
                newElementRemove[countNewStack] = array[i];
                countNewStack++;
            }
        }
        array = newElementRemove.clone();
        return (T) forReturn;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public void clear() {
        for (int i = 0; i <= size; i++)
            array[size] = null;
        size = 0;
    }

}
