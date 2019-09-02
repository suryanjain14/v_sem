import java.util.Stack;

public class Q23stack {

    static void pu(int a, Stack st) {
        st.push(new Integer(a));
        System.out.println(st.peek());
    }

    static void po(Stack st) {

        st.pop();
        System.out.println(st.peek());
    }

    public static void main(String[] args) {

        Stack st = new Stack();
        pu(27, st);
        pu(31, st);
        pu(42, st);
        po(st);
        po(st);
        st.peek();
    }


}
