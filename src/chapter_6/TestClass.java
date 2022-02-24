package chapter_6;

public class TestClass {
    private int m;

    public int inc(){
        return m + 1;
    }

   public void onlyMe(String f){
        synchronized(f){
            System.out.println(f);
        }
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
    }
}
