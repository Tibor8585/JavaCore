package Task08Fánk;

public class CsokisFánk extends KlasszikusFánk{
    public String kakaoTartalom;

    public CsokisFánk(){

    }

    public String getKakaoTartalom() {
        return kakaoTartalom;
    }

    public void setKakaoTartalom(String kakaoTartalom) {
        this.kakaoTartalom = kakaoTartalom;
    }

    public void csokitöltelékKészítés(){
        System.out.println("Fontos szerepe van a csokitöltetlék elkészítésének..");
    }

    @Override
    public String toString() {
        return "CsokisFánk{" +
                "kakaoTartalom=" + kakaoTartalom +
                '}';
    }
}
