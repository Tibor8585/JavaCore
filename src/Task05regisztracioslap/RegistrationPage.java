package Task05regisztracioslap;

public class RegistrationPage {
    private String email;
    private String name;
    private int birthdate;

    private int phone;
    private String workplace;

    public RegistrationPage(String email, String name, int birthdate) {
        this.email = email;
        this.name = name;
        this.birthdate = birthdate;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    @Override
    public String toString() {
        return "RegistrationPage{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", phone=" + phone +
                ", workplace='" + workplace + '\'' +
                '}';
    }
}
