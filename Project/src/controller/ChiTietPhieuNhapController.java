/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Entities.ChiTietPhieuNhap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import nhom4.ConnectDB;

/**
 *
 * @author admin
 */
public class ChiTietPhieuNhapController {
    ArrayList<ChiTietPhieuNhap> list;
    ConnectDB conn = new ConnectDB();

    public ChiTietPhieuNhapController() throws Exception {
        list = new ArrayList<>();

        String sql = "select * from CHITIETPHIEUNHAP";
        ResultSet rs = conn.queryData(sql);
        while (rs.next()) {
            list.add(new ChiTietPhieuNhap(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDouble(5)));
        }

    }

    public ArrayList<ChiTietPhieuNhap> getList() {
        return list;
    }
    public void themCTPN(ChiTietPhieuNhap ctpn) throws SQLException, Exception {
        conn.themCTPN(ctpn);
    }

    public void updateCTPN(ChiTietPhieuNhap ctpn) throws SQLException {
        conn.suaCTPN(ctpn);
    }

    public void xoaPN(ChiTietPhieuNhap ctpn) throws SQLException {
        conn.xoaCTPN(ctpn);
    }
}
