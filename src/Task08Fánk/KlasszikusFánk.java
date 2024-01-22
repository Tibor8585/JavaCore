package Task08Fánk;

public class KlasszikusFánk {
    private String alak;
    private int méret;
    private String ízesítés;
    private String alapanyag;
    private boolean díszítés;

    public KlasszikusFánk() {

    }

    public void elfogy(){
        System.out.println("Gyorsan el fog fogyni.");
    }
    public void ízélmény(){
        System.out.println("Csodálatos ízálményt ad.");
    }
    public void megkel(){
        System.out.println("Sok idő kell neki, hogy megkelljen.");
    }
    public void táplál(){
        System.out.println("Nagyon táplál.");
    }
    public void hízlal(){
        System.out.println("A fánk sajnos nagyon hízlal.");
    }

    public String getAlak() {
        return alak;
    }

    public void setAlak(String alak) {
        this.alak = alak;
    }

    public int getMéret() {
        return méret;
    }

    public void setMéret(int méret) {
        this.méret = méret;
    }

    public String getÍzesítés() {
        return ízesítés;
    }

    public void setÍzesítés(String ízesítés) {
        this.ízesítés = ízesítés;
    }

    public String getAlapanyag() {
        return alapanyag;
    }

    public void setAlapanyag(String alapanyag) {
        this.alapanyag = alapanyag;
    }

    public boolean isDíszítés() {
        return díszítés;
    }

    public void setDíszítés(boolean díszítés) {
        this.díszítés = díszítés;
    }

    @Override
    public String toString() {
        return "KlasszikusFánk{" +
                "alak='" + alak + '\'' +
                ", méret=" + méret +
                ", ízesítés='" + ízesítés + '\'' +
                ", alapanyag='" + alapanyag + '\'' +
                ", díszítés=" + díszítés +
                '}';
    }
}
