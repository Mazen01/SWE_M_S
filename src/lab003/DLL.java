//****************************  DLL.java  *******************************
//                  generic doubly linked list class

public class DLL<T> {
    private DLLNode<T> head, tail;
    public DLL() {
        head = tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void setToNull() {
        head = tail = null;
    }
    public T firstEl() {
        if (head != null)
            return head.info;
        else return null;
    }
    public void addToHead(T el) {
        if (head != null) {
            head = new DLLNode<T>(el,head,null);
            head.next.prev = head;
        }
        else head = tail = new DLLNode<T>(el);
    }

    public void addToTail(T el) {
        DLLNode<T> k = new DLLNode<>(); // delet this
        k = (DLLNode<T>) el; // delet this
        if (tail != null) {
            tail = new DLLNode<T>(el,null,tail);
            tail.prev.next = tail;
        }
        else
//            head = tail = new DLLNode<T>(el); //get this back
            head = tail = k ; // delet this
    }
    public T deleteFromHead() {
        if (isEmpty())
            return null;
        T el = head.info;
        if (head == tail)   // if only one node on the list;
            head = tail = null;
        else {              // if more than one node in the list;
            head = head.next;
            head.prev = null;
        }
        return el;
    }
    public T deleteFromTail() {
        if (isEmpty())
            return null;
        T el = tail.info;
        if (head == tail)   // if only one node on the list;
            head = tail = null;
        else {              // if more than one node in the list;
            tail = tail.prev;
            tail.next = null;
        }
        return el;
    }
    public void printAll() {
        for (DLLNode<T> tmp = head; tmp != null; tmp = tmp.next)
            System.out.print(tmp.info + " ");
        System.out.println();
    }
    public T find(T el) {
        DLLNode<T> tmp;
        for (tmp = head; tmp != null && !tmp.info.equals(el); tmp = tmp.next);
        if (tmp == null)
            return null;
        else return tmp.info;
    }

///////////////code from here///////////
    public void printReverse(){
        for (DLLNode<T> tmp2 = tail ; tmp2 != null; tmp2 = tmp2.prev)
            System.out.print(tmp2.info + " ");
        System.out.println();
    }

///////////////////////////////////////
    public void delete7(){
        DLLNode<T> temp = head,temp1,temp2;
        if(temp==null)
            return;
        if(temp.next==null){
            head = null;
            tail = null;
            return;
        }
        int pos = 1;
        boolean direction = true;
        while(pos<7){
            pos++;
            if(direction && temp.next==null){
                direction = false;
            }
            else if(!direction && temp.prev==null){
                direction = true;
            }
            if(direction) temp = temp.next;
            else temp = temp.prev;
        }
        temp1 = temp.next;
        temp2 = temp.prev;
        if(temp.next == null){
            temp2.next = null;
            tail = temp2;
            return;
        }
        if(temp.prev == null){
            temp1.prev = null;
            head = temp1;
        }
        if(temp2!=null){
            temp2.next = temp1;
        }
        if(temp1!=null){
            temp1.prev = temp2;
        }
    }
///////////////////////////////////////

    void insertAlternate(DLL<T> newList){
        DLLNode<T> temp = head,temp1 = newList.head;
        if(temp == null){
            return;
        }
        while(temp!=null){
            DLLNode<T> temp2 = new DLLNode<T>(temp1.info,null,null),temp3 = temp.next;
            temp.next = temp2;
            temp2.prev = temp;
            temp2.next = temp3;
            if(temp3==null)tail = temp2;
            temp = temp2.next;
            temp1 = temp1.next;
        }
    }

    }


