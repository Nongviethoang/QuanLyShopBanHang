
package Entities;


public class PhieuNhap {
    private int maPn;
    private int nvn;
    private int nccn;
    private double tongTien;
    private String ngayNhap;

    public PhieuNhap() {
    }

    public PhieuNhap(int maPn, int nvn, int nccn, double tongTien, String ngayNhap) {
        this.maPn = maPn;
        this.nvn = nvn;
        this.nccn = nccn;
        this.tongTien = tongTien;
        this.ngayNhap = ngayNhap;
    }

    public PhieuNhap(int nvn, int nccn, double tongTien, String ngayNhap) {
        this.nvn = nvn;
        this.nccn = nccn;
        this.tongTien = tongTien;
        this.ngayNhap = ngayNhap;
    }

    public PhieuNhap(int manv, int mancc, String tongtien, String ngaynhap) {
        
    }

    public int getMaPn() {
        return maPn;
    }

    public void setMaPn(int maPn) {
        this.maPn = maPn;
    }

    public int getNvn() {
        return nvn;
    }

    public void setNvn(int nvn) {
        this.nvn = nvn;
    }

    public int getNccn() {
        return nccn;
    }

    public void setNccn(int nccn) {
        this.nccn = nccn;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

   
}
