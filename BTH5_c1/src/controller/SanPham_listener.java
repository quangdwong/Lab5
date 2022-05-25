/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import javax.swing.JOptionPane;
import view.*;

/**
 *
 * @author QuangDuong
 */
public class SanPham_listener implements ActionListener, MouseListener {

    private SanPham_view spv;

    public SanPham_listener(SanPham_view spv) {
        this.spv = spv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        try {
            if (src.equals("Them")) {
                spv.add();
            } else if (src.equals("Xoa")) {
                spv.delete();
            } else if (src.equals("Sua")){
                spv.update();
            } else {
                spv.exit();
            }

        } catch (Exception exception) {
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        spv.getInfo();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
