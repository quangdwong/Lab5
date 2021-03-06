/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.DefaultComboBoxModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import javax.swing.JOptionPane;
import database.orclConnection;
import java.util.ArrayList;

/**
 *
 * @author QuangDuong
 */
public class DatLichKham extends javax.swing.JFrame {

    private String mabs;

    /**
     * Creates new form DatLichKham
     */
    public DatLichKham() {
        initComponents();
        this.setTitle("Đặt lịch khám");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tf_tenbn = new javax.swing.JTextField();
        tf_maBN = new javax.swing.JTextField();
        tf_yeuCau = new javax.swing.JTextField();
        cbb_bacSi = new javax.swing.JComboBox<>();
        btn_datLich = new javax.swing.JButton();
        tf_ngayKham = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel19.setText("Mã bệnh nhân");

        jLabel20.setText("Tên bệnh nhân");

        jLabel21.setText("Ngày khám (dd/mm/yyyy)");

        jLabel22.setText("Yêu cầu khám");

        jLabel24.setText("Bác sĩ khám");

        tf_tenbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tenbnActionPerformed(evt);
            }
        });

        tf_maBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_maBNActionPerformed(evt);
            }
        });

        tf_yeuCau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_yeuCauActionPerformed(evt);
            }
        });

        cbb_bacSi.setModel(new DefaultComboBoxModel(this.setItem_ComboBox())
        );
        cbb_bacSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_bacSiActionPerformed(evt);
            }
        });

        btn_datLich.setText("Đặt lịch khám");
        btn_datLich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datLichActionPerformed(evt);
            }
        });

        tf_ngayKham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ngayKhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_maBN, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20)
                                .addComponent(jLabel22)
                                .addComponent(jLabel21))
                            .addGap(99, 99, 99)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_yeuCau, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_tenbn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_ngayKham, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel24)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btn_datLich)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(cbb_bacSi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_maBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tf_tenbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tf_ngayKham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tf_yeuCau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(cbb_bacSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_datLich)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_maBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_maBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_maBNActionPerformed

    private void tf_yeuCauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_yeuCauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_yeuCauActionPerformed

    private void cbb_bacSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_bacSiActionPerformed
        Connection conn;
        String SQL = "select mabs from bacsi where tenbs=?";
        String tenbs = (String) cbb_bacSi.getSelectedItem();

        try {
            conn = new orclConnection().getConnection();

            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, tenbs);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                this.mabs = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Xay ra loi khi ket noi");
        }

    }//GEN-LAST:event_cbb_bacSiActionPerformed
    
    private void btn_datLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datLichActionPerformed
        String maBN = tf_maBN.getText();
        String tenBN = tf_tenbn.getText();
        Date ngayKham = toDate();
        String yeuCau = tf_yeuCau.getText();
      
        String SQL = "insert into KHAMBENH (mabn, ngaykham, yeucaukham, mabs) values (?, ?, ?, ?)";
        Connection conn;

        try {
            conn = new orclConnection().getConnection();

            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, maBN);
            ps.setDate(2, new java.sql.Date(ngayKham.getTime()));
            ps.setString(3, yeuCau);
            ps.setString(4, this.mabs);

            int x = ps.executeUpdate();

            if (x == 1) {
                JOptionPane.showMessageDialog(this, "Them du lieu thanh cong");
            } else {
                JOptionPane.showMessageDialog(this, "Them du lieu that bai");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Xay ra loi khi them du lieu");
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_datLichActionPerformed

    private void tf_ngayKhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ngayKhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ngayKhamActionPerformed

    private void tf_tenbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tenbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_tenbnActionPerformed

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
            java.util.logging.Logger.getLogger(DatLichKham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatLichKham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatLichKham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatLichKham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatLichKham().setVisible(true);
            }
        });
    }
    
    

    private Object[] setItem_ComboBox() {
        Object[] list = null;
        String SQL = "select tenBS from BACSI";
        Connection conn = null;

        try {
            conn = new database.orclConnection().getConnection();

            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            ArrayList<String> nameList = new ArrayList<>();

            while (rs.next()) {
                nameList.add(rs.getString(1));
            }

            list = nameList.toArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Xay ra loi khi truy xuat danh sach bac si");
        }
        
        return list;
    }

    private Date toDate() {
        Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        try {
            date = formatter.parse(tf_ngayKham.getText());
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(this, "Xay ra loi khi parse ngay");
        }

        return date;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_datLich;
    private javax.swing.JComboBox<String> cbb_bacSi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField tf_maBN;
    private javax.swing.JTextField tf_ngayKham;
    private javax.swing.JTextField tf_tenBN;
    private javax.swing.JTextField tf_tenBN1;
    private javax.swing.JTextField tf_tenBN2;
    private javax.swing.JTextField tf_tenbn;
    private javax.swing.JTextField tf_yeuCau;
    // End of variables declaration//GEN-END:variables
}
