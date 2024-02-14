package stackpractice;

public class StackPractice {
    private Stack top = null;
    private int size;

    public void push(int data) {
        Stack s = new Stack(data);
        if (top == null) {
            top = s;
            size++;
            return;
        }
        s.next = top;
        top = s;
        size++;
    }

    public void pop() throws Exception {
        if (size == 0) {
            throw new Exception("Stack is UnderFlow");
        }
        int seen = top.data;
        top = top.next;
        size--;
        System.out.println("The Poped Data in Stack : " + seen);

    }

    public void peek() {
        if(size==0){
            System.out.println("There is no peek element");
        }
        System.out.println("The Peek Data in Stack : " + top.data);
    }

    public void dishPlay() {
        Stack temp = top;
        while (temp != null) {
            System.out.println("|" + temp.data + "|");
            temp = temp.next;
        }
        System.out.println("--------------------------");
    }

    public void getSize() {
        System.out.println("The Size of Stack : " + size);
    }

}
