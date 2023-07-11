/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.mainn;

import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Thanh
 */
public abstract class NhanVien {
    protected static double luongcb = 100000;
    private static int dem;
    private int maNV = ++dem;
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;
    private String email;
    protected String loaiNhanVien;
    private double heso;
    private List<ThanNhan> tn = new ArrayList<>();
    private List<DuAn> dsda = new ArrayList<>();
    
    {
        loaiNhanVien = "NhanVienThuong";
    }
    
    public NhanVien(String hoTen, String gioiTinh, Date ngaySinh, String email) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }
    
    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String email) throws ParseException {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = CauHinh.f.parse(ngaySinh);
        this.email = email;
    }

    public NhanVien() {
    }

    public int tinhTuoi(){
        Calendar c = Calendar.getInstance();
        c.setTime(getNgaySinh());
        Calendar today = Calendar.getInstance();
        int tuoi = today.get(Calendar.YEAR)- c.get(Calendar.YEAR);
        if (today.get(Calendar.MONTH)<c.get(Calendar.MONTH)) {
            --tuoi;
        }else if(today.get(Calendar.MONTH)==c.get(Calendar.MONTH)&&
                today.get(Calendar.DAY_OF_MONTH)<c.get(Calendar.DAY_OF_MONTH)){
            --tuoi;
        }
        return tuoi;
    }
    
    public void themDA(DuAn d) {
        if  (dsda.size() <=3)
            dsda.add(d);
        else
            System.out.println("Nhan vien da tham gia du 3 du an");
    }

    public void themTN(ThanNhan e){
        this.getTn().add(e);
    }

    public void hienThiTN(){
        for(ThanNhan tn : this.getTn()){
            System.out.println(tn);
        }
    }
    
    public abstract double layHeSo();

    public abstract double tinhLuong();


    
    @Override
    public String toString() {
        return String.format("Ma nhan vien: %d\nTen NV: %s\nGioi tinh: %s\nNgay sinh: %s\nEmail: %s\n",
                this.getMaNV(), this.getHoTen(), this.getGioiTinh(),
                CauHinh.f.format(this.getNgaySinh()), this.getEmail());
    }

    public void hienthiDSDA() {
        dsda.forEach(s -> System.out.println(s));
    }

    /**
     * @return the maNV
     */
    public int getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(int maNV) {
        this.maNV = maNV;
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
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the tn
     */
    public List<ThanNhan> getTn() {
        return tn;
    }

    /**
     * @param tn the tn to set
     */
    public void setTn(List<ThanNhan> tn) {
        this.tn = tn;
    }

    /**
     * @return the ds
     */
    public List<DuAn> getDs() {
        return dsda;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<DuAn> ds) {
        this.dsda = ds;
    }

    /**
     * @return the heso
     */
    public double getHeso() {
        return heso;
    }

    /**
     * @param heso the heso to set
     */
    public void setHeso(double heso) {
        this.heso = heso;
    }

    /**
     * @return the loaiNhanVien
     */
    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    /**
     * @param loaiNhanVien the loaiNhanVien to set
     */
    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

}
