package Task08Fánk;

public class Main {

    public static void main(String[] args) {
        KlasszikusFánk myFánk = new KlasszikusFánk();
        myFánk.setÍzesítés("porcukor");
        System.out.println(myFánk);

        CsokisFánk csokisFánk = new CsokisFánk();
        csokisFánk.csokitöltelékKészítés();
        csokisFánk.setKakaoTartalom("sok");
        System.out.println(csokisFánk);


        LekvárosFánk lekvárosFánk = new LekvárosFánk();
        lekvárosFánk.lekvártöltelékKészíts();
        lekvárosFánk.setGyümölcstartalom("kevés");
        System.out.println(lekvárosFánk);
    }
}
