import java.util.Scanner;

public class PostfixExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.next();
        int k = 1;

        LabStack<Integer> st = new LabStack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                st.push(c - '0');
            }
            else {
                int a = st.pop();
                int b = st.pop();
                if (c == '+') {
                    st.push(a + b);
                } else if (c == '-') {
                    st.push(b - a);
                } else if (c == '*') {
                    st.push(a * b);
                } else if (c == '/') {
                    st.push(b / a);
                }
                System.out.println("Currently, the stack is >>  " + k + " " + st);
            }
        }

        System.out.println(s + " = " + st.pop());
    }
}

