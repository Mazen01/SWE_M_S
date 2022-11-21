public class studyRecurison {
    public static void main(String[] args) {
        int[] x = {0,1,1,1,0,1,0};
        System.out.println(x.length);
        f4(5);
    }
    public static void f4(int a){
        if (a >0)
            f4(a-1);
        System.out.print(a+" ");
        // non- tail
    }
}
