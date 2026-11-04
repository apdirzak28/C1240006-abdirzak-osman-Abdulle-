



// Exercise: Stack Operations
// Learn how to use the Stack data structure - Last In, First Out (LIFO).

import java.util.Stack;

public class StackExercises {

    public static void main(String[] args) {

        // TODO: 1 - Create a Stack of Strings called 'stack'

        Stack<String> stack= new Stack<>();


        // TODO: 2 - Push 5 elements onto the stack: "Java", "Python", "C++", "JavaScript", "Go"

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");
        stack.push("Go");

        System.out.println("stack marka lagu push gareeyo "+ stack);


        // TODO: 3 - Peek at the top element without removing it
        //           Print the result (should be "Go")
        System.out.println("the top elemt is : " + stack.peek());


        // TODO: 4 - Pop an element from the stack and print it
        //           Then print the stack to see the remaining elements
        stack.pop();
        System.out.println("after pop "+ stack);


        // TODO: 5 - Check if the stack is empty using isEmpty()
        //           Print the result
        System.out.println("is stack empty " + stack.isEmpty());


        // --- String Reversal ---
        System.out.println("\n--- String Reversal ---");
        String original = "Hello World";
        // TODO: 6 - Use a Stack to reverse the string 'original'
        //           Push each character onto a stack, then pop them all to build the reversed string
        //           Print both original and reversed strings

        Stack<Character> xaraf=new Stack<>();
        for (int i=0;i<original.length();i++) {
            xaraf.push(original.charAt(i));
        }
        String reversed="";
        while (!xaraf.isEmpty()){
            reversed += xaraf.pop();
        }
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // --- Balanced Brackets ---
        System.out.println("\n--- Balanced Brackets ---");
        String balanced = "({[()]})";
        String unbalanced = "({[})";
        // TODO: 7 - Implement a balanced brackets checker
        //           Use a Stack to check if a string of brackets is balanced
        //           For each char: if opening bracket, push it; if closing bracket, check
        //           that the top of stack is the matching opening bracket
        //           Test with both 'balanced' and 'unbalanced' strings
        //           Print whether each string is balanced or not

        // Balanced string
        Stack<Character> brackets = new Stack<>();
        boolean check = true;

        for (int i = 0; i < balanced.length(); i++) {
            char ch = balanced.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                brackets.push(ch);
            } else {
                if (brackets.isEmpty()) {
                    check = false;
                    break;
                }

                char top = brackets.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    check = false;
                    break;
                }
            }
        }

        if (!brackets.isEmpty()) {
            check = false;
        }

        if (check == true) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }


// Unbalanced string
        Stack<Character> brackets2 = new Stack<>();
        boolean check2 = true;

        for (int i = 0; i < unbalanced.length(); i++) {
            char ch = unbalanced.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                brackets2.push(ch);
            } else {
                if (brackets2.isEmpty()) {
                    check2 = false;
                    break;
                }

                char top = brackets2.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    check2 = false;
                    break;
                }
            }
        }

        if (!brackets2.isEmpty()) {
            check2 = false;
        }

        if (check2 == true) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }

    }
}