package entities;

import java.util.Objects;

public class Vol {
    private int id_vol;
    private int num_vol;
    private String aero_depart, aero_arrivee, jour_vol,heure_depart,heure_arrivee;
    private int id_avion;
    private Escale escale;

    public Vol() {
    }

    public Vol(int id_vol, int num_vol, String aero_depart, String aero_arrivee, String jour_vol, String heure_depart, String heure_arrivee, int id_avion, Escale escale) {
        this.id_vol = id_vol;
        this.num_vol = num_vol;
        this.aero_depart = aero_depart;
        this.aero_arrivee = aero_arrivee;
        this.jour_vol = jour_vol;
        this.heure_depart = heure_depart;
        this.heure_arrivee = heure_arrivee;
        this.id_avion = id_avion;
        this.escale = escale;
    }

    public Vol(int num_vol, String aero_depart, String aero_arrivee, String jour_vol, String heure_depart, String heure_arrivee, int id_avion, Escale escale) {
        this.num_vol = num_vol;
        this.aero_depart = aero_depart;
        this.aero_arrivee = aero_arrivee;
        this.jour_vol = jour_vol;
        this.heure_depart = heure_depart;
        this.heure_arrivee = heure_arrivee;
        this.id_avion = id_avion;
        this.escale = escale;
    }

    public int getId_vol() {
        return id_vol;
    }

    public void setId_vol(int id_vol) {
        this.id_vol = id_vol;
    }

    public int getNum_vol() {
        return num_vol;
    }

    public void setNum_vol(int num_vol) {
        this.num_vol = num_vol;
    }

    public String getAero_depart() {
        return aero_depart;
    }

    public void setAero_depart(String aero_depart) {
        this.aero_depart = aero_depart;
    }

    public String getAero_arrivee() {
        return aero_arrivee;
    }

    public void setAero_arrivee(String aero_arrivee) {
        this.aero_arrivee = aero_arrivee;
    }

    public String getJour_vol() {
        return jour_vol;
    }

    public void setJour_vol(String jour_vol) {
        this.jour_vol = jour_vol;
    }

    public String getHeure_depart() {
        return heure_depart;
    }

    public void setHeure_depart(String heure_depart) {
        this.heure_depart = heure_depart;
    }

    public String getHeure_arrivee() {
        return heure_arrivee;
    }

    public void setHeure_arrivee(String heure_arrivee) {
        this.heure_arrivee = heure_arrivee;
    }

    public int getId_avion() {
        return id_avion;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }

    public Escale getEscale() {
        return escale;
    }

    public void setEscale( Escale escale) {
        this.escale = escale;
    }

    @Override
    public String toString() {
        return "Vol{" +
                "id_vol=" + id_vol +
                ", num_vol=" + num_vol +
                ", aero_depart='" + aero_depart + '\'' +
                ", aero_arrivee='" + aero_arrivee + '\'' +
                ", jour_vol='" + jour_vol + '\'' +
                ", heure_depart='" + heure_depart + '\'' +
                ", heure_arrivee='" + heure_arrivee + '\'' +
                ", id_avion=" + id_avion +
                ", escale=" + escale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vol vol = (Vol) o;
        return id_vol == vol.id_vol && num_vol == vol.num_vol && id_avion == vol.id_avion && escale == vol.escale && Objects.equals(aero_depart, vol.aero_depart) && Objects.equals(aero_arrivee, vol.aero_arrivee) && Objects.equals(jour_vol, vol.jour_vol) && Objects.equals(heure_depart, vol.heure_depart) && Objects.equals(heure_arrivee, vol.heure_arrivee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_vol, num_vol, aero_depart, aero_arrivee, jour_vol, heure_depart, heure_arrivee, id_avion, escale);
    }
}
