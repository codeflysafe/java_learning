package chapter_1;

public class HelloDate{

    void helloDate(){
        System.out.print("Hello, World!");

        int b = 12>=0?1:-1;

        System.out.print(b);
    }

    public static void main(String[] args) {
        HelloDate helloDate = new HelloDate();
        helloDate.helloDate();


    }
}