public class MyStack<T> implements StackInterface<T> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int size = 0;
    @Override
    public void push(T element) {
        array[size] = element;
        System.out.println(size + "  " + array[size]);
        size++;
    }
    @Override
    public T get(int index) {

        return (T) array[index];
    }
    @Override
    public T peek(int i) {
        if (size() == 0)
            return null;
        return (T) array[0];
    }
    @Override
    public T pop() {
        if (size == 0) {

            return null;
        }
        size--;
        return (T) array[size];
    }
    @Override
    public T poll() {
        if (size() == 0)
            return null;
        T element = (T) array[1];
        remove(0);
        return element;
    }
    @Override
    public T remove(int index) {
        for (int i = index; i < size; i++)
            array[i] = array[i + 1];
        array[size] = null;
        size--;
        if (array.length > INIT_SIZE && size < array.length / CUT_RATE)
            resize(array.length / 2);

        return null;
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
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
