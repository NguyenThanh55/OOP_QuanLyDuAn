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
public class ThanNhan {
    public static int dem;
    private int maTN = ++dem;
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;
    private String moiQuanHe;

    public ThanNhan() {
    }

    public ThanNhan(String hoTen, String gioiTinh, Date ngaySinh, String moiQuanHe) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.moiQuanHe = moiQuanHe;
    }
    
    public ThanNhan(String hoTen, String gioiTinh, String ngaySinh, String moiQuanHe) throws ParseException {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = CauHinh.f.parse(ngaySinh);
        this.moiQuanHe = moiQuanHe;
    }
    

    @Override
    public String toString() {
        return String.format("Ma than nhan: %d\nTen than nhan: %s\nGioi tinh: %s\nNgay sinh: %s\n",
                this.getMaTN(),this.getHoTen(), this.getGioiTinh(), CauHinh.f.format(this.getNgaySinh()));
    }
 
    
    /**
     * @return the maThanNhan
     */
  
    /**
     * @return the moiQuanHe
     */
    public String getMoiQuanHe() {
        return moiQuanHe;
    }

    /**
     * @param moiQuanHe the moiQuanHe to set
     */
    public void setMoiQuanHe(String moiQuanHe) {
        this.moiQuanHe = moiQuanHe;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the NgaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param NgaySinh the NgaySinh to set
     */
    public void setNgaySinh(Date NgaySinh) {
        this.ngaySinh = NgaySinh;
    }

    /**
     * @return the maTN
     */
    public int getMaTN() {
        return maTN;
    }

    /**
     * @param maTN the maTN to set
     */
    public void setMaTN(int maTN) {
        this.maTN = maTN;
    }
   
}
