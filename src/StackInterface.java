public interface StackInterface <T> {

    void push(T element);
    T get(int index);
    T peek(int i);
    T pop();
    T poll();
    T remove(int index);
    int size();
    void clear();
}
