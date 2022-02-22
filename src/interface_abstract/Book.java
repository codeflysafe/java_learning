package interface_abstract;

public interface Book {

    int id = 12;

    void book();

    default void print(){
        System.out.println(" book ");
    }

}
