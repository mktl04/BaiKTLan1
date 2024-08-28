/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bailam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author DELL
 */
public class QuanLyCD extends CD {
    ArrayList<CD> dsDia = new ArrayList<>();
    
    public void danhSach(ArrayList<CD> dsDia){
        dsDia = new ArrayList<>();
        dsDia.add(new CD("CD01","Noi buon gac tro","Quang Linh",195000,2018));
        dsDia.add(new CD("CD02","Bai tinh ca dem","Duc Tuan",185000,2021));
        dsDia.add(new CD("CD03","Cau ho chieu que","Nhieu ca si",172000,2022));
        dsDia.add(new CD("CD04","Tinh dau tinh cuoi","Van Khanh",139000,2022));
        dsDia.add(new CD("CD05","Thanh pho mua bay","Dan Nguyen",182000,2019));
    }
    public void xuatDanhSachCD() {
        double tongTriGia = 0;
        for (CD cd : dsDia) {
            System.out.println(cd.toString());
            tongTriGia += cd.getGiaBan();
        }
        System.out.println("Tong tri gia CD: " + tongTriGia);
    }

   
    public void cdTruocNam2020() {
        for (CD cd : dsDia) {
            if (cd.getNamPH() < 2020) {
                System.out.println(cd);
                System.out.println("---------------------------");
            }
        }
    }

   
    public void cdTenChuaTinh() {
        for (CD cd : dsDia) {
            if (cd.getTenCD().toLowerCase().contains("tinh")) {
                System.out.println(cd);
                System.out.println("---------------------------");
            }
        }
    }

   
     public void sapXepTheoGia() {
        Collections.sort(dsDia, new Comparator<CD>(){
            @Override
            public int compare(CD cd1, CD cd2) {
                return Double.compare(cd2.getGiaBan(), cd1.getGiaBan());
            }
        });
    }

   
    public boolean xoaCD(String maSoXoa) {
        return dsDia.removeIf(cd -> cd.getMaSo().equals(maSoXoa));
    }

   
    public boolean suaGiaCD(String maSoSua, double giaMoi) {
        for (CD cd : dsDia) {
            if (cd.getMaSo().equals(maSoSua)) {
                cd.setGiaBan(giaMoi);
                return true;
            }
        }
        return false;
    }

   
    public double tinhTongTriGia() {
        return dsDia.stream().mapToDouble(CD::getGiaBan).sum();
    }

}
