//import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {

        System.out.println("Enter your exprison: ");
        Scanner k2 = new Scanner(System.in);
        String input = k2.nextLine();

        if (isBalanced(input))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

    static boolean isBalanced(String el)
    {
        LabStack<Character> stack = new LabStack<Character>();
        for (int i = 0; i < el.length(); i++)
        {
            char x = el.charAt(i);
            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
            }
            if (stack.isEmpty())
                return false;

            char check;
            if(x==')') {
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
            }
            else if(x=='}') {
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
            }
            else if(x==']') {
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }

        return (stack.isEmpty());
    }
}

