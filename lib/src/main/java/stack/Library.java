/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }



    public static void main(String[] args) throws Exception {
//        Stack  stack = new Stack();
//        System.out.println(stack.empty());
//        stack.push("a");
//        stack.push("b");
//        stack.push("c");
//        System.out.println(stack.toString());
//        System.out.println(stack.empty());
//        System.out.println(stack.peek());
//        stack.pop();
//        System.out.println(stack.peek());
//
//
//        Queue queue = new Queue();
//        System.out.println(queue.empty());
//        queue.enqueue("a");
//        queue.enqueue("b");
//        queue.enqueue("c");
//        System.out.println(queue.empty());
//        System.out.println(queue.toString());
//        System.out.println(queue.peek());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.peek());



        PseudoQueue<String> pseudoTest = new PseudoQueue<String>();
        pseudoTest.enqueue("a");
        pseudoTest.enqueue("b");
        pseudoTest.enqueue("c");
        pseudoTest.enqueue("d");



        System.out.println(pseudoTest.stackInstance1.toString());
        System.out.println(pseudoTest.dequeue());
        System.out.println(pseudoTest.stackInstance1.toString());
        System.out.println(pseudoTest.dequeue());
        System.out.println(pseudoTest.stackInstance1.toString());
        System.out.println(pseudoTest.dequeue());
        System.out.println(pseudoTest.stackInstance1.toString());
        System.out.println(pseudoTest.dequeue());
        System.out.println(pseudoTest.stackInstance1.toString());




    }
}
