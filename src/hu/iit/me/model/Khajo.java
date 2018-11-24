package hu.iit.me.model;

import java.util.Date;

public class Khajo extends Hajo {

    public enum Meghajt {
        GOZ, MOTOR
    }

    private int hid;
    private int uid;
    private Meghajt meghajt;
    private int tonna;
    private Date elsullyedt;
    private String szallitmany;

    public Khajo(int oid, String hnev, String htipus, int hid, int uid, Meghajt meghajt, int tonna, Date elsullyedt, String szallitmany) {
        super(oid, hnev, htipus);
        this.hid = hid;
        this.uid = uid;
        this.meghajt = meghajt;
        this.tonna = tonna;
        this.elsullyedt = elsullyedt;
        this.szallitmany = szallitmany;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Meghajt getMeghajt() {
        return meghajt;
    }

    public void setMeghajt(Meghajt meghajt) {
        this.meghajt = meghajt;
    }

    public int getTonna() {
        return tonna;
    }

    public void setTonna(int tonna) {
        this.tonna = tonna;
    }

    public Date getElsullyedt() {
        return elsullyedt;
    }

    public void setElsullyedt(Date elsullyedt) {
        this.elsullyedt = elsullyedt;
    }

    public String getSzallitmany() {
        return szallitmany;
    }

    public void setSzallitmany(String szallitmany) {
        this.szallitmany = szallitmany;
    }

}
