package pegel;

public class Wasserstand {
    private int id;
    private String gewaesserName;
    private double messWert;
    private double messWertFuerAlarm;
    private int zeitPunkt;

    public Wasserstand(int id, String gewaesserName, double messWert, double messWertFuerAlarm, int zeitPunkt) {
        this.id = id;
        this.gewaesserName = gewaesserName;
        this.messWert = messWert;
        this.messWertFuerAlarm = messWertFuerAlarm;
        this.zeitPunkt = zeitPunkt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGewaesserName() {
        return gewaesserName;
    }

    public void setGewaesserName(String gewaesserName) {
        this.gewaesserName = gewaesserName;
    }

    public double getMessWert() {
        return messWert;
    }

    public void setMessWert(double messWert) {
        this.messWert = messWert;
    }

    public double getMessWertFuerAlarm() {
        return messWertFuerAlarm;
    }

    public void setMessWertFuerAlarm(int messWertFuerAlarm) {
        this.messWertFuerAlarm = messWertFuerAlarm;
    }

    public int getZeitPunkt() {
        return zeitPunkt;
    }

    public void setZeitPunkt(int zeitPunkt) {
        this.zeitPunkt = zeitPunkt;
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "id=" + id +
                ", gewaesserName='" + gewaesserName + '\'' +
                ", messWert=" + messWert +
                ", messWertFuerAlarm=" + messWertFuerAlarm +
                ", zeitPunkt=" + zeitPunkt +
                '}';
    }
}
