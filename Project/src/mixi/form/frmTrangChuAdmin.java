/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mixi.form;

import Entities.KhachHang;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class frmTrangChuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public frmTrangChuAdmin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtQuanLyDonHang1 = new javax.swing.JButton();
        jbtThoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonNcc = new javax.swing.JButton();
        jButtonQlsp = new javax.swing.JButton();
        jButtonQlnv1 = new javax.swing.JButton();
        jButtonKh1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtQuanLyDonHang1.setText("Quản lý hóa đơn ");
        jbtQuanLyDonHang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtQuanLyDonHang1MouseClicked(evt);
            }
        });
        jbtQuanLyDonHang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtQuanLyDonHang1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtQuanLyDonHang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 130, -1));

        jbtThoat.setText("Thoát");
        jbtThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtThoatMouseClicked(evt);
            }
        });
        jbtThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThoatActionPerformed(evt);
            }
        });
        getContentPane().add(jbtThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mixi1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 440, 260));

        jButtonNcc.setText("Nhà cung cấp");
        jButtonNcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNccActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 130, -1));

        jButtonQlsp.setText("Quản lý sản phẩm");
        jButtonQlsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQlspActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonQlsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 130, -1));

        jButtonQlnv1.setText("Quản lý nhân viên");
        jButtonQlnv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQlnv1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonQlnv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 130, -1));

        jButtonKh1.setText("Quản lý khách hàng");
        jButtonKh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKh1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonKh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThoatMouseClicked
        int thoat = JOptionPane.showConfirmDialog(null, "Bạn muốn thoát?", "Thoát", JOptionPane.YES_NO_OPTION);
        if (thoat == JOptionPane.YES_OPTION) {
//            System.exit(1);
            this.hide();
            new frmDangNhap().setVisible(true);
        }
    }//GEN-LAST:event_jbtThoatMouseClicked

    private void jbtThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThoatActionPerformed

    }//GEN-LAST:event_jbtThoatActionPerformed

    private void jbtQuanLyDonHang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtQuanLyDonHang1MouseClicked

    }//GEN-LAST:event_jbtQuanLyDonHang1MouseClicked

    private void jButtonNccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNccActionPerformed
        this.hide();
        new QuanLiNhaCungCap().setVisible(true);

    }//GEN-LAST:event_jButtonNccActionPerformed

    private void jbtQuanLyDonHang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtQuanLyDonHang1ActionPerformed
        new frmQuanLiHoaDonBanHang().setVisible(true);
        this.hide();

    }//GEN-LAST:event_jbtQuanLyDonHang1ActionPerformed

    private void jButtonQlspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQlspActionPerformed
        new QuanLiSanPham().setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButtonQlspActionPerformed

    private void jButtonQlnv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQlnv1ActionPerformed
        new frmQuanLiNhanVien().setVisible(true);this.hide();
    }//GEN-LAST:event_jButtonQlnv1ActionPerformed

    private void jButtonKh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKh1ActionPerformed
       new frmKhachHang().setVisible(true);this.hide();
    }//GEN-LAST:event_jButtonKh1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmTrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new frmTrangChuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonKh1;
    private javax.swing.JButton jButtonNcc;
    private javax.swing.JButton jButtonQlnv1;
    private javax.swing.JButton jButtonQlsp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtQuanLyDonHang1;
    private javax.swing.JButton jbtThoat;
    // End of variables declaration//GEN-END:variables
}