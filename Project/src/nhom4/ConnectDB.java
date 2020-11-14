package nhom4;

import Entities.ChiTietHoaDon;
import Entities.ChiTietPhieuNhap;
import Entities.HoaDonBanHang;
import Entities.KhachHang;
import Entities.NhaCungCap;
import Entities.NhanVien;
import Entities.PhieuNhap;
import Entities.SanPham;
import Entities.TaiKhoan;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConnectDB {

    Connection cnn;
    private Statement st = null;
    private ResultSet rs = null;
    public ConnectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLySanPhamMixiShop", "sa", "123456");
            if (cnn != null) {
                System.out.println("Kết nối database thành công");
            }
        } catch (Exception e) {
            System.out.println("Kết nối thất bại" + e);
        }

    }

    public boolean checkTk(String s1, String s2) {
        String sql = "SELECT * FROM USERS";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan();
                tk.setTen(rs.getString("TENDANGNHAP").trim());
                tk.setPass(rs.getString("PASSWORD").trim());
                tk.setQuyen(rs.getInt("QUYEN"));
                if (tk.getTen().equals(s1) && tk.getPass().equalsIgnoreCase(s2)) {
                    return true;
                }
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    public ArrayList<TaiKhoan> getListTK() {
        ArrayList<TaiKhoan> list = new ArrayList<>();
        String sql = "SELECT * FROM Users";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan s = new TaiKhoan();
                s.setId(rs.getInt("ID"));
                s.setTen(rs.getString("TENDANGNHAP"));
                s.setPass(rs.getString("PASSWORD"));
                s.setQuyen(rs.getInt("QUYEN"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    //thêm nhân viên vào cơ sở dữ liệu
    public boolean themNV(NhanVien nv) {
        String sql = "INSERT INTO NHANVIEN(TENNHANVIEN,NGAYSINH,GIOITINH,CHUCVU,DIACHI,SODT) VALUES "
                + "(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setString(1, nv.getTenNV());
            ps.setString(2, nv.getNgaySinh());
            ps.setString(3, nv.getGioiTinh());
            ps.setString(4, nv.getChucVu());
            ps.setString(5, nv.getDiaChi());
            ps.setString(6, nv.getsDt());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //sửa nhân viên và cập nhật lại database
    public boolean suaNV(NhanVien nv, int id) {
        String sql = " UPDATE NHANVIEN SET TENNHANVIEN=?,NGAYSINH=?,GIOITINH=?,CHUCVU=?,DIACHI=?,SODT=? WHERE MANHANVIEN=?";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setString(1, nv.getTenNV());
            ps.setString(2, nv.getNgaySinh());
            ps.setString(3, nv.getGioiTinh());
            ps.setString(4, nv.getChucVu());
            ps.setString(5, nv.getDiaChi());
            ps.setString(6, nv.getsDt());
             ps.setInt(7, id);
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //xóa nhân viên và cập nhật lại dữ liệu

    public boolean xoaNV(NhanVien nv) {
        String sql = " DELETE NHANVIEN WHERE MANHANVIEN=?";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setInt(1, nv.getMaNV());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //lấy danh sách nhân viên từ cơ sở dữ liệu

    public ArrayList<NhanVien> getListNV() {
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "SELECT * FROM NHANVIEN";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien s = new NhanVien();
                s.setMaNV(rs.getInt("MANHANVIEN"));
                s.setTenNV(rs.getString("TENNHANVIEN"));
                s.setNgaySinh(rs.getString("NGAYSINH"));
                s.setGioiTinh(rs.getString("GIOITINH"));
                s.setChucVu(rs.getString("CHUCVU"));
                s.setDiaChi(rs.getString("DIACHI"));
                s.setsDt(rs.getString("SODT"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
     public boolean themNCC(NhaCungCap ncc) {
        String sql = "INSERT INTO NHACUNGCAP(TENNHACUNGCAP,DIACHI,SDT,EMAIL) values  "
                + "(?,?,?,?)";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(1, ncc.getMaNcc());
            ps.setString(1, ncc.getTenNCC());
            ps.setString(2, ncc.getDiaChi());
            ps.setString(3, ncc.getsDT());
            ps.setString(4, ncc.getEmail());
//            ps.execute();
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //sửa nhà cung cấp và cập nhật lại database
    public boolean suaNCC(NhaCungCap ncc) {
        String sql = " UPDATE NHACUNGCAP SET TENNHACUNGCAP=?,DIACHI=?,SDT=?,EMAIL=? WHERE MANHACUNGCAP=?";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
//            ps.setInt(1, ncc.getMaNcc());
            ps.setString(1, ncc.getTenNCC());
            ps.setString(2, ncc.getDiaChi());
            ps.setString(3, ncc.getsDT());
            ps.setString(4, ncc.getEmail());
            ps.setInt(5, ncc.getMaNCC());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //xóa nhà cung cấp và cập nhật lại dữ liệu

    public boolean xoaNCC(NhaCungCap ncc) {
        String sql = " DELETE NHACUNGCAP WHERE MANHACUNGCAP=?";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setInt(1, ncc.getMaNCC());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //lấy danh sách nhà xung cấp từ cơ sở dữ liệu

    public ArrayList<NhaCungCap> getListNCC() {
        ArrayList<NhaCungCap> list = new ArrayList<>();
        String sql = "SELECT * FROM NHACUNGCAP";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhaCungCap s = new NhaCungCap();
                s.setMaNCC(rs.getInt("MANHACUNGCAP"));
                s.setTenNCC(rs.getString("TENNHACUNGCAP"));
                s.setDiaChi(rs.getString("DIACHI"));
                s.setsDT(rs.getString("SDT"));
                s.setEmail(rs.getString("EMAIL"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
 public boolean themSP(SanPham sp) {
        String sql = "INSERT INTO SANPHAM(TENSANPHAM, THUONGHIEU, GIANHAP, GIABAN, SOLUONGCON) VALUES "
                + "(?,?,?,?,?)";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
//            ps.setString(1, sp.getMaSP());
            ps.setString(1, sp.getTenSP());
            ps.setString(2, sp.getThuongHieu());
            ps.setDouble(3, sp.getGiaNhap());
            ps.setDouble(4, sp.getGiaBan());
            ps.setInt(5, sp.getSoLuongcon());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //xóa sản phẩm từ giao diện và cập nhật lại cơ sở dữ liệu

    public boolean suaSP(SanPham sp) {
        String sql = " UPDATE SANPHAM SET TENSANPHAM=?, THUONGHIEU=?, GIANHAP=?, GIABAN=?, SOLUONGCON=? WHERE MASANPHAM=?";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
//            ps.setString(1, sp.getMaSP());
            ps.setString(1, sp.getTenSP());
            ps.setString(2, sp.getThuongHieu());
            ps.setDouble(3, sp.getGiaNhap());
            ps.setDouble(4, sp.getGiaBan());
            ps.setInt(5, sp.getSoLuongcon());
            ps.setInt(6, sp.getMaSP());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //xóa sản phẩm và cập nhật lại bảng

    public boolean xoaSP(SanPham sp) {
        String sql = "DELETE SANPHAM WHERE MASANPHAM=?";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setInt(1, sp.getMaSP());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //lấy danh sách sản phẩm từ cơ sở dữ liệu

    public ArrayList<SanPham> getListSP() {
        ArrayList<SanPham> list = new ArrayList<>();
        String sql = "SELECT * FROM SANPHAM";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham s = new SanPham();
                s.setMaSP(rs.getInt("MASANPHAM"));
                s.setTenSP(rs.getString("TENSANPHAM"));
                s.setThuongHieu(rs.getString("THUONGHIEU"));
                s.setGiaNhap(rs.getDouble("GIANHAP"));
                s.setGiaBan(rs.getDouble("GIABAN"));
                s.setSoLuongcon(rs.getInt("SOLUONGCON"));
                
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
     public boolean themKH(KhachHang kh) {
        String sql = "INSERT INTO KHACHHANG(TENKHACHHANG, GIOITINH, DIACHI, SDT,LOAIKHACHHANG) VALUES "
                + "(?,?,?,?,?)";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
//            ps.setString(1, sp.getMaSP());
            ps.setString(1, kh.getTenKH());
            ps.setString(2, kh.getGioiTinh());
            ps.setString(3, kh.getDiaChi());
            ps.setString(4, kh.getSdt());
            ps.setString(5, kh.getLoaiKh());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    public boolean suaKh(KhachHang kh,int id) {
        String sql = " UPDATE KHACHHANG SET TENKHACHHANG=?, GIOITINH=?, DIACHI=?,SDT=?, LOAIKHACHHANG=? WHERE MAKHACHHANG=?";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
//            ps.setString(1, sp.getMaSP());
            ps.setString(1, kh.getTenKH());
            ps.setString(2, kh.getGioiTinh());
            ps.setString(3, kh.getDiaChi());
            ps.setString(4, kh.getSdt());
            ps.setString(5, kh.getLoaiKh());
            ps.setInt(6, id);
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    public boolean xoaKh(KhachHang kh) {
        String sql = "DELETE KHACHHANG WHERE MAKHACHHANG=?";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setInt(1, kh.getMaKH());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //lấy danh sách khách hàng
    public ArrayList<KhachHang> getListKH() {
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM KHACHHANG";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getInt("MAKHACHHANG"));
                kh.setTenKH(rs.getString("TENKHACHHANG"));
                kh.setGioiTinh(rs.getString("GIOITINH"));
                kh.setDiaChi(rs.getString("DIACHI"));
                kh.setSdt(rs.getString("SDT"));
                kh.setLoaiKh(rs.getString("LOAIKHACHHANG"));
                list.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    //Hàm đóng kết nối đến CSDL
    public void closeConnection() {
        try {
            cnn.close();
        } catch (SQLException ex) {
            System.out.println("Loi: Dong ket noi that bai, khong the ket noi den CSDL");
        }
    }
     public boolean themPN(PhieuNhap pn) {
        String sql = "INSERT INTO PHIEUNHAP VALUES  "
                + "(?,?,?,?)";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(1, ncc.getMaNcc());
            ps.setInt(1, pn.getNvn());
            ps.setInt(2, pn.getNccn());
            ps.setDouble(3, pn.getTongTien());
            ps.setString(4, pn.getNgayNhap());
//            ps.execute();
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //sửa nhà cung cấp và cập nhật lại database
    public boolean suaPN(PhieuNhap pn) {
        String sql = " UPDATE PHIEUNHAP SET MANHANVIEN=?, MANHACUNGCAP=?, TONGTIEN=?, NGAYNHAP=? WHERE MAPHIEUNHAP=?";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
//            ps.setInt(1, ncc.getMaNcc());
            ps.setInt(1, pn.getNvn());
            ps.setInt(2, pn.getNccn());
            ps.setDouble(3, pn.getTongTien());
            ps.setString(4, pn.getNgayNhap());
            ps.setInt(5, pn.getMaPn());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //xóa nhà cung cấp và cập nhật lại dữ liệu

    public boolean xoaPN(PhieuNhap pn) {
        String sql = " DELETE PHIEUNHAP WHERE MAPHIEUNHAP=?";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setInt(1, pn.getMaPn());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //lấy danh sách nhà xung cấp từ cơ sở dữ liệu

    public ArrayList<PhieuNhap> getListPN() {
        ArrayList<PhieuNhap> list = new ArrayList<>();
        String sql = "SELECT * FROM PHIEUNHAP";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuNhap s = new PhieuNhap();
                s.setMaPn(rs.getInt("MAPHIEUNHAP"));
                s.setNvn(rs.getInt("MANHANVIEN"));
                s.setNccn(rs.getInt("MANHACUNGCAP"));
                s.setTongTien(rs.getDouble("TONGTIEN"));
                s.setNgayNhap(rs.getString("NGAYNHAP"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
     public boolean themCTPN(ChiTietPhieuNhap ctpn) {
        String sql = "INSERT INTO CHITIETPHIEUNHAP VALUES  "
                + "(?,?,?,?)";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(1, ncc.getMaNcc());
            ps.setInt(1, ctpn.getMapn_ctpn());
            ps.setInt(2, ctpn.getMasp_ctpn());
            ps.setInt(3, ctpn.getSoluong());
            ps.setDouble(4, ctpn.getThanhtien());
//            ps.execute();
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //sửa nhà cung cấp và cập nhật lại database
    public boolean suaCTPN(ChiTietPhieuNhap ctpn) {
        String sql = " UPDATE CHITIETPHIEUNHAP SET MAPHIEUNHAP=?, MASANPHAM=?, SOLUONG=?, TONGTIEN=? WHERE MACTPN=?";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
//            ps.setInt(1, ncc.getMaNcc());
            ps.setInt(1, ctpn.getMapn_ctpn());
            ps.setInt(2, ctpn.getMasp_ctpn());
            ps.setInt(3, ctpn.getSoluong());
            ps.setDouble(4, ctpn.getThanhtien());
            ps.setInt(5, ctpn.getMaCTPN());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //xóa nhà cung cấp và cập nhật lại dữ liệu

    public boolean xoaCTPN(ChiTietPhieuNhap ctpn) {
        String sql = " DELETE CHITIETPHIEUNHAP WHERE MACTPN=?";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setInt(1, ctpn.getMaCTPN());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //lấy danh sách nhà xung cấp từ cơ sở dữ liệu

    public ArrayList<ChiTietPhieuNhap> getListCTPN() {
        ArrayList<ChiTietPhieuNhap> list = new ArrayList<>();
        String sql = "SELECT * FROM CHITIETPHIEUNHAP";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietPhieuNhap s = new ChiTietPhieuNhap();
                s.setMaCTPN(rs.getInt("MACHITIETPHIEUNHAP"));
                s.setMapn_ctpn(rs.getInt("MAPHIEUNHAP"));
                s.setMasp_ctpn(rs.getInt("MASANPHAM"));
                s.setSoluong(rs.getInt("SOLUONG"));
                s.setThanhtien(rs.getDouble("TONGTIEN"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    protected Statement getStatement() throws Exception {
        if (this.st == null || this.st.isClosed()) {
            this.st = this.cnn.createStatement();
        }
        return this.st;
    }
    public ResultSet queryData(String query) throws Exception {
        try {
            rs = getStatement().executeQuery(query);
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Không thể kết nối csdl: " + ex.toString(), "Error", JOptionPane.OK_OPTION);
        }
        return rs;
    }
     //Thực thi câu lệnh SELECT
    public ResultSet ExcuteQueryGetTable(String cauTruyVanSQL){
        try {
            Statement stmt = cnn.createStatement();           
            ResultSet rs = stmt.executeQuery(cauTruyVanSQL);
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }       
        return null;
    }
    //Thực thi INSERT, DELETE, UPDATE
    public void ExcuteQueryUpdateDB(String cauTruyVanSQL){
       
        try {
            Statement stmt = cnn.createStatement();
            stmt.executeUpdate(cauTruyVanSQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public static void main(String[] args) {
        
        new ConnectDB(); 
    }
}
