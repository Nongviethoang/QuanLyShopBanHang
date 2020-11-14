package Entities;


import java.util.ArrayList;
import java.util.Date;


public class HoaDonBanHang {
    private int maHD;
    private int makhachHang;
    private int maNv;
    private String ngayLap;
    private double tongTien;
    private String tenKH;
    private String tenNV;

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTenNV() {
        return tenNV;
    }
    
    public HoaDonBanHang() {
    }

    

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getMakhachHang() {
        return makhachHang;
    }

    public void setMakhachHang(int makhachHang) {
        this.makhachHang = makhachHang;
    }

    public int getMaNv() {
        return maNv;
    }

    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    public HoaDonBanHang(int maHD, int makhachHang, int maNv, String ngayLap, double tongTien) {
        this.maHD = maHD;
        this.makhachHang = makhachHang;
        this.maNv = maNv;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
    }


    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    
    
    
}
