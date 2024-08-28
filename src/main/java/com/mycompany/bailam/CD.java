/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bailam;

/**
 *
 * @author DELL
 */
public class CD {
    private String maso;
    private String tenCD;
    private String casi;
    private double giaban;
    private int namphathanh;
    
    public CD (){
        
    }
    public CD (String maso, String tenCD, String casi, double giaban, int namphathanh){
        this.maso = maso;
        this.tenCD = tenCD;
        this.casi = casi;
        this.giaban = giaban;
        this.namphathanh = namphathanh;
    }
    public String getMaSo(){
        return maso;
    }
    public String getTenCD(){
        return tenCD;
    }
    public String getTenCaSi(){
        return casi;
    }
    public double getGiaBan(){
        return giaban;
    }
    public int getNamPH(){
        return namphathanh;
    }
    public void setMaSo(String maso){
        this.maso = maso;
    }
    public void setTenCD(String tenCD){
        this.tenCD = tenCD;
    }
    public void setTenCaSi(String casi){
        this.casi = casi;
    }
    public void setGiaBan(double giaban){
        this.giaban = giaban;
    }
    public void setNamPH(int namphathanh){
        this.namphathanh = namphathanh;
    }
    @Override
    public String toString(){
        return "Ma so: " + maso + ", ten CD: " + tenCD + ", ca si: " + casi + ", gia ban: " + giaban + ", nam phat hanh: " + namphathanh;
    }
}

