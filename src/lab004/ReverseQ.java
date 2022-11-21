import java.util.Scanner;

 public class ReverseQ {
        public static void main(String[] args) {
            LabStack<String> stack1 = new LabStack<>();
            LabQueue<String> queue2 = new LabQueue<>();

            System.out.print("Enter your input > ");
            Scanner in = new Scanner(System.in);

            String x = in.nextLine();
            String[] y = x.split(" ");
            for (String el: y)
                stack1.push(el);

            System.out.println("Now stack is > " + stack1);

            while(!stack1.isEmpty())
                queue2.enqueue(stack1.pop());

            while (!queue2.isEmpty())
                stack1.push(queue2.dequeue());
            System.out.println("After reverse the stack is > " + stack1);

        }
    }
