package chapter_10;

public class Parcel11 {

    static int name;

    int dream ;

    private static class ParcelContents implements Contents{
        private int i = 11;

        @Override
        public int value(){
            name = i;
            return i;
        }
    }
    protected static class ParcelDestination implements Destination{

        private String label;

        @Override
        public String readLabel() {
            return label;
        }

        private ParcelDestination(String whereTo){
            label = whereTo;
        }

        public static void f(){}

        static int x = 10;
        static class AnotherLevel{
            public static void f(){}
            static int x = 10;
        }

    }
    public static Destination destination(String s){
        return new ParcelDestination(s);
    }

    public static Contents contents(){
        return new ParcelContents();
    }

    public Destination P(){
        return new Destination() {
            @Override
            public String readLabel() {
                return null;
            }
        };
    }
    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("aaaa");
        Parcel11 parcel11 = new Parcel11();
        Destination ds = parcel11.P();
        ds.readLabel();


    }

}
