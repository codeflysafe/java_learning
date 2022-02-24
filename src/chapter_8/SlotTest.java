package chapter_8;

public class SlotTest {


    public static void main(String[] args) {
        {
            byte[] placeholader = new byte[64*1024*1024];
        }
        int a = 0;
        int b;
//        System.out.println(b);
        System.gc();

    }

}
