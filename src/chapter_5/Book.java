package chapter_5;

public class Book
{
    boolean checkedOut = false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }

    void checkIn(){
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        try{
            super.finalize();
            if(checkedOut){
                System.out.println("Error: checked out");
            }
        }finally {
            System.out.println(" Finished !");
        }
    }

    public static void main(String[] args) {
        Book book = new Book(true);
        book.checkIn();
        new Book(true);
        System.gc();

    }
}
