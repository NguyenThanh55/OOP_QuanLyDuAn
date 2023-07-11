/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.mainn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Thanh
 */
public class DuAn {
    public static int dem;
    private int maDuAn = ++dem;
    private String tenDuAn;
    private Date tgBatDau;
    private Date tgKetThuc;
    private int kinhPhiDauTu;
    private NhanVien nguoiQL = null;
    private List<NhanVien> nv = new ArrayList<>();

    public DuAn() {
    }

    public DuAn(String tenDuAn, Date tgBatDau, Date tgKetThuc, int kinhPhiDauTu, List<NhanVien> nv) {
        this.nv = nv;
        if (nv.size() >= 5 && nv.size() <= 10) {
            this.tenDuAn = tenDuAn;
            this.tgBatDau = tgBatDau;
            this.tgKetThuc = tgKetThuc;
            this.kinhPhiDauTu = kinhPhiDauTu;
        }
    }    

    public DuAn(String tenDuAn, String tgBatDau, String tgKetThuc, int kinhPhiDauTu, List<NhanVien> nv) throws ParseException {
        this.nv = nv;
        if (nv.size() >= 5 && nv.size() <= 10) {
            this.tenDuAn = tenDuAn;
            this.tgBatDau = CauHinh.f.parse(tgBatDau);
            this.tgKetThuc = CauHinh.f.parse(tgKetThuc);
            this.kinhPhiDauTu = kinhPhiDauTu;
        }
    }
    
    public void themNV(NhanVien nv) {
        if (this.nv.size() <=10)
            this.nv.add(nv);
        else
            System.out.println("Da du nhan vien cho du an nay");
    }

    public void xoaNV(NhanVien nv) {
        this.nv.remove(nv);
    }

    public void xoaNgQL() { this.nguoiQL = null; };

    //Khong co nhan vien thi tra ve true
    public boolean isNVinDA(NhanVien n) {
        for (NhanVien nhanvien : nv)
            if (nhanvien.getMaNV() == n.getMaNV())
                return false;
        return true;
    }
    
    public void chonNguoiQL() {
        System.out.println("======Danh sach nhan vien cua du an");
        hienThiNV();
        int maNV;
        boolean co = false;
        do {
            System.out.println("Ban chon ma nhan vien: ");
            maNV = Integer.parseInt(CauHinh.sc.nextLine());
            for (NhanVien nhanvien : nv)
                if (nhanvien.getMaNV() == maNV) {
                    this.nguoiQL = nhanvien;
                    co = true;
                }
            if (co == false)
                System.out.println("Khong co ma nguoi quan ly du an de chon");
            else
                System.out.println("Them nguoi quan ly du an thanh cong");
        } while (nguoiQL == null);
    }
    
    public void hienThiNV() {
        this.nv.forEach(s -> {
            if (nguoiQL == null)
                System.out.println(s);
            else
                if (nguoiQL.getMaNV() == s.getMaNV()) {
                    System.out.println("Nguoi chu nhiem du an: ");
                    System.out.println(s);
                }
                else
                    System.out.println(s);

        });
    }

    @Override
    public String toString() {
        return String.format("Ma du an: %d\nTen du an: %s\nThoi gian bat dau: %s\n"
                + "Thoi gian ket thuc: %s\nKinh phi dau tu: %d\n",
                this.getMaDuAn(), this.tenDuAn, CauHinh.f.format(this.getTgBatDau()),
                CauHinh.f.format(this.getTgKetThuc()), this.kinhPhiDauTu);
    }


    /**
     * @return the tenDuAn
     */
    public String getTenDuAn() {
        return tenDuAn;
    }

    /**
     * @param tenDuAn the tenDuAn to set
     */
    public void setTenDuAn(String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }

    /**
     * @return the tgBatDau
     */
    public Date getTgBatDau() {
        return tgBatDau;
    }

    /**
     * @param tgBatDau the tgBatDau to set
     */
    public void setTgBatDau(Date tgBatDau) {
        this.tgBatDau = tgBatDau;
    }

    /**
     * @return the tgKetThuc
     */
    public Date getTgKetThuc() {
        return tgKetThuc;
    }

    /**
     * @param tgKetThuc the tgKetThuc to set
     */
    public void setTgKetThuc(Date tgKetThuc) {
        this.tgKetThuc = tgKetThuc;
    }

    /**
     * @return the nv
     */
    public List<NhanVien> getNv() {
        return nv;
    }

    /**
     * @param nv the nv to set
     */
    public void setNv(List<NhanVien> nv) {
        this.nv = nv;
    }

    /**
     * @return the kinhPhiDauTu
     */
    public int getKinhPhiDauTu() {
        return kinhPhiDauTu;
    }

    /**
     * @param kinhPhiDauTu the kinhPhiDauTu to set
     */
    public void setKinhPhiDauTu(int kinhPhiDauTu) {
        this.kinhPhiDauTu = kinhPhiDauTu;
    }

    /**
     * @return the maDuAn
     */
    public int getMaDuAn() {
        return maDuAn;
    }

    /**
     * @param maDuAn the maDuAn to set
     */
    public void setMaDuAn(int maDuAn) {
        this.maDuAn = maDuAn;
    }

    /**
     * @return the nguoiQL
     */
    public NhanVien getNguoiQL() {
        return nguoiQL;
    }

    /**
     * @param nguoiQL the nguoiQL to set
     */
    public void setNguoiQL(NhanVien nguoiQL) {
        this.nguoiQL = nguoiQL;
    }

}
