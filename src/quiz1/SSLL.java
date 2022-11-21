//**************************  SLL.java  *********************************
//           a generic singly linked list class

public class SSLL<T> {
    protected SSLLNode<T> head, tail;
    private SSLLNode<T> info;

    public SSLL() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToHead(T el) {
        head = new SSLLNode<T>(el, head);
        if (tail == null)
            tail = head;
    }

    public void addToTail(T el) {
        if (!isEmpty()) {
            tail.next = new SSLLNode<T>(el);
            tail = tail.next;
        } else head = tail = new SSLLNode<T>(el);
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
            SSLLNode<T> tmp;    // find the predecessor of tail;
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
                SSLLNode<T> pred, tmp;// and el is in a nonhead node;
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

    public void printAll() {
        for (SSLLNode<T> tmp = head; tmp != null; tmp = tmp.next)
            System.out.print(tmp.info + " ");
    }

    public boolean isInList(T el) {
        SSLLNode<T> tmp;
        for (tmp = head; tmp != null && !tmp.info.equals(el); tmp = tmp.next) ;
        return tmp != null;
    }


    public SSLLNode<T> equals(SSLL<T> list2) {
        SSLLNode<T> prev = head;
        SSLLNode<T> tmp2;

        int count = 0;

        for (tmp2 = head; tmp2 != null && !tmp2.info.equals(list2); tmp2 = tmp2.next) {
            prev = prev.next;
            count++;
        }

        return tmp2;
    }

//    public SLL<T> getEvenList() {
//
//    }
//    public SLL<T> getOddList() {
//
//    }

//    public SLL<T> mergeLists(SLL<T> list1, SLL<T> list2) {
//
//    }
}
