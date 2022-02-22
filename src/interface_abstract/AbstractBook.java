package interface_abstract;

public abstract class AbstractBook {

    protected int name;

    public String desc;

    abstract int showName();

    AbstractBook(int name){
        this.name = name;
    }

}
