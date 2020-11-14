package Entities;


public class SanPham {
    private int maSP;
    private String tenSP;
    private String thuongHieu;
    private double giaNhap;
    private double giaBan;
    private int soLuongcon;

    public SanPham() {
    }

    public SanPham( String tenSP, String thuongHieu, double giaNhap, double giaBan, int soLuongcon) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.thuongHieu = thuongHieu;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuongcon = soLuongcon;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuongcon() {
        return soLuongcon;
    }

    public void setSoLuongcon(int soLuongcon) {
        this.soLuongcon = soLuongcon;
    }

    
    
 
}
