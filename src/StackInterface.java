public interface StackInterface <T> {
    void push(T element);
    T peek(int i);
    T pop();
    int size();
    void clear();
}
