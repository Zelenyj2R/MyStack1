public class TestStack { 
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Nightingale");
        myStack.push("Heron");
        myStack.push("Tit");
        System.out.println("myStack" + myStack.size());
        System.out.println("myStack " + myStack.peek(0));
        myStack.pop();
        myStack.clear();
        System.out.println("myStack " + myStack.size());
        myStack.push("Nightingale");
        myStack.push("Heron");
        myStack.push("Tit");
        System.out.println("myStack" + myStack.size());
    }
}

