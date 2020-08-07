package at.ac.univie.hci.informationssicherheit;

public class User {
    String vorname;
    String nachname;
    String nickname;
    String password;
    int punkten;

    public User(String vorname, String nachname, String nickname, String password, int punkten){
        this.vorname = vorname;
        this.nachname = nachname;
        this.nickname = nickname;
        this.password = password;
        this.punkten = punkten;
    }


    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPunkten() {
        return punkten;
    }

    public void setPunkten(int punkten) {
        this.punkten = punkten;
    }
}
