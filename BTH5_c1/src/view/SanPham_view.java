/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.SanPham_listener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import database.*;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author QuangDuong
 */
public class SanPham_view extends JFrame {

    // Label
    private JLabel lbl_maSP;
    private JLabel lbl_tenSP;
    private JLabel lbl_gia;

    // Text Field 
    private JTextField tf_maSP;
    private JTextField tf_tenSP;
    private JTextField tf_gia;

    // Table 
    private JTable tbl_informationSP;

    // Button 
    private JButton btn_them;
    private JButton btn_xoa;
    private JButton btn_sua;
    private JButton btn_thoat;

    public SanPham_view() throws ClassNotFoundException, SQLException {
        this.init();
        this.setVisible(true);
    }

    private void init() throws ClassNotFoundException, SQLException {
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("San Pham");
        this.setLayout(new GridLayout(3, 0, 0, 30));

        ActionListener ac = new SanPham_listener(this);
        MouseListener mc = new SanPham_listener(this);

        this.lbl_maSP = new JLabel("Ma san pham");
        this.lbl_tenSP = new JLabel("Ten san pham");
        this.lbl_gia = new JLabel("Gia");

        this.tf_maSP = new JTextField();
        this.tf_tenSP = new JTextField();
        this.tf_gia = new JTextField();

        this.tbl_informationSP = new JTable();
        this.tbl_informationSP.setModel(createDefaultTableModel());
        this.tbl_informationSP.addMouseListener(mc);

        this.btn_them = new JButton("Them");
        this.btn_xoa = new JButton("Xoa");
        this.btn_sua = new JButton("Sua");
        this.btn_thoat = new JButton("Thoat");

        this.btn_them.addActionListener(ac);
        this.btn_xoa.addActionListener(ac);
        this.btn_sua.addActionListener(ac);
        this.btn_thoat.addActionListener(ac);

        JPanel pnl_insert = new JPanel();
        pnl_insert.setLayout(new GridLayout(3, 2, 1, 5));
        pnl_insert.add(lbl_maSP);
        pnl_insert.add(tf_maSP);
        pnl_insert.add(lbl_tenSP);
        pnl_insert.add(tf_tenSP);
        pnl_insert.add(lbl_gia);
        pnl_insert.add(tf_gia);

        JPanel pnl_buttons = new JPanel();
        pnl_buttons.add(btn_them);
        pnl_buttons.add(btn_xoa);
        pnl_buttons.add(btn_sua);
        pnl_buttons.add(btn_thoat);

        this.add(pnl_insert);
        this.add(tbl_informationSP);
        this.add(pnl_buttons);
    }

    private DefaultTableModel createDefaultTableModel() throws ClassNotFoundException, SQLException {
        DefaultTableModel model = new DefaultTableModel();

        String[] tieuDe = {"Ma san pham", "Ten san pham", "Gia"};
        model.setColumnIdentifiers(tieuDe);

        Connection conn = new OracleConnection().getConnection();

        try {
            String SQL = "SELECT maSP, tenSP, gia FROM SANPHAM";

            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(SQL);

            addRow(rs, model);

        } catch (SQLException sqle) {
            System.err.println(sqle);
        }

        return model;
    }

    private void addRow(ResultSet rs, DefaultTableModel model) throws ClassNotFoundException, SQLException {
        String[] row = new String[3];

        while (rs.next()) {
            row[0] = rs.getString(1);
            row[1] = rs.getString(2);
            row[2] = rs.getString(3);
            model.addRow(row);
        }
    }

    public void add() throws ClassNotFoundException, SQLException {
        String maSP = tf_maSP.getText();
        String tenSP = tf_tenSP.getText();
        String gia = tf_gia.getText();

        String SQL = "INSERT INTO SANPHAM VALUES (?, ?, ?)";

        Connection conn = new OracleConnection().getConnection();

        PreparedStatement ps = conn.prepareStatement(SQL);
        ps.setString(1, maSP);
        ps.setString(2, tenSP);
        ps.setString(3, gia);

        int x = ps.executeUpdate();

        if (x == 1) {
            JOptionPane.showMessageDialog(this, "Them du lieu thanh cong.");
        } else {
            JOptionPane.showMessageDialog(this, "Them du lieu that bai.");
        }

        conn.close();

        // Refresh cùng dữ liệu mới 
        reloadFrameWithUpdatedTable();
    }

    public void getInfo() {
        int indexTB = tbl_informationSP.getSelectedRow();
        if (indexTB < tbl_informationSP.getRowCount() && indexTB >= 0) {
            tf_maSP.setText(tbl_informationSP.getValueAt(indexTB, 0).toString());
            tf_tenSP.setText(tbl_informationSP.getValueAt(indexTB, 1).toString());
            tf_gia.setText(tbl_informationSP.getValueAt(indexTB, 2).toString());
        }
    }

    public void update() throws ClassNotFoundException, SQLException {
        String maSP = tf_maSP.getText();
        String tenSP = tf_tenSP.getText();
        int gia = Integer.parseInt(this.tf_gia.getText());

        int ret = JOptionPane.showConfirmDialog(this, "Xac nhan sua?", "Sua du lieu", JOptionPane.YES_NO_OPTION);

        if (ret == JOptionPane.YES_OPTION) {
            Connection conn = new OracleConnection().getConnection();
            String SQL = "UPDATE SANPHAM SET TENSP = ?, GIA = ? WHERE MASP = ?";

            try {
                PreparedStatement ps = conn.prepareStatement(SQL);
                ps.setString(1, tenSP);
                ps.setInt(2, gia);
                ps.setString(3, maSP);
                ps.executeUpdate();
                conn.close();
                reloadFrameWithUpdatedTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Xay ra loi.");
            }
        }
    }

    public void delete() throws ClassNotFoundException, SQLException {
        String maSP = tf_maSP.getText();

        int ret = JOptionPane.showConfirmDialog(this, "Xac nhan xoa?", "Xoa du lieu", JOptionPane.YES_NO_OPTION);

        if (ret == JOptionPane.YES_OPTION) {
            Connection conn = new OracleConnection().getConnection();
            String SQL = "DELETE FROM SANPHAM WHERE MASP=?";

            try {
                PreparedStatement ps = conn.prepareStatement(SQL);
                ps.setString(1, maSP);
                ps.executeUpdate();
                conn.close();
                reloadFrameWithUpdatedTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Xay ra loi");
            }
        }
    }

    public void exit() {
        int ret = JOptionPane.showConfirmDialog(this, "Ban co muon thoat", "Thoat", JOptionPane.YES_NO_OPTION);

        if (ret == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }

    private void reloadFrameWithUpdatedTable() throws ClassNotFoundException, SQLException {
        this.dispose();
        this.tbl_informationSP.setModel(createDefaultTableModel());
        this.setVisible(true);
    }
}
