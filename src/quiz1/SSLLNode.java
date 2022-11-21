//************************  SLLNode.java  *******************************
//           node in a generic singly linked list class

public class SSLLNode<T> {
    public T info;
    public SSLLNode<T> next;
    public SSLLNode() {
        this(null,null);
    }
    public SSLLNode(T el) {
        this(el,null);
    }
    public SSLLNode(T el, SSLLNode<T> ptr) {
        info = el; next = ptr;
    }
}

