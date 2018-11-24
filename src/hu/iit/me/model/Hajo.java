package hu.iit.me.model;

public class Hajo {

    private int oid;
    private String hnev;
    private String htipus;

    public Hajo(int oid, String hnev, String htipus) {
        this.oid = oid;
        this.hnev = hnev;
        this.htipus = htipus;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getHnev() {
        return hnev;
    }

    public void setHnev(String hnev) {
        this.hnev = hnev;
    }

    public String getHtipus() {
        return htipus;
    }

    public void setHtipus(String htipus) {
        this.htipus = htipus;
    }

}
