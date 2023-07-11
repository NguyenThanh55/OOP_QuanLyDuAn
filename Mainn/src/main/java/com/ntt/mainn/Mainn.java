/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ntt.mainn;

import java.net.CacheRequest;
import java.security.interfaces.DSAKey;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Thanh
 */
public class Mainn {

    public static void main(String[] args) throws ParseException {
        //Khoi tao cac lop quan ly
        QuanLyDuAn qlda = new QuanLyDuAn();
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        QuanLyPhongBan qlpb = new QuanLyPhongBan();
        
        //Khoi tao nhan vien
        NhanVien nv0 = new NhanVienThuong("Nguyen A", "Nu", "22/7/2012", "abc@gmail.com");
        NhanVien nv1 = new LapTrinhVien("Nguyen B", "Nu", "23/7/2012", "abc@gmail.com");
        NhanVien nv2 = new ThietKeVien("Nguyen C", "Nam", "01/02/2002", "abc@gmail.com");
        NhanVien nv3 = new KiemThuVien("Nguyen D", "Nam", "10/02/2002", "abc@gmail.com");
        NhanVien nv4 = new KiemThuVien("Nguyen A E", "Nu", "22/8/2012", "abc@gmail.com");
        NhanVien nv5 = new ThietKeVien("Nguyen E", "Nu", "5/7/2012", "abc@gmail.com");
        NhanVien nv6 = new LapTrinhVien("Nguyen F", "Nu", "30/7/2012", "abc@gmail.com");
        NhanVien nv7 = new KiemThuVien("Nguyen A G", "Nu", "22/5/2012", "abc@gmail.com");
        NhanVienQuanLy nv8 = new NhanVienQuanLy("Tran Thi My", "Nu", "12/02/2000","my123@gmail.com", "20/01/2022");
        NhanVienQuanLy nv9 = new NhanVienQuanLy("Phan Thi Nga", "nu", "01/01/2001","abc@gmail.com", "10/01/2023");
        //them nv vao lop quan ly
        qlnv.themNV(nv0, nv1, nv2, nv3, nv4, nv5, nv6, nv7, nv8, nv9);
        //Tao danh sach nv cho du an 
        List<NhanVien> ds = new ArrayList<>();
        ds.add(nv0);
        ds.add(nv1);
        ds.add(nv3);
        ds.add(nv5);
        ds.add(nv7);
        
        //Tao danh sach nv cho du an 1
        List<NhanVien> ds1 = new ArrayList<>();
        ds1.add(nv0);
        ds1.add(nv2);
        ds1.add(nv4);
        ds1.add(nv6);
        ds1.add(nv7);
        
        //Tao du an 
        DuAn da = new DuAn("Xay dung phan mem bao mat thong tin", "22/01/2023", "22/05/2023", 10, ds);
        //them du an cho nhan vien
        nv0.themDA(da);
        nv1.themDA(da);
        nv3.themDA(da);
        nv5.themDA(da);
        nv7.themDA(da);
        //tao du an 1
        DuAn da1 = new DuAn("Xay dung phan mem an toan va bao mat", "10/04/2023", "10/05/2023", 15, ds1);

//        DuAn da1 = new DuAn("Xay dung mo hinh giam sat hoc tap", "22/01/2023", "22/05/2023", 20, ds1);
        //them du an cho nhan vien 
        nv0.themDA(da1);
        nv2.themDA(da1);
        nv4.themDA(da1);
        nv6.themDA(da1);
        nv7.themDA(da1);
        //them du an vao lop quan ly
        qlda.themDuAn(da, da1);
        //Tao than nhan
        ThanNhan tn = new ThanNhan("Nguyen A Z", "Nam", "22/6/2010", "Cha");
        ThanNhan tn0 = new ThanNhan( "Nguyen A Y", "Nu", "22/6/2009", "Me");
        ThanNhan tn1 = new ThanNhan("Nguyen B Z", "Nam", "22/6/2010", "Cha");
        ThanNhan tn2 = new ThanNhan("Nguyen B Y", "Nu", "22/6/2009", "Me");
        //Them than nhan vao ds than nhan cua nhan vien 0
        nv0.themTN(tn);
        nv0.themTN(tn0);
        //Them than nhan vao ds than nhan cua nhan vien 1
        nv1.themTN(tn1);
        nv1.themTN(tn2);

        PhongBan p1 = new PhongBan("Phong IT");
        PhongBan p2 = new PhongBan("Phong thiet ke");
        PhongBan p3 = new PhongBan("Phong kiem thu");
        PhongBan p4 = new PhongBan("Phong thuong");
        p1.themNV(nv1);
        p1.themNV(nv6);
        p2.themNV(nv2);
        p2.themNV(nv5);
        p3.themNV(nv3);
        p3.themNV(nv4);
        p3.themNV(nv7);
        p4.themNV(nv0);
        qlpb.themPB(p1, p2, p3, p4);
        p1.themNVQL(nv8);
        nv8.themPB(p1);
        p2.themNVQL(nv9);
        nv9.themPB(p2);
//        System.out.println(nv0.getDs().size());
        String tenDuAn;
        int nhap;
        do {
            System.out.println("\n<------------Menu------------>");
            System.out.println("1.Them/xoa/sua du an");
            System.out.println("2.Tinh luong cho nhan vien");
            System.out.println("3.Xem danh sach nhan vien cua 1 du an");
            System.out.println("4.Xem danh sach du an/danh sach du an dang hoat dong cua 1 nhan vien");
            System.out.println("5.Tim kiem du an theo ten/theo thoi gian bat dau cua du an");
            System.out.println("6.Sap xep du an theo kinh phi dau tu");
            System.out.println("7.Tim kiem nhan vien theo ho ten/ngay sinh/phong ban/do tuoi");
            System.out.println("8.Xuat danh sach than nhan cua nhan vien theo ma nhan vien");
            System.out.println("9.Them/xoa/xem nhan vien cho du an");
            System.out.println("10.Them/xoa nguoi chu nhiem cho du an");
            System.out.println("11.Them/xoa phong ban");
            System.out.println("12.Them/xoa nguoi quan ly cho phong ban");
            System.out.println("13.Xem danh sach du an");
            System.out.println("14.Xem danh sach nhan vien");
            System.out.println("15.Xem danh sach phong ban");
            System.out.println("16.Xem danh sach phong ban cua 1 nhan vien quan ly");
            System.out.println("17.Them/Xoa nhan vien");
            System.out.println("18.Ban chon thoat");
            System.out.println("Chon phuong thuc: ");
            nhap = Integer.parseInt(CauHinh.sc.nextLine());
            switch (nhap) {
                case 1:
                    // Them/xoa/sua du an
                {
                    int chon;
                    do {
                        System.out.println("\n<------------Menu them/sua/xoa------------>");
                        System.out.println("1.Them du an");
                        System.out.println("2.Xoa du an");
                        System.out.println("3.Sua du an");
                        System.out.println("4.Xem ds du an");
                        System.out.println("5.Ban chon thoat");
                        System.out.println("Chon phuong thuc: ");
                        chon = Integer.parseInt(CauHinh.sc.nextLine());
                        switch (chon) {
                            case 1: {
                                DuAn damoi = new DuAn();
                                Date tgbd, tgkt;
                                String nbd, nkt, ten;
                                int ngay, thang, nam, dem = 0, dem1 = 0;
                                System.out.println("Nhap ten du an: ");
                                ten = CauHinh.sc.nextLine();
                                if (qlda.isDAinDSDA(ten)) {
                                    System.out.println("Thoi gian bat dau ");
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
                                    nbd = CauHinh.ktHopLe(ngay, thang, nam);
                                    tgbd = CauHinh.f.parse(nbd);
                                    System.out.println("Thoi gian ket thuc: ");
                                    do {
                                        if (dem1 > 0) {
                                            System.out.println("Ngay ban nhap da sai. Vui long nhap lai!!!");
                                        }
                                        System.out.println("Nhap ngay: ");
                                        ngay = Integer.parseInt(CauHinh.sc.nextLine());
                                        System.out.println("Nhap thang: ");
                                        thang = Integer.parseInt(CauHinh.sc.nextLine());
                                        System.out.println("Nhap nam: ");
                                        nam = Integer.parseInt(CauHinh.sc.nextLine());
                                        dem1++;
                                    } while (CauHinh.ktHopLe(ngay, thang, nam) == "");
                                    nkt = CauHinh.ktHopLe(ngay, thang, nam);
                                    tgkt = CauHinh.f.parse(nkt);
                                    System.out.println("Kinh phi dau tu: ");
                                    int kp = Integer.parseInt(CauHinh.sc.nextLine());

                                    System.out.println("===Danh sach nhan vien===");
                                    qlnv.hienThiDSNV();
                                    List<NhanVien> dsnv = new ArrayList<>();
                                    int manv;

                                    do {
                                        System.out.println("Nhap ma nhan vien bn muon them: ");
                                        manv = Integer.parseInt(CauHinh.sc.nextLine());
                                        if (qlnv.timKiemNhanVien(manv) != null) {
                                            if (dsnv.isEmpty()) {
                                                if (qlnv.timKiemNhanVien(manv).getDs().size() < 3) {
                                                    dsnv.add(qlnv.timKiemNhanVien(manv));
                                                }
                                                else
                                                    System.out.println("Nhan vien da tham gia du 3 du an");
                                            } else {
                                                boolean isExited = false;
                                                for (int i=0; i<dsnv.size();i++)
                                                    if (dsnv.get(i).getMaNV() == manv) {
                                                        isExited = true;
                                                        System.out.println("Nhan vien nay da duoc them");
                                                        break;
                                                    }
                                                if (!isExited) {
                                                    if (qlnv.timKiemNhanVien(manv).getDs().size() < 3) {
                                                        dsnv.add(qlnv.timKiemNhanVien(manv));
                                                    }
                                                    else
                                                        System.out.println("Nhan vien da tham gia du 3 du an");
                                                }
                                            }
                                        } else
                                            System.out.println("Nhan vien khong co trong danh sach");
                                    } while (dsnv.size() < 5);
                                    damoi = new DuAn(ten, tgbd, tgkt, kp, dsnv);
                                    for (int i = 0; i < dsnv.size(); i++) {
                                        qlnv.timKiemNhanVien(dsnv.get(i).getMaNV()).themDA(damoi);
                                    }
                                    qlda.themDuAn(damoi);
                                    System.out.println("Them du an thanh cong");
                                } else
                                    System.out.println("Ten du an da co trong danh sach!!!");
                                break;
                            }
                            case 2:
                                System.out.println("Nhap ten du an can xoa:");
                                tenDuAn = CauHinh.sc.nextLine();
                                if (qlda.timDuAnTheoTen(tenDuAn) != null) {
                                    qlda.xoaDuAn(qlda.timDuAnTheoTen(tenDuAn));
                                    System.out.println("Xoa du an thanh cong");
                                } else
                                    System.out.println("Khong co ten du an muon xoa");
                                break;
                            case 3:
                                qlda.suaDuAn();
                                break;
                            case 4:
                                qlda.hienThi();
                                break;
                            default:
                                System.out.print("Ban chon thoat");
                        }
                    } while (chon > 0 && chon < 5);
                    break;
                }
                case 2:
                    // Tinh luong cho nhan vien
                {
                    int chon2;
                    do {
                        System.out.println("\n<------------Menu tinh luong cho nhan vien------------>");
                        System.out.println("1.Nhan vien thuong");
                        System.out.println("2.Lap trinh vien");
                        System.out.println("3.Thiet ke vien");
                        System.out.println("4.Kiem thu vien");
                        System.out.println("5.Ban chon thoat");
                        System.out.println("Chon phuong thuc: ");
                        chon2 = Integer.parseInt(CauHinh.sc.nextLine());
                        switch (chon2) {
                            case 1: {
                                System.out.println("Nhap ten nhan vien ban muon tinh luong ");
                                String tennv = CauHinh.sc.nextLine();
                                NhanVien nhanVien = qlnv.timKiemNhanVien(tennv);
                                if (nhanVien != null) {
                                    if (nhanVien.getLoaiNhanVien() == "NhanVienThuong") {
                                        System.out.println(nhanVien);
                                        System.out.println(nhanVien.tinhLuong());
                                    } else
                                        System.err.println("Ten nhan vien khong co trong danh sach");
                                } else
                                    System.out.println("Khong co ten nhan vien trong danh sach");
                                break;
                            }
                            case 2:
                                System.out.println("Nhap ten nhan vien ban muon tinh luong ");
                                String tennv = CauHinh.sc.nextLine();
                                NhanVien nhanVien = qlnv.timKiemNhanVien(tennv);
                                if (nhanVien != null) {
                                    if (nhanVien.getLoaiNhanVien() == "LapTrinhVien") {
                                        System.out.println(nhanVien);
                                        System.out.println(nhanVien.tinhLuong());
                                    } else
                                        System.err.println("Ten nhan vien khong co trong danh sach");
                                } else
                                    System.out.println("Khong co ten nhan vien trong danh sach");
                                break;
                            case 3:
                                System.out.println("Nhap ten nhan vien ban muon tinh luong ");
                                String tennv1 = CauHinh.sc.nextLine();
//                                System.out.println(qlnv.timKiemNhanVien(tennv));
                                NhanVien nhanVien1 = qlnv.timKiemNhanVien(tennv1);
                                if (nhanVien1 != null) {
                                    if (nhanVien1.getLoaiNhanVien() == "ThietKeVien") {
                                        System.out.println(nhanVien1);
                                        System.out.println(nhanVien1.tinhLuong());
                                    } else
                                        System.err.println("Ten nhan vien khong co trong danh sach");
                                } else
                                    System.out.println("Khong co ten nhan vien trong danh sach");
                                break;
                            case 4:
                                System.out.println("Nhap ten nhan vien ban muon tinh luong ");
                                String tennv2 = CauHinh.sc.nextLine();
//                                System.out.println(qlnv.timKiemNhanVien(tennv));
                                NhanVien nhanVien2 = qlnv.timKiemNhanVien(tennv2);
                                if (nhanVien2 != null) {
                                    if (nhanVien2.getLoaiNhanVien() == "KiemThuVien") {
                                        System.out.println(nhanVien2);
                                        System.out.println(nhanVien2.tinhLuong());
                                    } else
                                        System.err.println("Ten nhan vien khong co trong danh sach");
                                } else
                                    System.out.println("Khong co nhan vien trong danh sach");
                                break;
                            default:
                                System.err.print("Ban chon thoat");
                        }
                    } while (chon2 > 0 && chon2 < 5);
                    break;
                }
                case 3:
                    // Xem danh sach nhan vien cua 1 du an
                {
                    System.out.println("Nhap ten du an ban muon xem danh sach nhan vien");
                    String tenDA = CauHinh.sc.nextLine();
                    DuAn duan = qlda.timDuAnTheoTen(tenDA);
                    if (duan != null) {
                        if (qlda.timDuAnTheoTen(tenDA).getNv().size() > 0)
                            qlda.timDuAnTheoTen(tenDA).hienThiNV();
                        else
                            System.out.println("Khong co nhan vien trong du an");
                    } else if (duan == null)
                        System.out.println("Ten du an khong co trong danh sach");
                    break;
                }
                case 4:
                    // Xem danh sach du an/danh sach du an dang hoat dong cua 1 nhan vien
                {
                    int chonds;
                    do {
                        System.out.println("\n<------------Menu xem danh sach------------>");
                        System.out.println("1.Xem danh sach du an cua 1 nhan vien");
                        System.out.println("2.Xem danh sach du an dang hoat dong cua 1 nhan vien");
                        System.out.println("3.Ban chon thoat");
                        System.out.println("Chon phuong thuc: ");
                        chonds = Integer.parseInt(CauHinh.sc.nextLine());
                        switch (chonds) {
                            case 1:
                                //Xem danh sach du an cua 1 nhan vien
                                System.out.println("Nhap ten nhan vien ban muon xem danh sach du an");
                                String tennv = CauHinh.sc.nextLine();
                                NhanVien nvTheoDuAn = qlnv.timKiemNhanVien(tennv);
                                if (nvTheoDuAn != null) {
                                    if (qlnv.timKiemNhanVien(tennv).getDs().size() > 0)
                                        qlnv.timKiemNhanVien(tennv).hienthiDSDA();
                                    else
                                        System.out.println("Khong co du an trong nhan vien");
                                } else if (nvTheoDuAn == null)
                                    System.out.println("Ten nhan vien khong co trong danh sach");
                                break;
                            case 2:
                                //Xem danh sach du an dang hoat dong cua 1 nhan vien
//                                System.out.println("Nhap ten nhan vien ban muon xem danh sach du an dang hoat dong");
//                                String tennv1 = CauHinh.sc.nextLine();
//                                NhanVien nvTheoDuAn1 = qlnv.timKiemNhanVien(tennv1);
//                                if (nvTheoDuAn1 != null)
//                                {
//                                    if (qlnv.timKiemNhanVien(tennv1).getDs().size() > 0)
//                                        qlnv.timKiemNhanVien(tennv1);
//                                    else
//                                        System.out.println("Khong co du an trong nhan vien");
//                                } else if (nvTheoDuAn1 == null)
//                                    System.out.println("Ten nhan vien khong co trong danh sach");
                                qlnv.xemDACuaMotNVDangThucHien();
                                break;
                        }
                    } while (chonds > 0 && chonds < 3);
                    break;
                }
                case 5:
                    // Tim kiem du an theo ten/thoi gian bat dau
                {
                    int chontk;
                    do {
                        System.out.println("\n<------------Menu tim kiem du an------------>");
                        System.out.println("1.Tim du an theo ten");
                        System.out.println("2.Tim du an theo thoi gian bat dau");
                        System.out.println("3.Ban chon thoat");
                        System.out.println("Chon phuong thuc: ");
                        chontk = Integer.parseInt(CauHinh.sc.nextLine());
                        switch (chontk) {
                            case 1:
//                              //Tim kiem du an theo ten
                                System.out.println("Nhap ten du an can tim:");
                                String t = CauHinh.sc.nextLine();
                                if (qlda.timDuAn(t).size() > 0)
                                    qlda.timDuAn(t).forEach(s -> System.out.println(s));
                                else
                                    System.out.println("Ten du an khong co");
                                break;
                            case 2:
                                //Tim kiem du an theo thoi gian bat dau
                                System.out.println("Thoi gian bat dau ");
                                Date ngaybd;
                                String ng;
                                int ngay, thang, nam, dem = 0, dem1 = 0;
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
                                ng = CauHinh.ktHopLe(ngay, thang, nam);
                                ngaybd = CauHinh.f.parse(ng);
                                if (qlda.timDuAn(ngaybd).size() > 0)
                                    qlda.timDuAn(ngaybd).forEach(s -> System.out.println(s));
                                else
                                    System.out.println("Khong co du an bat dau vao ngay nay!!!");
                                break;
                            default:
                                System.out.println("Ban chon thoat tim kiem!!!");
                        }
                    } while (chontk > 0 && chontk < 3);

                    break;
                }
                case 6:
                    // Sap xep du an theo kinh phi dau tu
                {
                    int chonsx;
                    do {
                        System.out.println("\n<------------Menu chon sap xep theo kinh phi dau tu------------>");
                        System.out.println("1.Sap xep kinh phi dau tu tang dan");
                        System.out.println("2.Sap xep kinh phi dau tu giam dan");
                        System.out.println("3.Ban chon thoat");
                        System.out.println("Chon phuong thuc: ");
                        chonsx = Integer.parseInt(CauHinh.sc.nextLine());
                        switch (chonsx) {
                            case 1:
                                //Sap xep du an theo kinh phi dau tu tang dan
                                System.out.println("Sau khi sap xep: ");
                                qlda.sapXepTang();
                                qlda.hienThi();
                                break;
                            case 2:
                                //Sap xep du an theo kinh phi dau tu giam dan
                                System.out.println("Sau khi sap xep: ");
                                qlda.sapXepGiam();
                                qlda.hienThi();
                                break;
                            default:
                                System.out.println("Ban chon thoat!!!");
                        }
                    } while (chonsx > 0 && chonsx < 3);
                    break;
                }
                case 7:
                    // Tim kiem nhan vien theo ho ten/ngay sinh/phong ban/do tuoi
                {
                    int chontknv;
                    do {
                        System.out.println("\n<------------Menu chon tim kiem nhan vien------------>");
                        System.out.println("1.Tim kiem nhan vien theo ho ten");
                        System.out.println("2.Tim kiem nhan vien theo ngay sinh");
                        System.out.println("3.Tim kiem nhan vien theo phong ban");
                        System.out.println("4.Tim kiem nhan vien theo do tuoi");
                        System.out.println("5.Ban chon thoat");
                        System.out.println("Chon phuong thuc: ");
                        chontknv = Integer.parseInt(CauHinh.sc.nextLine());
                        switch (chontknv) {
                            case 1:
                                // Tim kiem nhan vien theo ho ten
                                System.out.println("Nhap ten nhan vien ban muon tim:");
                                String tennv1 = CauHinh.sc.nextLine();
                                NhanVien nhanVien = qlnv.timKiemNhanVien(tennv1);
                                if (nhanVien != null) {
                                    System.out.println(nhanVien);
                                } else
                                    System.out.println("Khong co ten nhan vien trong danh sach");
                                break;
                            case 2:
                                // Tim kiem nhan vien theo ngay sinh
                                System.out.println("Nhap ngay sinh theo dinh dang dd/MM/yy:");
                                String date = CauHinh.sc.nextLine();
                                qlnv.timKiemNhanVienTheoNgaySinh(date);
                                break;
                            case 3:
                                // Tim kiem nhan vien theo phong ban
                                qlpb.timKiemNhanVienTheoPB();
                                break;
                            case 4:
                                // Tim kiem nhan vien theo do tuoi
                                qlnv.timKiemNhanVienTheoTuoi();
                                break;
                            default:
                                System.out.println("Ban chon thoat!!!");
                        }
                    } while (chontknv > 0 && chontknv < 5);
                    break;
                }
                case 8:
                    // Xuat danh sach than nhan cua nhan vien theo ma nhan vien
                {
                    System.out.println("Nhap ma nhan vien ban muon xem danh sach than nhan");
                    int manv = Integer.parseInt(CauHinh.sc.nextLine());
                    if (qlnv.timKiemNhanVien(manv) != null) {
                        System.out.println(qlnv.timKiemNhanVien(manv));
                        qlnv.timKiemNhanVien(manv).hienThiTN();
                    }
                    else
                        System.out.println("Khong co ma nhan vien nay!!!");
                    break;
                }
                case 9:
                    // Them/xoa/xem nhan vien cho du an
                {
                    int chon;
                    do {
                        System.out.println("\n<------------Menu them/xoa nhan vien cua du an------------>");
                        System.out.println("1.Them nhan vien");
                        System.out.println("2.Xoa nhan vien");
                        System.out.println("3.Xem ds du an");
                        System.out.println("4.Ban chon thoat");
                        System.out.println("Chon phuong thuc: ");
                        chon = Integer.parseInt(CauHinh.sc.nextLine());
                        switch (chon) {
                            case 1:
                                //Them nhan vien
                            {
                                int chontt;
                                do {
                                    System.out.println("Nhap ten du an ban muon them nhan vien:");
                                    String tendatk = CauHinh.sc.nextLine();
                                    DuAn duantk = qlda.timDuAnTheoTen(tendatk);
                                    if (duantk != null) {
                                        System.out.println("Nhap ten nhan vien ban muon them:");
                                        String tennv1 = CauHinh.sc.nextLine();
                                        NhanVien nhanVien = qlnv.timKiemNhanVien(tennv1);
                                        if (nhanVien != null) {
                                            if (duantk.isNVinDA(nhanVien)) {
                                                duantk.themNV(nhanVien);
                                                System.out.println("Them thanh cong");
                                            } else
                                                System.out.println("Nhan vien da co trong du an");
                                        } else
                                            System.out.println("Khong co ten nhan vien trong danh sach");
                                    } else
                                        System.out.println("Khong co du an trong danh sach");
                                    System.out.println("Ban co muon tiep tuc them nhan vien vao du an khong?\n 1.Co\n2.Khong");
                                    chontt = Integer.parseInt(CauHinh.sc.nextLine());
                                } while (chontt == 1);
                                break;
                            }
                            case 2:
                                //xoa nhan vien
                            {
                                System.out.println("Nhap ten du an ban muon xoa nhan vien:");
                                String tendatk = CauHinh.sc.nextLine();
                                DuAn duantk = qlda.timDuAnTheoTen(tendatk);
                                if (duantk != null) {
                                    System.out.println("Nhap ten nhan vien ban muon xoa:");
                                    String tennv1 = CauHinh.sc.nextLine();
                                    NhanVien nhanVien = qlnv.timKiemNhanVien(tennv1);
                                    if (nhanVien != null) {
                                        if (duantk.isNVinDA(nhanVien)==false) {
                                            duantk.xoaNV(nhanVien);
                                            System.out.println("Xoa thanh cong");
                                        } else
                                            System.out.println("Nhan vien khong co trong du an");
                                    } else
                                        System.out.println("Khong co ten nhan vien trong danh sach");
                                } else
                                    System.out.println("Khong co du an trong danh sach");
                            }
                                break;
                            case 3:
                                qlda.hienThi();
                                break;
                            default:
                                break;
                        }
                        } while (chon > 0 && chon < 4);
                    break;
                }
                case 10:
                    // Them/xoa nguoi chu nhiem cho du an
                {
                    int chon;
                    do {
                        System.out.println("\n<------------Menu them/xoa nguoi chu nhiem cua du an------------>");
                        System.out.println("1.Them nguoi chu nhiem");
                        System.out.println("2.Xoa nguoi chu nhiem");
                        System.out.println("3.Xem nguoi chu nhiem cua du an");
                        System.out.println("4.Ban chon thoat");
                        System.out.println("Chon phuong thuc: ");
                        chon = Integer.parseInt(CauHinh.sc.nextLine());
                        switch (chon) {
                            case 1: {
                                System.out.println("=====Danh sach du an=====");
                                qlda.hienThi();
                                System.out.println("Nhap ten du an ma ban muon chon nguoi chu nhiem");
                                String tenDA = CauHinh.sc.nextLine();
                                if (qlda.timDuAnTheoTen(tenDA) != null)
                                    if (qlda.timDuAnTheoTen(tenDA).getNguoiQL() == null)
                                        qlda.timDuAnTheoTen(tenDA).chonNguoiQL();
                                    else
                                        System.out.println("Du an nay da co nguoi chu nhiem");
                                else
                                    System.out.println("Ten du an ban nhap khong co!!!");
                                break;
                            }
                            case 2:
                                System.out.println("=====Danh sach du an=====");
                                qlda.hienThi();
                                System.out.println("Nhap ten du an ma ban muon xoa nguoi chu nhiem");
                                String tenDACanXoa = CauHinh.sc.nextLine();
                                if (qlda.timDuAnTheoTen(tenDACanXoa) != null) {
                                    if (qlda.timDuAnTheoTen(tenDACanXoa).getNguoiQL() != null) {
                                        qlda.timDuAnTheoTen(tenDACanXoa).xoaNgQL();
                                        System.out.println("Xoa thanh cong");
                                    }
                                    else
                                        System.out.println("Du an khong co nguoi chu nhiem de xoa");
                                }
                                else
                                    System.out.println("Ten du an ban nhap khong co!!!");
                                break;
                            case 3:
                                System.out.println("=====Danh sach du an=====");
                                qlda.hienThi();
                                break;
                            default:
                                break;
                        }
                    } while (chon > 0 && chon < 4);
                    break;
                }
                case 11:
                    //Them/xoa phong ban
                {
                    int chon;
                    do {
                        System.out.println("\n<------------Menu them/xoa phong ban------------>");
                        System.out.println("1.Them phong ban");
                        System.out.println("2.Xoa phong ban");
                        System.out.println("3.Xem ds phong ban");
                        System.out.println("4.Ban chon thoat");
                        System.out.println("Chon phuong thuc: ");
                        chon = Integer.parseInt(CauHinh.sc.nextLine());
                        switch (chon) {
                            case 1:
                                //Them phong ban
                            {
                                System.out.println("Nhap ten phong ban: ");
                                String tenPB = CauHinh.sc.nextLine();
                                PhongBan pb = new PhongBan(tenPB);
                                qlpb.themPB(pb);
                                break;
                            }
                            case 2:
                                //Xoa phong ban
                                System.out.println("Nhap ten phong ban can xoa:");
                                String tenPB = CauHinh.sc.nextLine();
                                if (qlpb.timPhongBan(tenPB).size() > 0) {
                                    qlpb.xoaPB(qlpb.timPhongBan(tenPB));
                                    System.out.println("Xoa phong ban thanh cong");
                                } else
                                    System.out.println("Khong co ten phong ban muon xoa");
                                break;
                            case 3:
                                qlpb.hienThi();
                                break;
                            default:
                                System.out.print("Ban chon thoat");
                        }
                    } while (chon > 0 && chon < 4);
                    break;
                }
                case 12:
                    //Them/xoa nguoi quan ly cho phong ban
                {
                    int chon;
                    do {
                        System.out.println("\n<------------Menu them/xoa phong ban------------>");
                        System.out.println("1.Them nguoi quan ly cho phong ban");
                        System.out.println("2.Xoa nguoi quan ly cho phong ban");
                        System.out.println("3.Xem ds phong ban");
                        System.out.println("4.Ban chon thoat");
                        System.out.println("Chon phuong thuc: ");
                        chon = Integer.parseInt(CauHinh.sc.nextLine());
                        switch (chon) {
                            case 1: {
                                System.out.println("Nhap ten nhan vien quan ly: ");
                                String tennv = CauHinh.sc.nextLine();
                                if (qlnv.hienThiDSNVQL(tennv) != null) {
                                    System.out.println("Nhap ten phong ban ban muon them quan ly: ");
                                    String tenpb = CauHinh.sc.nextLine();
                                    if (qlpb.timPhongBanTheoTen(tenpb) != null) {
                                        if (qlpb.timPhongBanTheoTen(tenpb).getNvql() == null) {
                                            if (((NhanVienQuanLy) qlnv.hienThiDSNVQL(tennv)).getPb().size() < 2) {
                                                qlpb.timPhongBanTheoTen(tenpb).themNVQL((NhanVienQuanLy) qlnv.hienThiDSNVQL(tennv));
                                                System.out.println("Them nguoi quan ly thanh cong");
                                            }
                                            else
                                                System.out.println("Nhan vien nay da quan ly du 2 phong ban");
                                        }
                                        else
                                            System.out.println("Phong nay da co nguoi quan ly");
                                    }
                                    else
                                        System.out.println("Khong co phong ban ban can!!!");
                                } else
                                    System.out.println("Khong ten nhan vien quan ly ban muon!!!");
                                break;
                            }
                            case 2:
                                System.out.println("Nhap ten phong ban ban muon them quan ly: ");
                                String tenpb = CauHinh.sc.nextLine();
                                if (qlpb.timPhongBanTheoTen(tenpb) != null)
                                    qlpb.timPhongBanTheoTen(tenpb).xoaNVQL();
                                else
                                    System.out.println("Khong co ten phong ban muon xoa nguoi quan ly");
                                break;
                            case 3:
                                qlpb.hienThi();
                                break;
                        }
                    } while (chon > 0 && chon < 4);
                    break;
                }
                case 13:
                    // Xem danh sach du an
                {
                    System.out.println("=====Danh sach du an=====");
                    qlda.hienThi();
                    break;
                }
                case 14:
                    // Xem danh sach nhan vien
                {
                    System.out.println("=====Danh sach nhan vien=====");
                    qlnv.hienThiDSNV();
                    break;
                }
                case 15:
                    // Xem danh sach phong ban
                {
                    System.out.println("=====Danh sach phong ban=====");
                    qlpb.hienThi();
                    break;
                }
                case 16:
                    // Xem danh sach phong ban cua 1 nhan vien quan ly
                {
                    System.out.println("Nhap ten nhan vien quan ly: ");
                    String ten = CauHinh.sc.nextLine();
                    if (qlnv.hienThiDSNVQL(ten) != null) {
                        System.out.println("Danh sach phong ban cua nhan vien");
                        ((NhanVienQuanLy) qlnv.hienThiDSNVQL(ten)).hienthiDSPB();
                    } else
                        System.out.println("Khong co ten nhan vien quan ly ban muon!!!");
                    break;
                }
                case 17:
                    //them/xoa nhan vien
                {
                    int chon;
                    do {
                        System.out.println("\n<------------Menu them/xoa nhan vien------------>");
                        System.out.println("1.Them nhan vien");
                        System.out.println("2.Xoa nhan vien");
                        System.out.println("3.Xem ds nhan vien");
                        System.out.println("4.Ban chon thoat");
                        System.out.println("Chon phuong thuc: ");
                        chon = Integer.parseInt(CauHinh.sc.nextLine());
                        switch (chon) {
                            case 1:
                                //Them nhan vien
                            {
                                qlnv.nhapNVMoi();
                                break;
                            }
                            case 2:
                                //Xoa nhan vien
                            {
                                System.out.println("Nhap ten nhan vien can xoa:");
                                String tenPB = CauHinh.sc.nextLine();
                                if (qlnv.timKiemNhanVien(tenPB) != null) {
                                    qlnv.xoaNV(qlnv.timKiemNhanVien(tenPB));
                                    System.out.println("Xoa nhan vien thanh cong");
                                } else
                                    System.out.println("Khong co ten nhan vien muon xoa");
                                break;
                            }
                            case 3:
                                qlnv.hienThiDSNV();
                                break;
                            default:
                                System.out.print("Ban chon thoat");
                        }
                    } while (chon > 0 && chon < 4);
                    break;
                }
                case 18:
                    // Ban chon thoat
                    System.out.println("Ban chon thoat chuong trinh");
                    return;
                default:
                    throw new AssertionError();
            }

        } while (nhap > 0 && nhap < 18);
    }

}
