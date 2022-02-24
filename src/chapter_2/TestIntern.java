package chapter_2;

public class TestIntern {

    public static void main(String[] args) {
        String s1 = "1";
        String s = new String("1");
        System.out.println(s1 ==  s.intern());

        String s2 = new String("1") + new String("1");

        String s3 = new StringBuilder("1").append("1").toString();
    }

}
