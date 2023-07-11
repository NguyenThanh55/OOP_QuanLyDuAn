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
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author Thanh
 */
public class QuanLyNhanVien {

    private List<NhanVien> nv = new ArrayList<>();
    
    public void themNV(NhanVien... n) {
        this.nv.addAll(Arrays.asList(n));
    }
     
    public void themNV(NhanVien n) {
        this.nv.add(n);
    } 

    public void xoaNV(NhanVien n) {
        nv.remove(n);
    }

    public void nhapNVMoi() throws ParseException{
        System.out.println("Nhap ten nhan vien moi: ");
        String hoTen = CauHinh.sc.nextLine();
        System.out.println("Gioi tinh: ");
        String gioiTinh = CauHinh.sc.nextLine();
        System.out.println("Ngay sinh");
        Date ngaySinh;
        String nSinh;
        int ngay, thang, nam, dem = 0;
        do {
            if (dem > 0) {
                System.out.println("Ngay ban nhap da sai. Vui long nhap lai!!!");
            }
            System.out.println("Nhap ngay: ");
            ngay = Integer.parseInt(CauHinh.sc.nextLine());
            System.out.println("Nhap thang: ");
            thang = Integer.parseInt(CauHinh.sc.nextLine());
            System.out.println("Nhap nam: ");
            nam = Integer.parseInt(CauHinh.sc.nextLine());
            dem++;
        } while (CauHinh.ktHopLe(ngay, thang, nam) == "");
        nSinh = CauHinh.ktHopLe(ngay, thang, nam);
        ngaySinh = CauHinh.f.parse(nSinh);
        System.out.println("Email: ");
        String email = CauHinh.sc.nextLine();
        nv.add(new NhanVienThuong(hoTen, gioiTinh, ngaySinh, email));
    }
    
    public NhanVien timKiemNhanVien(int ma) {
        for (NhanVien n : nv) 
            if (n.getMaNV() == ma)
                return n;
        return null;
    }
    
    public NhanVien timKiemNhanVien(String ten) {
        for (NhanVien n : nv) 
            if (n.getHoTen().equals(ten)==true)
                return n;
        return null;
    }
    
