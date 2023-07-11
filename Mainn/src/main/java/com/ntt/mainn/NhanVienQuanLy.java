/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.mainn;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.crypto.Data;

/**
 *
 * @author Thanh
 */
public class NhanVienQuanLy extends NhanVien{
    private Date ngayNhamChuc;
    private int demSoPhongBan=0;
    private List<PhongBan> pb = new ArrayList<>();

    public NhanVienQuanLy(String hoTen, String gioiTinh, String ngaySinh, String email, String ngayNhamChuc) throws ParseException {
        super(hoTen, gioiTinh, ngaySinh, email);
        this.ngayNhamChuc = CauHinh.f.parse(ngayNhamChuc);
    }

    public NhanVienQuanLy(String hoTen, String gioiTinh, Date ngaySinh, String email, Date ngayNhamChuc) throws ParseException {
        super(hoTen, gioiTinh, ngaySinh, email);
        this.ngayNhamChuc = ngayNhamChuc;
    }
    
    @Override
    public String toString() {
        return String.format("%s\nNgay nham chuc: %s\nSo phong ban quan ly: %s\n",super.toString(), CauHinh.f.format(ngayNhamChuc), this.demSoPhongBan);
    }

    @Override
    public double layHeSo() {
        System.out.println("Nhap he so");
        double heso = Double.parseDouble(CauHinh.sc.nextLine());
        System.out.print("Luong: ");
        return heso;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double tinhLuong() {
        return luongcb * layHeSo();//To change body of generated methods, choose Tools | Templates.
    }
    
    public void themPB(PhongBan p) {
        if (pb.size() <= 2) {
            this.ngayNhamChuc = new Date();
            pb.add(p);
            demSoPhongBan += 1;
        }
        else 
            System.out.println("Danh sach phong ban da du!!!");
    }

    public void xoaPB(PhongBan p) {
            pb.remove(p);
            demSoPhongBan -= 1;
    }
    
    public void hienthiDSPB() {
        pb.forEach(s -> {
            System.out.print(s);
            System.out.println("Ngay nhan chuc: " + CauHinh.f.format(ngayNhamChuc));
        });
    }
    
    
    
    

    

    /**
     * @return the ngayNhamChucData
     */
    public Date getNgayNhamChucData() {
        return ngayNhamChuc;
    }

    /**
     * @param ngayNhamChucData the ngayNhamChucData to set
     */
    public void setNgayNhamChucData(Date ngayNhamChucData) {
        this.ngayNhamChuc = ngayNhamChucData;
    }

    /**
     * @return the pb
     */
    public List<PhongBan> getPb() {
        return pb;
    }

    /**
     * @param pb the pb to set
     */
    public void setPb(List<PhongBan> pb) {
        this.pb = pb;
    }

}
