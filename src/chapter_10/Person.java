package chapter_10;


interface Animal{
    void run();

    default void print(){
        System.out.println(" Animal is run !");
    }
}

interface Cell extends Animal{
    void run();

    default void print(){
        System.out.println(" Cell is move !");
    }
}

public class Person implements Animal, Cell{

    public void run(){

    }

//    // 不实现此方法会报错
//    @Override
//    public void print() {
//        Animal.super.print();
//    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.print();
    }
}
