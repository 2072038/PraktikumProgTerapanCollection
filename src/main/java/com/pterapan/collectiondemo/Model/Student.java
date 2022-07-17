package com.pterapan.collectiondemo.Model;

import javafx.scene.control.TextField;

public class Student {
    private String nrp;
    private String nama;
    private String ipa;
    private String ips;

    @Override
    public String toString() {
        return nrp + " - " + nama;
    }

    public Student(String nrp, String nama, String ipa, String ips) {
        this.nrp = nrp;
        this.nama = nama;
        this.ipa = ipa;
        this.ips = ips;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getIpa() {
        return ipa;
    }

    public void setIpa(String ipa) {
        this.ipa = ipa;
    }
}
