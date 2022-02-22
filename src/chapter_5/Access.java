package chapter_5;

class Base{
    private String name;
    protected int id;
    public String key;
    protected void set(String name){
        this.name = name;
    }
    public Base(String name){
        this.name = name;
    }

    void setId(int id){
        this.id = id;
    }

    public void setId(){

    }
    public String toString(){
        return "name is:" + name;
    }

    public static void main(String[] args) {
        Base base = new Base("123");
        System.out.print(base.name);
    }
}


public class Access extends Base{

    private int orcNumber;

    public Access(String name,int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }

    @Override
    protected void setId(int id){
        this.id = id;
    }

    public static void main(String[] args) {
        Access access = new Access("123",123);
        Base base = new Access("321",321);
        base.set("123");
        access.orcNumber = 12;
    }



}
