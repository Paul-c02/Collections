package pegel;

import java.util.ArrayList;

public class WasserstandManager {
    private ArrayList<Wasserstand> wasserStandArrayList;

    public WasserstandManager() {
        this.wasserStandArrayList = new ArrayList<>();
    }

    public void add(Wasserstand wasserstand) {
        wasserStandArrayList.add(wasserstand);
    }

    public Wasserstand findById(int id) {
        for (Wasserstand wasserstand : wasserStandArrayList) {
            if (wasserstand.getId() == id) {
                return wasserstand;
            }

        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName) {
        ArrayList<Wasserstand> found = new ArrayList<>();
        for (Wasserstand wasserstand : wasserStandArrayList) {
            if (wasserstand.getGewaesserName().equals(gewaesserName)) {
                found.add(wasserstand);
            }

        }
        return found;
    }

    public Wasserstand findLastWasserstand(String gewaesserName) {
        int alter = 0;
        Wasserstand last = null;
        for (Wasserstand wasserstand : wasserStandArrayList) {
            if (wasserstand.getGewaesserName().equals(gewaesserName)) {
                if (wasserstand.getZeitPunkt() > alter) {
                    last = wasserstand;
                    alter = wasserstand.getZeitPunkt();
                }
            }
        }
        return last;
    }

    public ArrayList<Wasserstand> findForAlarmierung() {
        ArrayList<Wasserstand> found = new ArrayList<>();
        for (Wasserstand wasserstand : wasserStandArrayList) {
            if (wasserstand.getMessWertFuerAlarm() <= wasserstand.getMessWert()) {
                found.add(wasserstand);
            }
        }
        return found;
    }
    public double calcMittlererWasserstand(String gewaesserName){
        double mittel = 0.0;
        int count = 0;
        for (Wasserstand wasserstand : wasserStandArrayList) {
            if (wasserstand.getGewaesserName().equals(gewaesserName)){
                mittel += wasserstand.getMessWert();
                count++;
            }
        }
        if(count>0)return mittel/count;
        return 0.0;
    }
    public ArrayList<Wasserstand> findByZeitspanne(int von, int bis, String gewaesserName){
        ArrayList<Wasserstand> found = new ArrayList<>();
        for (Wasserstand wasserstand : wasserStandArrayList) {
            if (wasserstand.getGewaesserName().equals(gewaesserName)){
                if (wasserstand.getZeitPunkt()>=von && wasserstand.getZeitPunkt()<=bis){
                    found.add(wasserstand);
                }
            }
        }return found;
    }
}
