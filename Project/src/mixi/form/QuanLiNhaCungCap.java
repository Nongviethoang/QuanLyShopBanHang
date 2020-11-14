
package mixi.form;

import Entities.NhaCungCap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nhom4.ConnectDB;

public class QuanLiNhaCungCap extends javax.swing.JFrame {
    
    ArrayList<NhaCungCap> dsncc;
    DefaultTableModel tbNCC;
    
    public QuanLiNhaCungCap() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        getData();
        setLocationRelativeTo(null);
    }
    
    
    
    public void getData() {
        dsncc = new ConnectDB().getListNCC();
        tbNCC = (DefaultTableModel) jTableNhaCungCap.getModel();
        tbNCC.setRowCount(0);
        for (NhaCungCap ncc : dsncc) {
            tbNCC.addRow(new Object[]{
                ncc.getMaNCC(),
                ncc.getTenNCC(),
                ncc.getDiaChi(),
                ncc.getsDT(),
                ncc.getEmail()}
            );
        }
//        tbNCC.fireTableDataChanged();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNhaCungCap = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaNcc = new javax.swing.JTextField();
        txtDc = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtTenncc = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jButtonThem = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jButtonQuayLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nhà cung cấp");

        jTableNhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Địa chỉ", "Số điện thoại", "Email"
            }
        ));
        jTableNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNhaCungCapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNhaCungCap);

        jLabel1.setText("Mã nhà cung cấp");

        jLabel2.setText("Tên nhà cung cấp");

        jLabel3.setText("Địa chỉ");

        jLabel4.setText("Số điện thoại");

        jLabel5.setText("Email");

        txtMaNcc.setEditable(false);

        jButtonThem.setText("Thêm");
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemActionPerformed(evt);
            }
        });

        jButtonSua.setText("Sửa");
        jButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaActionPerformed(evt);
            }
        });

        jButtonXoa.setText("Xóa");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        jButtonQuayLai.setText("Trở lại");
        jButtonQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSua)
                            .addComponent(jButtonXoa)
                            .addComponent(jButtonThem)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNcc, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDc, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTenncc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jButtonQuayLai)))))
                .addGap(32, 32, 32))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDc, txtEmail, txtMaNcc, txtSdt, txtTenncc});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonQuayLai, jButtonSua, jButtonThem, jButtonXoa});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButtonThem)
                        .addGap(44, 44, 44)
                        .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtMaNcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtTenncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtDc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButtonQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuayLaiActionPerformed
        new frmTrangChuAdmin().setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButtonQuayLaiActionPerformed

    private void jButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemActionPerformed
        NhaCungCap ncc;
            String ten = txtTenncc.getText();
            if (ten.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Tên còn trống");
                return;
            }
            String dc = txtDc.getText();
            if (dc.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Địa chỉ còn trống");
                return;
            }
            String sdt = txtSdt.getText();
            if (sdt.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Số điện thoại còn trống");
                return;
            }
            String email = txtEmail.getText();
            if (email.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Email còn trống!");
                return;
            }
            ncc = new NhaCungCap(ten, dc, sdt, email);
            if (new ConnectDB().themNCC(ncc)) {
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                dsncc.add(ncc);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Thất bại");
            }
            getData();
            txtMaNcc.setText("");
            txtTenncc.setText("");
            txtDc.setText("");
            txtSdt.setText("");
            txtEmail.setText("");
        
    }//GEN-LAST:event_jButtonThemActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        int d = jTableNhaCungCap.getSelectedRow();
        if (d >= 0) {
            NhaCungCap ncc = dsncc.get(d);
            int op = JOptionPane.showConfirmDialog(rootPane, "Bạn có thực sự muốn xóa", "Xóa nhà cung cấp", JOptionPane.YES_NO_OPTION);
            if (op == JOptionPane.YES_OPTION) {
                dsncc.remove(ncc);
            }
            if (new ConnectDB().xoaNCC(ncc)) {
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công nhà cung cấp " + txtTenncc.getText());
                getData();
                txtMaNcc.setText("");
                txtTenncc.setText("");
                txtDc.setText("");
                txtSdt.setText("");
                txtEmail.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Không xóa được");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Chưa có nhà cung cấp để xóa");
        }
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jTableNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNhaCungCapMouseClicked
        int d = jTableNhaCungCap.getSelectedRow();
        txtMaNcc.setText(dsncc.get(d).getMaNCC()+"");
        txtTenncc.setText(dsncc.get(d).getTenNCC());
        txtDc.setText(dsncc.get(d).getDiaChi());
        txtSdt.setText(dsncc.get(d).getsDT());
        txtEmail.setText(dsncc.get(d).getEmail());
    }//GEN-LAST:event_jTableNhaCungCapMouseClicked

    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed
        int d = jTableNhaCungCap.getSelectedRow();
        NhaCungCap ncc = dsncc.get(d);
        dsncc.get(d).setMaNCC(Integer.parseInt(txtMaNcc.getText()));
        dsncc.get(d).setTenNCC(txtTenncc.getText());
        dsncc.get(d).setDiaChi(txtDc.getText());
        dsncc.get(d).setsDT(txtSdt.getText());
        dsncc.get(d).setEmail(txtEmail.getText());
        if (new ConnectDB().suaNCC(ncc)) {
            JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
            getData();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Sửa thất bại");

        }
        getData();
    }//GEN-LAST:event_jButtonSuaActionPerformed

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
            java.util.logging.Logger.getLogger(NhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhaCungCap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLiNhaCungCap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonQuayLai;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableNhaCungCap;
    private javax.swing.JTextField txtDc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNcc;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTenncc;
    // End of variables declaration//GEN-END:variables
}