    public List<NhanVien> timKiemNhanVienTheoLoai(String loai) {
        return this.nv.stream().filter(s -> {
            Class c;
            try {
                String chuoi = "com.yen.mainn." + loai;
                c = Class.forName(chuoi);
                return c.isInstance(s);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            return false;
        }).collect(Collectors.toList());
    }

    public NhanVien hienThiDSNVQL(String ten) {
        List<NhanVien> dsnvql = timKiemNhanVienTheoLoai("NhanVienQuanLy");
        for (NhanVien n:dsnvql) {
            if (n.getHoTen().equals(ten))
                return n;
        }
        return null;
    }

    public void timKiemNhanVienTheoTuoi() {
        int min = 0, max = 0, tuoi, s;
        do {
            System.out.println("Ban muon tim theo tuoi hay do tuoi");
            System.out.println("1:Theo tuoi  \n2:Theo do tuoi \nSo bat ki:Thoat");
            s = Integer.parseInt(CauHinh.sc.nextLine());
            if (s == 1 || s == 2) {
                int dem = 0;
                QuanLyNhanVien ketqua = new QuanLyNhanVien();
                if (s == 1) {
                    System.out.println("Nhap tuoi ban muon tim");
                    min = Integer.parseInt(CauHinh.sc.nextLine());
                    max = min;
                } else if (s == 2) {
                    do {
                        if (dem > 0) {
                            System.out.println("Nhap sai nhap lai");
                        }
                        System.out.print("Nhap bien do tuoi nho:");
                        min = Integer.parseInt(CauHinh.sc.nextLine());
                        System.out.print("\nNhap bien do tuoi lon:");
                        max = Integer.parseInt(CauHinh.sc.nextLine());
                        dem++;
                    } while (min > max);
                }
                for (NhanVien nhanVien : nv) {
                    if (nhanVien.tinhTuoi() >= min && nhanVien.tinhTuoi() <= max) {
                        ketqua.nv.add(nhanVien);
                    }
                }
                if (!ketqua.nv.isEmpty()) {
                    ketqua.hienThiDSNV();
                } else {
                    System.out.println("\nKhong tim thay nhan vien o do tuoi nay\n");
                }
            }
        } while (s == 1 || s == 2);
    }
    
//    public void timKiemNhanVienTheoTuoi() {
//        int min = 0, max = 0, tuoi, s;
//            System.out.println("Ban muon tim theo tuoi hay do tuoi");
//            System.out.println("1:Theo tuoi  \n2:Theo do tuoi");
//            s = Integer.parseInt(CauHinh.sc.nextLine());
//            Boolean ktra = false;
//            int dem = 0;
//            QuanLyNhanVien ketqua = new QuanLyNhanVien();
//            if (s == 1) {
//                System.out.println("Nhap tuoi ban muon tim");
//                min = Integer.parseInt(CauHinh.sc.nextLine());
//                max = min;
//            } else if(s==2){
//                do {
//                    if (dem > 0) {
//                        System.out.println("Nhap sai nhap lai");
//                    }
//                    System.out.print("Nhap bien do tuoi nho:");
//                    min = Integer.parseInt(CauHinh.sc.nextLine());
//                    System.out.print("\nNhap bien do tuoi lon:");
//                    max = Integer.parseInt(CauHinh.sc.nextLine());
//                    dem++;
//
//                } while (min > max);
//            }
//            for (NhanVien nhanVien : nv) {
//                if (nhanVien.tinhTuoi() >= min && nhanVien.tinhTuoi() <= max) {
//                    ketqua.nv.add(nhanVien);
//                    ktra = true;
//                }
//            }
//            if (ktra) {
//                ketqua.hienThiDSNV();
//                System.out.println("Tim thanh cong");
//            } else {
//                System.out.println("Khong tim thay nhan vien o do tuoi nay");
//            }
//    }
    
    public void hienThiDSNV() {
        nv.forEach(s -> {
            System.out.println(s);

            if (!s.getDs().isEmpty()) {
                System.out.println("=====Danh sach du an=====");
                s.hienthiDSDA();
            }
            if (!s.getTn().isEmpty()) {
                System.out.println("=====Danh sach than nhan=====");
                s.hienThiTN();
            }
            System.out.println("--------------------------------------------");
        });
    }

//    public void xuatTn() {
//        System.out.println("Nhap ma nhan vien");
//        int maNV = CauHinh.sc.nextInt();
//        boolean ktra = false;
//        for (NhanVien nhanVien : this.nv) {
//            if (nhanVien.getMaNV() == (maNV)) {
//                nhanVien.hienThiTN();
//                ktra = true;
//                break;
//            }
//        }
//        if (ktra) {
//                System.out.println("Xuat than nhan thanh cong");
//            } else {
//                System.out.println("Khong co ma nhan vien hop le");
//            }
//
//    }
//
//    public void hienThiDSTN(int maNhanVien) {
//        System.out.printf("Ma nhan vien: %d\n",maNhanVien);
//        for (NhanVien nv : this.nv) {
//            if (nv.getMaNV() == maNhanVien) {
//                nv.hienThiTN();
//            }
//        }
//    }
//
    public void timKiemNhanVienTheoNgaySinh(String date) {
        CauHinh.f.setLenient(false);
        boolean ktra = true;
        while (ktra) {
            try {
                CauHinh.f.parse(date);
                QuanLyNhanVien ketQua = new QuanLyNhanVien();
                for (NhanVien nhanVien : this.nv) {
                    if (CauHinh.f.format(nhanVien.getNgaySinh()).equals(date)) {
                        ketQua.nv.add(nhanVien);
                    }
                }
                ketQua.hienThiDSNV();
                ktra=false;
            } catch (ParseException ex) {
                System.out.println("Nhap sai nhap lai");
                date = CauHinh.sc.nextLine();
            }
        }
    }

    public void xemDACuaMotNVDangThucHien() {
        System.out.print("Nhap ma nhan vien");
        int maNV = Integer.parseInt(CauHinh.sc.nextLine());
        for (NhanVien nhanVien : this.nv) {
            if (nhanVien.getMaNV() == maNV) {
                for (DuAn duAn : nhanVien.getDs()) {
                    // Múi giờ mặc định của hệ thống
                    ZoneId zoneId = ZoneId.systemDefault();
                    // Chuyển ngày bắt đầu từ date sang localdate
                    Instant instant = duAn.getTgBatDau().toInstant();
                    LocalDate tgBatDau = instant.atZone(zoneId).toLocalDate();
                    // Chuyển ngày bắt đầu từ date sang localdate
                    instant = duAn.getTgKetThuc().toInstant();
                    LocalDate tgKetThuc = instant.atZone(zoneId).toLocalDate();
                    //Lấy ngày hiện tại
                    LocalDate ngayHienTai = LocalDate.now();

                    if (ngayHienTai.isAfter(tgBatDau) &&ngayHienTai.isBefore(tgKetThuc)) {
                        System.out.println(duAn);
                    }
                }
                return;
            }

        }
        System.out.print("Khong tim thay");
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

}
