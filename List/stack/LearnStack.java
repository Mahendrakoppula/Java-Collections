package List.stack;

import java.util.Stack;
//Last In First Out(LIFO)      First In Last Out(FILO)
public class LearnStack {
    public static void main(String[] args) {
        Stack<String> st= new Stack<>();
        st.push("lion");
        st.push("dog");
        st.push("horse");
        st.push("horse");
        System.out.println(st);

        //Peek to know which element is in top
        System.out.println(st.peek());

        st.pop();
        System.out.println(st.peek());
        System.out.println(st.empty());
        System.out.println(st.search("dog"));
        st.add("hello");
        System.out.println(st);
        st.addElement("loo");
        System.out.println(st);
        st.set(1,"pppo");
        System.out.println(st.toString());
    }

}
