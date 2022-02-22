package gc;

public class ReferenceCounter {
    public Object instance = null;
    public ReferenceCounter(){}

    // 1MB
    private static final int size = 1024*1024;

    private byte[] bytes = new byte[2*size];
    public static void main(String[] args) {
        ReferenceCounter r1 = new ReferenceCounter();
        ReferenceCounter r2 = new ReferenceCounter();
        r1.instance = r2;
        r2.instance = r1;

        r1 = null;
        r2 = null;

        // gc
        System.gc();
    }
}
