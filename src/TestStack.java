public class TestStack {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Nightingale");
        myStack.push("Heron");
        myStack.push("Tit");
        System.out.println(myStack.peek());
        System.out.println("Let us use Pop");
        myStack.pop();
        System.out.println("This is our new Stack after Pop");
        myStack.printMyStack();
    }
}

