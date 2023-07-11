/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.mainn;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author Thanh
 */
public class NhanVienThuong extends NhanVien{
    {
        loaiNhanVien = "NhanVienThuong";
    }

    public NhanVienThuong(String hoTen, String gioiTinh, Date ngaySinh, String email) {
        super(hoTen, gioiTinh, ngaySinh, email);
    }
    
    public NhanVienThuong(String hoTen, String gioiTinh, String ngaySinh, String email) throws ParseException {
        super(hoTen, gioiTinh, ngaySinh, email);
    }
    
    
    @Override
    public double layHeSo() {
        System.out.println("Nhap he so");
        double heso = Double.parseDouble(CauHinh.sc.nextLine());
        System.out.print("Luong: ");
        return heso; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double tinhLuong() {
        return layHeSo() * luongcb; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
