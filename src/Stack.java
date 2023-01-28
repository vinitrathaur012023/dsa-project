public class Stack {
    int[] arr;
    int top;
    Stack(int capacity){
        arr = new int[capacity];
        top=0;

    }
    Stack(){
        this(20);
    }
//to push a value
    public void push(int data){
        arr[top++]=data;
    }
    // the size
    public boolean isfull(){
        return top ==arr.length;
    }

    public static void main(String[] args) {


        Stack st = new Stack();
        st.push(20);

    }
}
