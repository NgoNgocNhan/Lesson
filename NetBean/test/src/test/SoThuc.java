package test;
import java.io.*;
import java.util.*;
import java.lang.Math;
class SoThuc {
    //data
    float sothuc;
    //constructors
    SoThuc(){
        sothuc =1;
    }
    SoThuc(float f){
        sothuc = f;
    }
    //methods
    public void setsothuc(float x){
        sothuc=x;
    }
    public float setsothuc(){
        return sothuc;
    }
    public float cong(SoThuc x){
        SoThuc c = new SoThuc();
        c.sothuc = sothuc+ x.sothuc;
        return c.sothuc;
    }
    public float tru(SoThuc x){
        SoThuc t = new SoThuc();
        t.sothuc = sothuc- x.sothuc;
        return t.sothuc;
    }
    public float nhan(SoThuc x){
        SoThuc n = new SoThuc();
        n.sothuc = sothuc* x.sothuc;
        return n.sothuc;
    }
    public float chia(SoThuc x){
        SoThuc c = new SoThuc();
        c.sothuc = sothuc/ x.sothuc;
        return c.sothuc;
    }
    public float floor(){
        return (int)sothuc;
    }
    public double ceiling(){
        double c=Math.ceil(sothuc);
        return c;
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap so thuc: ");
        sothuc=sc.nextFloat();
    }
    public void xuat(){
        System.out.println("so thuc: "+sothuc);
    }
    public void thaydoi(){
        SoThuc c = new SoThuc();
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap so thuc can thay: ");
        c.sothuc=sc.nextFloat();
        sothuc=c.sothuc;
    }
    public static void main(String[] args) {
        SoThuc c =new SoThuc();
        SoThuc c1 =new SoThuc();
        c.nhap();
        //c1.nhap();
        //System.out.println("Ps sau khi cong: "+c.cong(c1));
        //c.xuat();
        //c.thaydoi();
        //c.xuat();
        System.out.println("Floor phanso: "+c.floor());
        System.out.println("Ceiling phanso: "+c.ceiling());
    }
}