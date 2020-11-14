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
public class NhaCungCap {
    private int maNCC;
    private String tenNCC;
    private String diaChi;
    private String sDT;
    private String email;

    public NhaCungCap( String tenNCC, String diaChi, String sDT, String email) {
        //this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.sDT = sDT;
        this.email = email;
    }

    public NhaCungCap() {
    }

    public int getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(int maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
