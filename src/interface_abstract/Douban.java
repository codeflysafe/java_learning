package interface_abstract;

public class Douban implements Book
{
    @Override
    public void book() {
        System.out.println(" book ok !");
    }

    @Override
    public void print() {
        Book.super.print();
    }

    public static void main(String[] args) {
        Book book = new Douban();
        System.out.println(book.id);

//        book.id = 123;
    }
}
