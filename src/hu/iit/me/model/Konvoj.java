package hu.iit.me.model;

import java.util.Date;

public class Konvoj {

    public enum Kiseret {
        GYENGE, KOZEPES, EROS
    }

    private int kid;
    private String knev;
    private Date kindulas;
    private Date kerkezes;
    private String ksart;
    private String kcel;
    private int kerhajo;
    private int hadihajo;
    private Kiseret kiseret;

    public Konvoj(int kid, String knev, Date kindulas, Date kerkezes, String ksart, String kcel, int kerhajo, int hadihajo, Kiseret kiseret) {
        this.kid = kid;
        this.knev = knev;
        this.kindulas = kindulas;
        this.kerkezes = kerkezes;
        this.ksart = ksart;
        this.kcel = kcel;
        this.kerhajo = kerhajo;
        this.hadihajo = hadihajo;
        this.kiseret = kiseret;
    }

    public int getKid() {
        return kid;
    }

    public void setKid(int kid) {
        this.kid = kid;
    }

    public String getKnev() {
        return knev;
    }

    public void setKnev(String knev) {
        this.knev = knev;
    }

    public Date getKindulas() {
        return kindulas;
    }

    public void setKindulas(Date kindulas) {
        this.kindulas = kindulas;
    }

    public Date getKerkezes() {
        return kerkezes;
    }

    public void setKerkezes(Date kerkezes) {
        this.kerkezes = kerkezes;
    }

    public String getKsart() {
        return ksart;
    }

    public void setKsart(String ksart) {
        this.ksart = ksart;
    }

    public String getKcel() {
        return kcel;
    }

    public void setKcel(String kcel) {
        this.kcel = kcel;
    }

    public int getKerhajo() {
        return kerhajo;
    }

    public void setKerhajo(int kerhajo) {
        this.kerhajo = kerhajo;
    }

    public int getHadihajo() {
        return hadihajo;
    }

    public void setHadihajo(int hadihajo) {
        this.hadihajo = hadihajo;
    }

    public Kiseret getKiseret() {
        return kiseret;
    }

    public void setKiseret(Kiseret kiseret) {
        this.kiseret = kiseret;
    }
}
