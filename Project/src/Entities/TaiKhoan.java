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
public class TaiKhoan {
    private int id;
    private String ten;
    private String pass;
    private int quyen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    public TaiKhoan() {
    }

    public TaiKhoan(int id, String ten, String pass, int quyen) {
        this.id = id;
        this.ten = ten;
        this.pass = pass;
        this.quyen = quyen;
    }

   
}
