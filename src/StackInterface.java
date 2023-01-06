public interface StackInterface <T> {
    void push(T element);
    T peek();
    T pop();
    int size();
    void clear();
    void printMyStack();
}
