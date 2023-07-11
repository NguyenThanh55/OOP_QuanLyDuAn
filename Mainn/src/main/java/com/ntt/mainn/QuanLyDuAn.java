/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.mainn;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;

/**
 *
 * @author Thanh
 */
public class QuanLyDuAn {
    private List<DuAn> ds = new ArrayList<>();

    public void themDuAn(DuAn... d) {
        this.ds.addAll(Arrays.asList(d));
    }
    
    public void themDuAn(DuAn da) throws ParseException {
        this.ds.add(da);
    }

    public void xoaDuAn(DuAn d) {
        for (int i=0; i<ds.size();i++) {
            if (ds.get(i).getTenDuAn().equals(d.getTenDuAn()))
                this.ds.remove(ds.get(i));
        }
    }

    public void suaDuAn() throws ParseException {
        System.out.println("Nhap ten du an");
        String tenDA = CauHinh.sc.nextLine();
        boolean KiemTra = false;
        for (DuAn da : this.ds) {
            if (da.getTenDuAn().equals(tenDA)) {
                KiemTra = true;
                System.out.println("Nhap lai ten du an");
                String ten = CauHinh.sc.nextLine();
                da.setTenDuAn(ten);

                System.out.println("Nhap lai ngay bat dau");
                Date tgbd = CauHinh.f.parse(CauHinh.sc.nextLine());
                da.setTgBatDau(tgbd);

                System.out.println("Nhap lai ngay ket thuc");
                Date tgkt = CauHinh.f.parse(CauHinh.sc.nextLine());
                da.setTgKetThuc(tgkt);

                System.out.println("Nhap lai kinh phi");
                int kp = Integer.parseInt(CauHinh.sc.nextLine());
                da.setKinhPhiDauTu(kp);
                break;
            }
        }
        if (KiemTra) {
            this.hienThi();
            System.out.println("Sua thanh cong");
        } else {
            System.out.println("Khong ton tai du an can sua");

        }
    }
    
    public DuAn timDuAnTheoTen(String tuKhoa) {
        for (DuAn d : ds)
            if (d.getTenDuAn().equals(tuKhoa) == true)
                return d;
        return null;
    }
      
    public List<DuAn> timDuAn(String tuKhoa) {
        return this.ds.stream().filter(s -> s.getTenDuAn().contains(tuKhoa)
                == true).collect(Collectors.toList());
    }
    
    public List<DuAn> timDuAn(Date tuKhoa) throws ParseException {
        return this.ds.stream().filter(s -> s.getTgBatDau().equals(tuKhoa)).collect(Collectors.toList());
    }
    
    public boolean isDAinDSDA(String ten) {
            for (DuAn duan : ds) {
                if (duan.getTenDuAn().equals(ten)) {
                    return false;
                }
            }
        return true;
    }
    
    public void sapXepTang() {
        this.ds.sort((s1, s2) -> {
            int kp1 = s1.getKinhPhiDauTu();
            int kp2 = s2.getKinhPhiDauTu();
            return kp1 > kp2 ? 1 : (kp1 < kp2 ? -1 : 0);
        });
    }
    
    public void sapXepGiam() {
        this.ds.sort((s1, s2) -> {
            int kp1 = s1.getKinhPhiDauTu();
            int kp2 = s2.getKinhPhiDauTu();
            return -(kp1 > kp2 ? 1 : (kp1 < kp2 ? -1 : 0));
        });
    }
        
    public void hienThi() {
        ds.forEach(s -> {
            System.out.print(s);
            System.out.println("=====Danh sach nhan vien cua du an=====");
            s.hienThiNV();
            System.out.println();
        });
    }

    /**
     * @return the ds
     */
    public List<DuAn> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<DuAn> ds) {
        this.ds = ds;
    }

}
