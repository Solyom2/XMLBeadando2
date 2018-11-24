package hu.iit.me.model;

public class Szovegyseg extends Hajo{

    private int szid;

    public Szovegyseg(int oid, String hnev, String htipus, int szid) {
        super(oid, hnev, htipus);
        this.szid = szid;
    }

    public int getSzid() {
        return szid;
    }

    public void setSzid(int szid) {
        this.szid = szid;
    }
}
