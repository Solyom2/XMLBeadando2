package hu.iit.me.model;

import java.util.Date;

public class Parancsnoklas {

    private int pid;
    private int uid;
    private Date mettol;
    private Date meddig;

    public Parancsnoklas(int pid, int uid, Date mettol, Date meddig) {
        this.pid = pid;
        this.uid = uid;
        this.mettol = mettol;
        this.meddig = meddig;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Date getMettol() {
        return mettol;
    }

    public void setMettol(Date mettol) {
        this.mettol = mettol;
    }

    public Date getMeddig() {
        return meddig;
    }

    public void setMeddig(Date meddig) {
        this.meddig = meddig;
    }
}
