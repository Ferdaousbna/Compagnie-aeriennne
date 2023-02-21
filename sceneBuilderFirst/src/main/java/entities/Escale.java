package entities;

import java.util.Objects;

public class Escale {
    private int id_escale;
    private String aero_escale, heure_depart,heure_arrivee,jour_escale;

    public Escale() {
    }

    public Escale(int id_escale, String aero_escale, String heure_depart, String heure_arrivee, String jour_escale) {
        this.id_escale = id_escale;
        this.aero_escale = aero_escale;
        this.heure_depart = heure_depart;
        this.heure_arrivee = heure_arrivee;
        this.jour_escale = jour_escale;
    }

    public Escale(String aero_escale, String heure_depart, String heure_arrivee, String jour_escale) {
        this.aero_escale = aero_escale;
        this.heure_depart = heure_depart;
        this.heure_arrivee = heure_arrivee;
        this.jour_escale = jour_escale;
    }

    public int getId_escale() {
        return id_escale;
    }

    public void setId_escale(int id_escale) {
        this.id_escale = id_escale;
    }

    public String getAero_escale() {
        return aero_escale;
    }

    public void setAero_escale(String aero_escale) {
        this.aero_escale = aero_escale;
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

    public String getJour_escale() {
        return jour_escale;
    }

    public void setJour_escale(String jour_escale) {
        this.jour_escale = jour_escale;
    }

    @Override
    public String toString() {
        return "Escale{" +
                "id_escale=" + id_escale +
                ", aero_escale='" + aero_escale + '\'' +
                ", heure_depart='" + heure_depart + '\'' +
                ", heure_arrivee='" + heure_arrivee + '\'' +
                ", jour_escale='" + jour_escale + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Escale escale = (Escale) o;
        return id_escale == escale.id_escale && Objects.equals(aero_escale, escale.aero_escale) && Objects.equals(heure_depart, escale.heure_depart) && Objects.equals(heure_arrivee, escale.heure_arrivee) && Objects.equals(jour_escale, escale.jour_escale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_escale, aero_escale, heure_depart, heure_arrivee, jour_escale);
    }
}
