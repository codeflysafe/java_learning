package chapter_10;

public class Parcel2 {

    class Contents{
        private int i = 11;
        public int value() {
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel() {
            return label;
        }
    }

    public Destination to(String s){
        return new Destination(s);
    }

    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        Contents c = new Contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p2 = new Parcel2();
        p2.ship("Tasmania");
        Parcel2 q2 = new Parcel2();
        Parcel2.Contents c = q2.contents();
        Parcel2.Destination d = q2.to("Borneo");

    }


}
