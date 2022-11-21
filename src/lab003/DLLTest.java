public class DLLTest {
    public static void main(String[] args) {
        DLL<String> test = new DLL<String>(),temp = new DLL<String>();
        for(int i = 0; i < 5; i++)
            test.addToTail("a" + i);
        test.printAll();
        for(int i = 5; i < 10; i++)
            temp.addToTail("a" + i);
        test.insertAlternate(temp);
        test.printAll();
    }
}