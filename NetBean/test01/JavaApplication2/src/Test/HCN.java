package test;
import java.io.*;
import java.util.*;
public class HCN {
    // data
    double chieudai;
    double chieurong;
    //methods
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai:");
        chieudai=sc.nextDouble();
        System.out.print("Nhap chieu rong:");
        chieurong=sc.nextDouble();
    }
    public void xuat(double x){
        System.out.println(x);
    }
    public double chuvi(){
        return (chieudai+chieurong)*2; 
    }
    public double dientich(){
        return chieudai*chieurong; 
    }
    public static void main(String[] args) {
        HCN Hcn= new HCN();
        Hcn.nhap();
        double cv= Hcn.chuvi();
        double dt= Hcn.dientich();
        Hcn.xuat(cv);
        Hcn.xuat(dt);
    }
}

