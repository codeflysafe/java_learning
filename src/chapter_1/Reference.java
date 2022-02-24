package chapter_1;

import java.util.ArrayList;
import java.util.List;

public class Reference {


    static class Book{
        public  int id;
        Book(int id){
            this.id = id;
        };

        @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    '}';
        }
    }

    // 值传递
    static void swap(int a,int b){
        a = a + b;
        b = 1;
    }
    static void swap(String a,String b){
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        String c = a;
        a = b;
        b = c;
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
    }

    static void swap(List<Integer> a){
        a.add(12);
    }

    static void swap(Book b1, Book b2){
        int tmp = b1.id;
        b1.id = b2.id;
        b2.id = tmp;
    }

    static void swapR(Book b1, Book b2){
        Book b = b1;
        b1 = b2;
        b2 = b1;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list);

        swap(list);
        System.out.println(list);

        String s1 = "123";
        String s2 = "234";
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        swap(s1,s2);
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        System.out.println(s1+ " / " +s2);

        Book b1 = new Book(10), b2 = new Book(20);
        System.out.println(b1);
        System.out.println(b2);
        swap(b1,b2);
        System.out.println(b1);
        System.out.println(b2);

        swapR(b1,b2);
        System.out.println(b1);
        System.out.println(b2);
    }

}
