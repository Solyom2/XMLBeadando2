package hu.iit.me.model;

public class Orszag {

    private int oid;
    private String onev;

    public Orszag(int oid, String onev) {
        this.oid = oid;
        this.onev = onev;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOnev() {
        return onev;
    }

    public void setOnev(String onev) {
        this.onev = onev;
    }
}
