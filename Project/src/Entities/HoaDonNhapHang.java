/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author ADMIN
 */
public class HoaDonNhapHang {
    private int maPN;
    private String mtenNV;
    private String tenNCC;
    private double thanhTien;
    private double ngayNhap;

    public HoaDonNhapHang(int maPN, String mtenNV, String tenNCC, double thanhTien, double ngayNhap) {
        this.maPN = maPN;
        this.mtenNV = mtenNV;
        this.tenNCC = tenNCC;
        this.thanhTien = thanhTien;
        this.ngayNhap = ngayNhap;
    }

    public HoaDonNhapHang() {
    }

    public int getMaPN() {
        return maPN;
    }

    public void setMaPN(int maPN) {
        this.maPN = maPN;
    }

    public String getMtenNV() {
        return mtenNV;
    }

    public void setMtenNV(String mtenNV) {
        this.mtenNV = mtenNV;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public double getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(double ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

   
}
