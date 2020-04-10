package com.glp.book.orm;

public class CateGoty {
    private int Cid;
    private String Cname;

    public int getCid() {
        return Cid;
    }

    public void setCid(int cid) {
        Cid = cid;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public CateGoty() {
    }

    public CateGoty(int cid, String cname) {
        Cid = cid;
        Cname = cname;
    }
}
