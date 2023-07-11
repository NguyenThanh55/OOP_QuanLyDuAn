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
public class ThietKeVien extends NhanVien{
    private double bonus;
    
    {
        bonus = 0;
        loaiNhanVien = "ThietKeVien";
    }
    
    public ThietKeVien() {
    }

    public ThietKeVien( String hoTen, String gioiTinh, Date ngaySinh, String email) {
        super(hoTen, gioiTinh, ngaySinh, email);
        this.bonus = bonus;
    }

    public ThietKeVien( String hoTen, String gioiTinh, String ngaySinh, String email) throws ParseException {
        super(hoTen, gioiTinh, ngaySinh, email);
        this.bonus = bonus;
    }

    @Override
    public double layHeSo() {
        System.out.println("Nhap he so");
        double heso = Double.parseDouble(CauHinh.sc.nextLine());
        System.out.println("Bonus: ");
        this.setBonus(Double.parseDouble(CauHinh.sc.nextLine()));
        System.out.println("Luong: ");
        return heso;//To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public double tinhLuong() {
        return luongcb * layHeSo() + this.bonus; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("Bonus: %.1f\n", this.bonus);
    }
     
    

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
}
