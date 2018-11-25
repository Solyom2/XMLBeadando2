package hu.iit.me.model;

import java.util.Date;

public class Uboat {

    public enum Utipus {
        II, VII, IX, XI
    }

    private int uid;
    private int szid;
    private String unev;
    private Utipus utipus;
    private Date elveszett;
    private String vesztesegOka;

    public Uboat(int uid, int szid, String unev, Utipus utipus, Date elveszett, String vesztesegOka) {
        this.uid = uid;
        this.szid = szid;
        this.unev = unev;
        this.utipus = utipus;
        this.elveszett = elveszett;
        this.vesztesegOka = vesztesegOka;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getSzid() {
        return szid;
    }

    public void setSzid(int szid) {
        this.szid = szid;
    }

    public String getUnev() {
        return unev;
    }

    public void setUnev(String unev) {
        this.unev = unev;
    }

    public Utipus getUtipus() {
        return utipus;
    }

    public void setUtipus(Utipus utipus) {
        this.utipus = utipus;
    }

    public Date getElveszett() {
        return elveszett;
    }

    public void setElveszett(Date elveszett) {
        this.elveszett = elveszett;
    }

    public String getVesztesegOka() {
        return vesztesegOka;
    }

    public void setVesztesegOka(String vesztesegOka) {
        this.vesztesegOka = vesztesegOka;
    }

    @Override
    public String toString() {
        return "Uboat{" +
                "uid=" + uid +
                ", szid=" + szid +
                ", unev='" + unev + '\'' +
                ", utipus=" + utipus +
                ", elveszett=" + elveszett +
                ", vesztesegOka='" + vesztesegOka + '\'' +
                '}';
    }
}
