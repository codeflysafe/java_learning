package chapter_2;

public class JavaVMStackSIF {
    private int stackLength = 1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSIF oom = new JavaVMStackSIF();
        try {
            oom.stackLeak();
        }catch (Exception e){
            System.out.println("Stack length:" + oom.stackLength);
            throw e;
        }
    }
}
