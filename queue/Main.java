import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//        Deque<String> q = new LinkedList<>();
//        q.offerFirst("Kirill");
//        System.out.println(q.pollFirst());
//        q.offerLast("Nastya");


//        Deque<String> q = new ArrayDeque<>();
//        q.offerFirst("Kirill");
//        System.out.println(q.pollFirst());
//        q.offerLast("Nastya");

        //       Stack<String> stack = new Stack<>();
        Deque<String> stack = new ArrayDeque<>();
        stack.push("Kirill");
        stack.push("Nastya");
        stack.push("Vitaly");

        // System.out.println(stack.pop());

        while (!stack.isEmpty()) {
            String s = stack.pop();
            System.out.println(s);
        }

    }
}