import java.util.Arrays;
import java.util.Scanner;


    public class postfixMhmd {
        public static void main(String[] args) {
            LabStack<Integer> stack = new LabStack<>();
            System.out.print("Enter your <postfix> expression: ");
            Scanner in = new Scanner(System.in);
            String[] arr = in.nextLine().split(" ");
            //print
            System.out.println(Arrays.toString(arr));

            for (String a: arr) {
                if(a.charAt(0) >= 48 && a.charAt(0) <= 57) // if chr is number
                    stack.push(Integer.parseInt(a));
                else{
                    try{
                        int n1 = stack.pop(), n2 = stack.pop();
                        if (a.charAt(0) == 42)                  // if chr is *
                            stack.push(n1 * n2);
                        else if (a.charAt(0) == 43)             // if chr is +
                            stack.push(n1 + n2);
                        else if (a.charAt(0) == 45)             // if chr is -
                            stack.push(n2 - n1);
                        else if (a.charAt(0) == 47)             // if chr is /
                            stack.push(n2 / n1);
                        System.out.println("Currently, the stack is >> " + stack);
                    }
                    catch (Exception e){
                        System.out.println("Your postfix expression is not valid.");
                        return;
                    }
                }

            }

            System.out.println(String.join(" ", arr) + " = " + stack.pop());

        }
    }
