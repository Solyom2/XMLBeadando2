package hu.iit.me.model;

import java.util.Date;

public class Parancsnok {

    public enum Tapasztalat {
        UJONC, HARCEDZETT, VETERAN
    }

    private int pid;
    private String nev;
    private Date szuletes;
    private int orjaratok;
    private int kituntetesek;
    private Tapasztalat tapasztalat;

    public Parancsnok(int pid, String nev, Date szuletes, int orjaratok, int kituntetesek, Tapasztalat tapasztalat) {
        this.pid = pid;
        this.nev = nev;
        this.szuletes = szuletes;
        this.orjaratok = orjaratok;
        this.kituntetesek = kituntetesek;
        this.tapasztalat = tapasztalat;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Date getSzuletes() {
        return szuletes;
    }

    public void setSzuletes(Date szuletes) {
        this.szuletes = szuletes;
    }

    public int getOrjaratok() {
        return orjaratok;
    }

    public void setOrjaratok(int orjaratok) {
        this.orjaratok = orjaratok;
    }

    public int getKituntetesek() {
        return kituntetesek;
    }

    public void setKituntetesek(int kituntetesek) {
        this.kituntetesek = kituntetesek;
    }

    public Tapasztalat getTapasztalat() {
        return tapasztalat;
    }

    public void setTapasztalat(Tapasztalat tapasztalat) {
        this.tapasztalat = tapasztalat;
    }
}
