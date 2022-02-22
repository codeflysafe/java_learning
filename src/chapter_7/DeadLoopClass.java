package chapter_7;

public class DeadLoopClass {

    static {
        if(true){
            System.out.println(Thread.currentThread() + "init deadploop class\n");
            while (true){

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable script = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + "start\n");
                DeadLoopClass deadLoopClass = new DeadLoopClass();
                System.out.println(Thread.currentThread() + "end\n");
            }
        };
        Thread thread = new Thread(script);
        Thread thread1 = new Thread(script);
        thread.start();
        thread1.start();
        Thread.sleep(1000);
        System.out.println(" Over!");
    }
}
