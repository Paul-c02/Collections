package eventkalender;

public class Event {
    private String title;
    private String ort;
    private double preis;

    public Event(String title, String ort, double preis) {
        this.title = title;
        this.ort = ort;
        this.preis = preis;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", ort='" + ort + '\'' +
                ", preis=" + preis +
                '}';
    }
}
