package gc;

public class FinalizeEscapeGC {
    public  static FinalizeEscapeGC SAVE_HOOK = null;
    public void isAlive(){
        System.out.println("Yes, I'm alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new FinalizeEscapeGC();

        // 第一次拯救自己
        SAVE_HOOK = null;
        System.gc();

        Thread.sleep(500);

        if(SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("no, I'm dead!");
        }

        SAVE_HOOK = null;
        System.gc();

        Thread.sleep(500);

        if(SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("no, I'm dead!");
        }
    }
}
