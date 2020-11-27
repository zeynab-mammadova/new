package home;

import java.util.Stack;

public class MergeTwoStack {

    public static void main(String[] args) {


        Stack<String> stack1 = new Stack();

        // pushing the elements to the 1st stack
        stack1.push("Apple");
        stack1.push("Pea");
        stack1.push("Banana");

        Stack<String> stack2 = new Stack();

        // pushing the elements to the 2nd stack
        stack2.push("Orange");
        stack2.push("Strawberry");
        stack2.push("Grape");

        // Print the Merged Stack Elements
        System.out.println(stack1.addAll(stack2));


    }
}
