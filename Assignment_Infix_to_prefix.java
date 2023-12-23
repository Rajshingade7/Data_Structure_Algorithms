import java.util.Scanner;

public class Assignment_Infix_to_prefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix expression");
        String infixExpression = sc.next();

        String prefix = convertToPrefix(infixExpression);
        System.out.println("Prefix Expression: " + prefix);
    }

    static String convertToPrefix(String infix) {
        StringBuilder prefix = new StringBuilder();
        Assignment_Infix_to_prefix stack = new Assignment_Infix_to_prefix();
        stack.createStack(infix.length());

        for (int i = 0; i < infix.length(); i++) {
            char currentChar = infix.charAt(i);
            if (Character.isLetterOrDigit(currentChar)) {
                prefix.append(currentChar);
            } else if (currentChar == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    prefix.append(stack.pop());
                }
                stack.pop(); // Pop '('
            } else if (currentChar == '(') {
                stack.push(currentChar);
            } else {
                while (!stack.isEmpty() && precedence(currentChar) <= precedence(stack.peek())) {
                    prefix.append(stack.pop());
                }
                stack.push(currentChar);
            }
        }

        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }

        return prefix.toString();
    }

    static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    char stack[];
    int tos, maxSize;

    void createStack(int size) {
        stack = new char[size];
        maxSize = size;
        tos = -1;
    }

    void push(char element) {
        stack[++tos] = element;
    }

    boolean isEmpty() {
        return tos == -1;
    }

    char pop() {
        return stack[tos--];
    }

    char peek() {
        return stack[tos];
    }
}
