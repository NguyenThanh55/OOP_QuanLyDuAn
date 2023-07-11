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
public class KiemThuVien extends NhanVien{
    private int error;
    {
        error = 0;
        loaiNhanVien = "KiemThuVien";
    }

    public KiemThuVien() {
    }

    public KiemThuVien( String hoTen, String gioiTinh, Date ngaySinh, String email) {
        super(hoTen, gioiTinh, ngaySinh, email);
        this.error = error;
    }

    public KiemThuVien( String hoTen, String gioiTinh, String ngaySinh, String email) throws ParseException {
        super(hoTen, gioiTinh, ngaySinh, email);
        this.error = error;
    }

    @Override
    public double layHeSo() {
        System.out.println("Nhap he so");
        double heso = Double.parseDouble(CauHinh.sc.nextLine());
        System.out.println("Error: ");
        this.setError(Integer.parseInt(CauHinh.sc.nextLine()));
        System.out.println("Luong: ");
        return heso;//To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public double tinhLuong() {
        return  luongcb * layHeSo() + this.error * 200000;  //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public String toString() {
        return super.toString() + String.format("Error: %d\n", this.error);
    }
    
    

    /**
     * @return the error
     */
    public int getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(int error) {
        this.error = error;
    }
}
