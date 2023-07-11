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
public class LapTrinhVien extends NhanVien{
    private double luongOT;
    
    {
        luongOT = 0;
        loaiNhanVien = "LapTrinhVien";
    }

    public LapTrinhVien() {
    }
    

    public LapTrinhVien( String hoTen, String gioiTinh, Date ngaySinh, String email) {
        super(hoTen, gioiTinh, ngaySinh, email);
        this.luongOT = luongOT;
    }

    public LapTrinhVien( String hoTen, String gioiTinh, String ngaySinh, String email) throws ParseException {
        super(hoTen, gioiTinh, ngaySinh, email);
        this.luongOT = luongOT;
    }

    @Override
    public double layHeSo() {
        System.out.println("Nhap he so");
        double heso = Double.parseDouble(CauHinh.sc.nextLine());
        System.out.println("Luong OT: ");
        this.setLuongOT(Double.parseDouble(CauHinh.sc.nextLine()));
        System.out.println("Luong: ");
        return heso; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double tinhLuong() {
        return luongcb * layHeSo() + luongOT; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return String.format("%sLuong OT: %.1f\n",super.toString(), this.luongOT);
    }

    
    /**
     * @return the luongOT
     */
    public double getLuongOT() {
        return luongOT;
    }

    /**
     * @param luongOT the luongOT to set
     */
    public void setLuongOT(double luongOT) {
        this.luongOT = luongOT;
    }
    
}
