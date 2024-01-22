package practiceAbstract;

public class Runner {
    public static void main(String[] args) {
        Eagle e = new Eagle();
        System.out.println(e.tweets());

        Seagull s = new Seagull();
        System.out.println(s.tweets());

    }
}
