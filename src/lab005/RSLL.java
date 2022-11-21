//**************************  SLL.java  *********************************
//           a generic singly linked list class 

public class RSLL<T> {

    private class RSLLNode<T> {
        private T info;
        private RSLLNode<T> next;

        public RSLLNode() {
            this(null, null);
        }

        public RSLLNode(T el) {
            this(el, null);
        }

        public RSLLNode(T el, RSLLNode<T> ptr) {
            info = el;
            next = ptr;
        }
    }

    protected RSLLNode<T> head, tail;

    public RSLL() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToHead(T el) {
        head = new RSLLNode<T>(el, head);
        if (tail == null)
            tail = head;
    }

    public void addToTail(T el) {
        if (!isEmpty()) {
            tail.next = new RSLLNode<T>(el);
            tail = tail.next;
        } else head = tail = new RSLLNode<T>(el);
    }

    public T deleteFromHead() { // delete the head and return its info;
        if (isEmpty())
            return null;
        T el = head.info;
        if (head == tail)       // if only one node on the list;
            head = tail = null;
        else head = head.next;
        return el;
    }

    public T deleteFromTail() { // delete the tail and return its info;
        if (isEmpty())
            return null;
        T el = tail.info;
        if (head == tail)       // if only one node in the list;
            head = tail = null;
        else {                  // if more than one node in the list,
            RSLLNode<T> tmp;    // find the predecessor of tail;
            for (tmp = head; tmp.next != tail; tmp = tmp.next) ;
            tail = tmp;        // the predecessor of tail becomes tail;
            tail.next = null;
        }
        return el;
    }

    public void delete(T el) {  // delete the node with an element el;
        if (!isEmpty())
            if (head == tail && el.equals(head.info)) // if only one
                head = tail = null;       // node on the list;
            else if (el.equals(head.info)) // if more than one node on the list;
                head = head.next;    // and el is in the head node;
            else {                    // if more than one node in the list
                RSLLNode<T> pred, tmp;// and el is in a nonhead node;
                for (pred = head, tmp = head.next;
                     tmp != null && !tmp.info.equals(el);
                     pred = pred.next, tmp = tmp.next)
                    ;
                if (tmp != null) {   // if el was found;
                    pred.next = tmp.next;
                    if (tmp == tail) // if el is in the last node;
                        tail = pred;
                }
            }
    }

//    @Override
//    public String toString() {
//        if(head == null)
//            return "[ ]";
//        String str = "[ ";
//        RSLLNode<T> tmp = head;
//        while(tmp != null){
//            str += tmp.info + " ";
//            tmp = tmp.next;
//        }
//        return str+"]";
//    }


    @Override
    public String toString() {
        String str = toStringHelper(head);
        return "[" + str + "]";
    }

    private String toStringHelper(RSLLNode<T> newNode) {
        if (newNode == null) {
            return "";
        }
        return newNode.info + " " + toStringHelper(newNode.next);

    }


//    public boolean contains(T el) {
//        if(head == null)
//            return false;
//
//        RSLLNode<T> tmp = head;
//        while(tmp != null){
//            if(tmp.info.equals(el))
//                return true;
//            tmp = tmp.next;
//        }
//        return false;
//    }

    public boolean contains(T el) {
        return containshelper(head, el);
    }

    public boolean containshelper(RSLLNode<T> newNode, T el) {
        if (newNode == null) {
            return false;
        }
        if (newNode.info.equals(el)) {
            return true;
        }
        return containshelper(newNode.next, el);
    }


    public int size() {
        if (head == null)
            return 0;

        int count = 0;
        RSLLNode<T> p = head;
        while (p != null) {
            count++;
            p = p.next;
        }

        return count;
    }
}