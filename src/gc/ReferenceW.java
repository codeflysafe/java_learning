package gc;

import java.lang.ref.WeakReference;

public class ReferenceW {

    public static void main(String[] args) throws InterruptedException {
        WeakReference r = new WeakReference("I'm here");
        Object r2 = "123123";

        System.out.println(r2 + " / " + r.get());
        System.gc();

//        Thread.sleep(2000);
        System.out.println(r2 + " / " + r.get());

    }

}
