/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.mainn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Thanh
 */
public class QuanLyPhongBan {

    private List<PhongBan> pb = new ArrayList<>();

    public void timKiemNhanVienTheoPB() {
        System.out.println("Nhap vao phong ban ");
        String tenPb = CauHinh.sc.nextLine();
        boolean ktra = false;
//        QuanLyPhongBan ketQua = new QuanLyPhongBan();
        for (PhongBan phongBan : this.pb) {
            if(phongBan.getTenPhongBan().equals(tenPb)){
                phongBan.hienThiNv();
                ktra = true;
            }     
        }
        if (ktra) {
            System.out.println("Tim kiem nhan vien thanh cong");
        } else {
            System.out.println("Khong ton tai nhan vien can tim");
        }
    }

     public void hienThi() {
        pb.forEach(s -> {
            System.out.print(s);
            if (s.getNvql()!=null)
                System.out.print(s.getNvql());
            else {
                System.out.print("NVQL: null\n");
                System.out.println();
            }
        });
    }
     
    public void themPB(PhongBan... p){
        this.pb.addAll(Arrays.asList(p));
    }

    public List<PhongBan> timPhongBan(String tuKhoa) {
        return this.pb.stream().filter(s -> s.getTenPhongBan().contains(tuKhoa)== true).collect(Collectors.toList());
    }

    public PhongBan timPhongBanTheoTen(String tuKhoa) {
        for (PhongBan p : pb)
            if (p.getTenPhongBan().equals(tuKhoa))
                return p;
        return null;
//        return this.pb.stream().filter(s -> s.getTenPhongBan().equals(tuKhoa)== true).findFirst().get();
    }

    public void xoaPB(List<PhongBan> d) {
        for (PhongBan p : d) {
            this.pb.remove(p);
        }
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
