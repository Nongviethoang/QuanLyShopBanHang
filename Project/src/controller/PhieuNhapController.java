
package controller;

import Entities.NhaCungCap;
import Entities.PhieuNhap;
import Entities.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import nhom4.ConnectDB;


public class PhieuNhapController {

    ArrayList<PhieuNhap> list;
    ConnectDB conn = new ConnectDB();

    public PhieuNhapController() throws Exception {
        list = new ArrayList<>();

        String sql = "select * from PHIEUNHAP";
        ResultSet rs = conn.queryData(sql);
        while (rs.next()) {
            list.add(new PhieuNhap(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(4), rs.getString(5)));
        }

    }

    public ArrayList<PhieuNhap> getList() {
        return list;
    }

//    public boolean checkdvNhap(String maDV) throws Exception {
//        ArrayList<donvinhap> listSP = conn.reusltListDVN();
//        for (donvinhap item : listSP) {
//            if (item.getMadvnhap().trim().equals(maDV.trim())) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean checkSanPham(String maSP) throws Exception {
//        ArrayList<sanpham> listSP = conn.reusltListSP();
//        for (sanpham item : listSP) {
//            if (item.getMasp().trim().equals(maSP.trim())) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean checkHoaDonNhap(String mahdn) {
//        for (hoadonnhap item : list) {
//            if (item.getMahdn().trim().equals(mahdn.trim())) {
//                return true;
//            }
//        }
//        return false;
//    }

    public void themPN(PhieuNhap pn) throws SQLException, Exception {
        conn.themPN(pn);
    }

    public void updatePN(PhieuNhap pn) throws SQLException {
        conn.suaPN(pn);
    }

    public void xoaPN(PhieuNhap pn) throws SQLException {
        conn.xoaPN(pn);
    }

//    public String indentityMaHDN() throws Exception {
//        String hdxEnd = "hdn 00000";
//
//        String hdx = list.get(list.size() - 1).getMahdn();
//
//        int num = Integer.valueOf(hdx.substring(3).trim());
//        num++;
//        hdxEnd = "hdx";
//        char c[] = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',};
//        String i = "";
//        i = i.copyValueOf(c, 0, 7 - String.valueOf(num).length());
//
//        hdxEnd = hdxEnd + i + String.valueOf(num);
//
//        return hdxEnd;
//    }

//    public  getD(String madvx) throws Exception {
//        ArrayList<donvinhap> listSP = conn.reusltListDVN();
//        for (donvinhap item : listSP) {
//            if (item.getMadvnhap().trim().equals(madvx.trim())) {
//                return item;
//            }
//        }
//
//        return null;
//    }
//
//    public sanpham getSP(String masp) throws Exception {
//        ArrayList<sanpham> listSP = conn.reusltListSP();
//        for (sanpham item : listSP) {
//            if (item.getMasp().trim().equals(masp.trim())) {
//                return item;
//            }
//        }
//        return null;
    }