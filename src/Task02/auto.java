package Task02;

public class auto {
    private String gyarto;
    private String tipus;
    private int evjarat;
    private int ajtokszama;

    private String szin;


    public String getGyarto() {
        return gyarto;
    }

    public String getTipus() {

        return tipus;
    }

    public int getEvjarat() {
        return evjarat;
    }

    public int getAjtokszama() {
        return ajtokszama;
    }

    public String getSzin() {
        return szin;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setEvjarat(int evjarat) {
        this.evjarat = evjarat;
    }

    public void setAjtokszama(int ajtokszama) {
        this.ajtokszama = ajtokszama;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    @Override
    public String toString() {
        return "auto{" +
                "gyarto='" + gyarto + '\'' +
                ", tipus='" + tipus + '\'' +
                ", evjarat=" + evjarat +
                ", ajtokszama=" + ajtokszama +
                ", szin='" + szin + '\'' +
                '}';
    }
}
