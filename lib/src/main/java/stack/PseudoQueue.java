package stack;

public class PseudoQueue <T>{


    Stack<T> stackInstance1 = new Stack<T>();
    Stack<T> stackInstance2 = new Stack<T>();


    public void enqueue(T value) throws Exception {
        while(true){
            if (! stackInstance1.empty()){
                stackInstance2.push((T) stackInstance1.pop());
            }else{
                break;
            }
        }

        stackInstance1.push(value);

        while (true){
            if (!stackInstance2.empty()){
                stackInstance1.push((T) stackInstance2.pop());
            }else{
                break;
            }
        }
    }

    public T dequeue() throws Exception {
        T returnValue= null;
        if(! stackInstance1.empty()){
            returnValue = (T) stackInstance1.top.value;
            stackInstance1.pop();
        }
        return returnValue;
    }


}
