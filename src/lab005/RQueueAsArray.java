// Java program to implement a queue using an array 
public class RQueueAsArray<T> {
    private int front, rear, capacity;
    private T[] queue;

    public RQueueAsArray(int capacity) {
        front = rear = -1;
        this.capacity = capacity;
        queue = (T[]) new Object[capacity];
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull(){
        return rear == capacity - 1;
    }

    // function to insert an element at the rear of the queue 
    public void enqueue(T data)  {
        if (isFull())
            throw new UnsupportedOperationException("lab006.Queue is full!");
        if(isEmpty())
            front++;

        rear++;
        queue[rear] = data;
    }


    //    public T dequeue() {
//        if (isEmpty())
//            throw new UnsupportedOperationException("lab006.Queue is empty!");
//        T temp = queue[front];
//        if (rear == 0) {
//            rear = front = -1;
//        }
//        else{
//            for(int i = 0; i <= rear - 1; i++) {
//                queue[i] = queue[i + 1];
//            }
//            rear--;
//        }
//        return temp;
//    }

    public T dequeue(int idx){
        if(idx>rear) throw new UnsupportedOperationException("lab006.Queue is empty!");
        if(idx == rear){
            rear--;
            if(rear == -1)front = rear;
            return null;
        }
        queue[idx] = queue[idx+1];
        return dequeue(idx+1);
    }
    public T dequeue(){
        T temp = peek();
        dequeue(0);
        return temp;
    }






    public boolean search(T e){
        if (isEmpty())
            throw new UnsupportedOperationException("lab006.Queue is empty!");

        for(int i = 0; i <= rear; i++)
            if(e.equals(queue[i]))
                return true;

        return false;
    }

    public String toString()  {
        if (isEmpty())
            throw new UnsupportedOperationException("lab006.Queue is empty!");

        String str = "";
        for (int i = 0; i <= rear; i++) {
            str = str + queue[i] + "   ";
        }

        return str;
    }

    public  T peek() {
        if (isEmpty())
            throw new UnsupportedOperationException("lab006.Queue is empty!");

        return queue[front];
    }
} 