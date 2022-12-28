public class MyStack <T> implements StackInterface<T> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    @Override
    public void push(T element) {
        array[pointer] = element;
        System.out.println(pointer + "  " + array[pointer]);
        pointer++;

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
        if (pointer == 0) {

            return null;
        }

        pointer--;
        return (T) array[pointer];
    }

    @Override
    public T poll() {
        if (size()==0)
            return null;
        T element = (T) array[1];
        remove(0);
        return element;
    }

    @Override
    public T remove(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length/2);

                return null;
    }

    @Override
    public int size() {
        return pointer;
    }

    @Override
    public void clear() {
        for (int i = 0; i<=pointer; i++)
            array[pointer] = null;
        pointer = 0;

    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
