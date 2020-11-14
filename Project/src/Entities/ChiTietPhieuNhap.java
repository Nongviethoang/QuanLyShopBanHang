
package Entities;


public class ChiTietPhieuNhap {
    private int maCTPN;
    private int mapn_ctpn;
    private int masp_ctpn;
    private int soluong;
    private double thanhtien;

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(int maCTPN, int mapn_ctpn, int masp_ctpn, int soluong, double thanhtien) {
        this.maCTPN = maCTPN;
        this.mapn_ctpn = mapn_ctpn;
        this.masp_ctpn = masp_ctpn;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }

    public ChiTietPhieuNhap(int mapn_ctpn, int masp_ctpn, int soluong, double thanhtien) {
        this.mapn_ctpn = mapn_ctpn;
        this.masp_ctpn = masp_ctpn;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }

    public int getMaCTPN() {
        return maCTPN;
    }

    public void setMaCTPN(int maCTPN) {
        this.maCTPN = maCTPN;
    }

    public int getMapn_ctpn() {
        return mapn_ctpn;
    }

    public void setMapn_ctpn(int mapn_ctpn) {
        this.mapn_ctpn = mapn_ctpn;
    }

    public int getMasp_ctpn() {
        return masp_ctpn;
    }

    public void setMasp_ctpn(int masp_ctpn) {
        this.masp_ctpn = masp_ctpn;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    
}
