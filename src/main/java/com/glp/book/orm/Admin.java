package com.glp.book.orm;

public class Admin {
    private int Aid;
    private String AloginID;
    private int AloginPsw;
    private String Aname;

    @Override
    public String toString() {
        return "Admin{" +
                "Aid=" + Aid +
                ", AloginID='" + AloginID + '\'' +
                ", AloginPsw=" + AloginPsw +
                ", Aname='" + Aname + '\'' +
                '}';
    }

    public int getAid() {
        return Aid;
    }

    public void setAid(int aid) {
        Aid = aid;
    }

    public String getAloginID() {
        return AloginID;
    }

    public void setAloginID(String aloginID) {
        AloginID = aloginID;
    }

    public int getAloginPsw() {
        return AloginPsw;
    }

    public void setAloginPsw(int aloginPsw) {
        AloginPsw = aloginPsw;
    }

    public String getAname() {
        return Aname;
    }

    public void setAname(String aname) {
        Aname = aname;
    }

    public Admin() {
    }

    public Admin(int aid, String aloginID, int aloginPsw, String aname) {
        Aid = aid;
        AloginID = aloginID;
        AloginPsw = aloginPsw;
        Aname = aname;
    }
}
