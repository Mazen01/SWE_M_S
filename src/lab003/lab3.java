public class lab3 {
    public static void main(String[] args) {
        DLL<Integer> test = new DLL<Integer>();
        for(int i = 0; i < 10; i++)
            test.addToTail((int)(Math.random()*100+1));
        for(int i = 0;i<10;i++){
            test.delete7();
            //test.printAll();
            test.printReverse();
        }

    }
}