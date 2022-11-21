public class lab2 {
    public static void main(String[] args) throws Exception {
        SLL<Integer> myList = new SLL<Integer>();
        myList.addToHead(9);
        myList.addToHead(7);
        myList.addToHead(50);
        myList.addToHead(3);
        myList.addToHead(5);
        myList.addToHead(7);

        System.out.println("Original Integer array: " + myList);


        System.out.print("After inserting 20 before index 4: ");
        myList.insertBefore(4,20);
        System.out.println(myList);

        System.out.println("Element deleted from index 4: ");
        myList.delete(4);
        System.out.println("After deleting element from index 4: "+myList);

        System.out.print("After inserting 30 after the second occurence of 7: ");
        myList.insertAfterSecondOccurrence(30,7);
        System.out.println(myList);

    }
}
