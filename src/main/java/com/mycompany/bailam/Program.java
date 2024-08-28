/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bailam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Program {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        menu();
    }
    public static void menu(){
        QuanLyCD qlcd = new QuanLyCD();
        Scanner sc = new Scanner(System.in);
        int Chon;
        do{
            System.out.println("1.Xuat toan bo CD va tong gia tri.");
            System.out.println("2.Lay cac CD phat hanh truoc nam 2020.");
            System.out.println("3.Tim cac CD co chu Tinh.");
            System.out.println("4.Xap sep CD theo gia giam dan.");
            System.out.println("5.Xoa CD theo ma so.");
            System.out.println("6.Sua gia ban cua CD.");
            System.out.println("7.Tinh tong gia tri.");
            Chon = sc.nextInt();
            sc.nextLine();
            switch (Chon){
                case 1:
                    qlcd.xuatDanhSachCD();
                    break;
                case 2:
                    qlcd.cdTruocNam2020();
                    break;
                case 3:
                    qlcd.cdTenChuaTinh();
                    break;
                case 4:
                    qlcd.sapXepTheoGia();
                    qlcd.xuatDanhSachCD();
                    break;
                case 5:
                    System.out.print("Nhap ma so CD can xoa: ");
                    String maSoXoa = sc.nextLine();
                    if (qlcd.xoaCD(maSoXoa)) {
                        System.out.println("Xoa CD thanh cong.");
                    } else {
                        System.out.println("Khong tim thay CD voi ma so " + maSoXoa);
                    }
                    break;
                case 6:
                    System.out.print("Nhap ma so CD muon sua: ");
                    String maSoSua = sc.nextLine();
                    System.out.print("Nhap gia ban moi: ");
                    double giaMoi = sc.nextDouble();
                    if (qlcd.suaGiaCD(maSoSua, giaMoi)) {
                        System.out.println("Sua gia  thanh cong.");
                    } else {
                        System.out.println("Khong tim thay CD voi ma so " + maSoSua);
                    }
                    break;
                case 7:
                    System.out.println("Tong tri gia cac CD: " + qlcd.tinhTongTriGia());
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai.");
                    break;
            }
            System.out.println();
        } while (Chon!= 0);

        sc.close();
    }
}
