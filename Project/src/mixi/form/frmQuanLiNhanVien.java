/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mixi.form;

import Entities.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nhom4.ConnectDB;

/**
 *
 * @author ADMIN
 */
public class frmQuanLiNhanVien extends javax.swing.JFrame {

    ArrayList<NhanVien> dsnv = new ArrayList<>();
    DefaultTableModel tableNV;

    /**
     * Creates new form QuanLiNhanVien
     */
    public frmQuanLiNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
        getData();
    }
    Calendar cal = Calendar.getInstance();

    int day = cal.get(Calendar.DAY_OF_MONTH);
    int month = cal.get(Calendar.MONTH) + 1;
    int year = cal.get(Calendar.YEAR);

    Date dt = cal.getTime();
// Dinh dang lai hien thi thong tin ngay gio ra man hinh
    SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNhanVien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttennv = new javax.swing.JTextField();
        txtdc = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        jButtonThem = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonTim = new javax.swing.JButton();
        txtManv = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxChucVu = new javax.swing.JComboBox<>();
        jComboBoxGt = new javax.swing.JComboBox<>();
        cbbngay = new javax.swing.JComboBox<>();
        cbbthang = new javax.swing.JComboBox<>();
        cbbnam = new javax.swing.JComboBox<>();
        txtTimMa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí nhân viên");
        setName("quanlinhanvien"); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jTableNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Ngày sinh", "Chức vụ", "Giới tính", "Địa chỉ", "Số điện thoại"
            }
        ));
        jTableNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNhanVien);

        jLabel1.setText("Mã nhân viên");

        jLabel2.setText("Tên nhân viên");

        jLabel3.setText("Địa chỉ");

        jLabel4.setText("Số điện thoại");

        jButtonThem.setText("Thêm nhân viên mới");
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemActionPerformed(evt);
            }
        });

        jButtonSua.setText("Sửa thông tin ");
        jButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaActionPerformed(evt);
            }
        });

        jButtonXoa.setText("Xóa nhân viên");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        jButtonBack.setText("Trở lại");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jButtonTim.setText("Tìm nhân viên");
        jButtonTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimActionPerformed(evt);
            }
        });

        txtManv.setEditable(false);

        jButton1.setText("Hiển thị lại danh sách");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Ngày sinh");

        jLabel6.setText("Giới tính");

        jLabel7.setText("Chức vụ");

        jComboBoxChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Nhân viên", " " }));

        jComboBoxGt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttennv, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbbnam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbthang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(342, 342, 342))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonTim, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimMa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBack)
                            .addComponent(jButton1))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbbnam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbthang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxGt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonThem)
                        .addComponent(jButtonSua)
                        .addComponent(jButtonXoa)
                        .addComponent(jButtonTim)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBack)
                    .addComponent(txtTimMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        new frmTrangChuAdmin().setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButtonBackActionPerformed


    private void jButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemActionPerformed
        String MaNhanVien, TenNhanVien, NgaySinh, GioiTinh, ChucVu, DiaChi, SoDT;
        MaNhanVien = txtManv.getText();
        TenNhanVien = txttennv.getText();

        String ngay, thang, nam;
        ngay = cbbngay.getSelectedItem().toString();
        thang = cbbthang.getSelectedItem().toString();
        nam = cbbnam.getSelectedItem().toString();
        NgaySinh = nam + "-" + thang + "-" + ngay;

        GioiTinh = jComboBoxGt.getSelectedItem().toString();
        ChucVu = jComboBoxChucVu.getSelectedItem().toString();

        DiaChi = txtdc.getText();
        SoDT = txtsdt.getText();
        NhanVien nv = new NhanVien(TenNhanVien, NgaySinh, GioiTinh, ChucVu, DiaChi, SoDT);
        if (new ConnectDB().themNV(nv)) {
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
            dsnv.add(nv);
            getData();
        }
    }//GEN-LAST:event_jButtonThemActionPerformed


    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed

        int id = (Integer.parseInt(txtManv.getText()));
        String tennv = txttennv.getText();
        String gt = (jComboBoxGt.getSelectedItem().toString());
        String ns = (cbbnam.getSelectedItem().toString()) + "-" + cbbthang.getSelectedItem().toString() + "-" + cbbngay.getSelectedItem().toString();
        String cv = jComboBoxChucVu.getSelectedItem().toString();
        String dcc = txtdc.getText();
        String sdt = txtsdt.getText();
        NhanVien nv = new NhanVien(tennv, ns, gt, cv, dcc, sdt);
        Boolean check = new ConnectDB().suaNV(nv, id);
        getData();

    }//GEN-LAST:event_jButtonSuaActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        int d = jTableNhanVien.getSelectedRow();
        if (d >= 0) {
            NhanVien nv = dsnv.get(d);
            int op = JOptionPane.showConfirmDialog(rootPane, "Bạn có thực sự muốn xóa", "Xóa nhân viên", JOptionPane.YES_NO_OPTION);
            if (op == JOptionPane.YES_OPTION) {
                dsnv.remove(nv);
            }
            if (new ConnectDB().xoaNV(nv)) {
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công nhân viên có mã là " + txtManv.getText());
                getData();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Không xóa được");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Chưa có sinh viên để xóa");
        }

    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jButtonTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimActionPerformed
        int tim =Integer.parseInt( txtTimMa.getText());
        tableNV.setRowCount(0);
        for (NhanVien nv : dsnv) {
            if(nv.getMaNV()==tim) {
                tableNV.addRow(new Object[]{
                    nv.getMaNV(), nv.getTenNV(), nv.getDiaChi(), nv.getsDt(),}
                );
            }

        }
        txtTimMa.setText("");
    }//GEN-LAST:event_jButtonTimActionPerformed

    private void jTableNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNhanVienMouseClicked
        int d = jTableNhanVien.getSelectedRow();
        txtManv.setText(dsnv.get(d).getMaNV() + "");
        txttennv.setText(dsnv.get(d).getTenNV());
        txtdc.setText(dsnv.get(d).getDiaChi());
        txtsdt.setText(dsnv.get(d).getsDt());
        jComboBoxGt.setSelectedItem(dsnv.get(d).getGioiTinh());
        jComboBoxChucVu.setSelectedItem(dsnv.get(d).getChucVu());

    }//GEN-LAST:event_jTableNhanVienMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        getData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();

        for (int i = 1; i < 32; i++) {
            cbbngay.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbthang.addItem(String.valueOf(i));
        }
        for (int i = year; i > 1980; i--) {
            cbbnam.addItem(String.valueOf(i));
        }
        cbbnam.setSelectedItem(String.valueOf(year));
        cbbngay.setSelectedItem(String.valueOf(day));
        cbbthang.setSelectedItem(String.valueOf(month));

    }//GEN-LAST:event_formComponentShown
    public void getData() {
        dsnv = new ConnectDB().getListNV();
        tableNV = (DefaultTableModel) jTableNhanVien.getModel();
        tableNV.setRowCount(0);
        for (NhanVien nv : dsnv) {
            tableNV.addRow(new Object[]{
                nv.getMaNV(), nv.getTenNV(), nv.getNgaySinh(), nv.getChucVu(), nv.getGioiTinh(), nv.getDiaChi(), nv.getsDt(),}
            );

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmQuanLiNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQuanLiNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQuanLiNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQuanLiNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQuanLiNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbnam;
    private javax.swing.JComboBox<String> cbbngay;
    private javax.swing.JComboBox<String> cbbthang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonTim;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JComboBox<String> jComboBoxChucVu;
    private javax.swing.JComboBox<String> jComboBoxGt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableNhanVien;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtTimMa;
    private javax.swing.JTextField txtdc;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttennv;
    // End of variables declaration//GEN-END:variables
}
