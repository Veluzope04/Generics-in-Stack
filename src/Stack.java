public class Stack <T> {

    private T [] stack;

    private  int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        this.top = -1;
        stack  = (T []) new Object[size];
    }

    public Boolean isfull(){
        return top == size-1;
    }

    public Boolean isempty(){
        return top == -1;
    }

    public T peek(){
        return stack[top];
    }

    public boolean push(T data){
        if (isfull()){
            return false;
        }
        stack[++top] = data;
        return true;
    }

    public T pop (){
        if (isempty()) {
            return null;
        }
        return stack[top --];

    }

}
