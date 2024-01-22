package Task12Sport;

public class SemiFinal implements Event, Sport{

    private String eventName;

    @Override
    public void setEventName() {
        eventName="Világbajnoki elődöntő";
    }

    @Override
    public String getLocation() {
        return "Puskás Aréna";
    }

    @Override
    public void setSetHomeTeam(String team) {

    }

    @Override
    public void setAwayTeam(String team) {

    }

    @Override
    public String getSportType() {
        return "labdarugás";
    }
}
