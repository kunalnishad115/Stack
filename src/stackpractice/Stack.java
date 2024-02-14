package stackpractice;

public class Stack {
    int data;
    Stack next;

    public Stack(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Stack{" + "data=" + data + ", next=" + next + '}';
    }
}


