import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Palindrome {

    public static void main(String[] args) {

        String input = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        boolean isPalindrome = true;


        while (!stack.isEmpty() && !queue.isEmpty()) {

            char fromStack = stack.pop();     // Last In First Out
            char fromQueue = queue.remove();  // First In First Out

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}