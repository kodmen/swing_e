package org.yamanevler.Excersise.SepetUygulaması;

public class Urun {
    private String isim;
    private double fiyatı;
    private String resim;
    private int id;

    public Urun(String isim, double fiyatı, String resim, int id) {
        this.isim = isim;
        this.fiyatı = fiyatı;
        this.resim = resim;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getFiyatı() {
        return fiyatı;
    }

    public void setFiyatı(double fiyatı) {
        this.fiyatı = fiyatı;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
