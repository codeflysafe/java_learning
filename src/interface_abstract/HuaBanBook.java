package interface_abstract;

public class HuaBanBook extends AbstractBook
{
    @Override
    int showName() {
        return this.name;
    }

    HuaBanBook(int name) {
        super(name);
    }

    public static void main(String[] args) {
        AbstractBook book = new HuaBanBook(123);
        book.showName();
    }
}
