package chapter_2;


public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {

        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String ste2 = new StringBuilder("ja").append("va").toString();
        System.out.println(ste2.intern() == ste2);

        String ste3 = new StringBuilder("ja").append("va").toString();
        System.out.println(ste3.intern().equals(ste2.intern()));

        System.out.println("Over!");


    }
}
