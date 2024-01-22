package Task08Fánk;

public class LekvárosFánk extends KlasszikusFánk{

    public String gyümölcstartalom;

    public LekvárosFánk(){
    }

    public String getGyümölcstartalom() {
        return gyümölcstartalom;
    }

    public void setGyümölcstartalom(String gyümölcstartalom) {
        this.gyümölcstartalom = gyümölcstartalom;
    }

    public void lekvártöltelékKészíts(){
        System.out.println("A lekvártöltelék készítéséhez sok idő kell");

    }

    @Override
    public String toString() {
        return "LekvárosFánk{" +
                "gyümölcstartalom='" + gyümölcstartalom + '\'' +
                '}';
    }
}
