/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ChiTietHoaDon {
    private int maCT;
    private int maHD;
    private int maSP;
    private int soLuong;
    private double thanhTien;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int maCT, int maHD, int maSP, int soLuong, double thanhTien) {
        this.maCT = maCT;
        this.maHD = maHD;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public int getMaCT() {
        return maCT;
    }

    public void setMaCT(int maCT) {
        this.maCT = maCT;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
   
}
