package Task02auto;

public class auto {
    private String gyarto;
    private String tipus;
    private int evjarat;
    private int ajtokSzama;
    private String szin;


    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setEvjarat(int evjarat) {
        this.evjarat = evjarat;
    }

    public void setAjtokSzama(int ajtokSzama) {
        this.ajtokSzama = ajtokSzama;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public String getGyarto() {
        return gyarto;
    }

    public String getTipus() {
        return tipus;
    }

    public int getEvjarat() {
        return evjarat;
    }

    public int getAjtokSzama() {
        return ajtokSzama;
    }

    public String getSzin() {
        return szin;
    }

    @Override
    public String toString() {
        return "auto{" +
                "gyarto='" + gyarto + '\'' +
                ", tipus='" + tipus + '\'' +
                ", evjarat=" + evjarat +
                ", ajtokSzama=" + ajtokSzama +
                ", szin='" + szin + '\'' +
                '}';
    }
}
