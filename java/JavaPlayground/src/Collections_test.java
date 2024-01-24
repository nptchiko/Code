import java.util.*;
import java.io.*;

class _HashMap {
    public static void print() {
        HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
        // new HashMap<Integer, Integer>(10, 0,75);
        // new HashMap<>();
        // new HashMao<>(Map map)l
        h1.put(1, 10);
        h1.put(3, 1);
        h1.put(3, 5);
        System.out.println(h1);
        h1.remove(3);
        System.out.println(h1);
        System.out.println(h1.containsKey(1));

        Set<Integer> s = h1.keySet();
        Collection<Integer> c = h1.values();

        System.out.println(s);
        System.out.println(c);
    }
}

class _Stack {
    public static void print() {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < 5; i++)
            stack.push(i);
        System.out.print(stack);

        System.out.println("");

        stack.pop();
        System.out.print(stack);

        System.out.println("");
        System.out.println(stack.peek());
    }
}
class _Queue {
    public static void print(){
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i = 0; i < 5; i++)
            queue.add(i);

        queue.offer(2);
        queue.offer(100); System.out.println(queue);
        System.out.println(queue.peek());

        queue.remove(2); queue.remove();

        System.out.println(queue);

    }
}
class Collections_test {
    public static void main(String[] args) {
        _Queue.print();
    }
}