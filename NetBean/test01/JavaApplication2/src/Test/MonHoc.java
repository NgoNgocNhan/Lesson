package Test;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class MonHoc {
    //Data
    String mamon;
    String tenmon;
    int sotinchi;
    String loai;
    double dtb;
    // Constructors
    public MonHoc() {
        mamon = mamon;
        tenmon = tenmon;
        sotinchi = sotinchi;
        loai = loai;
        dtb = dtb;
    }
    public MonHoc(String mm, String tm, int stc, String loai,double dtb){
        mamon = mm;
        tenmon = tm;
        sotinchi = stc;
        this.loai = loai;
        this.dtb = dtb;
    }
    //Methods
    public int tinhSoTiet(){//Quyuoc Lythuyet 2tc,Thuchanh 1tc
        int sotiet=0;
        if(loai != "ly thuyet"){
            sotiet=sotinchi*15;
        }
        else
            sotiet=sotinchi*30;
        return sotiet;
    }
    public String xeploai(){
        String Loai="Rot";
        if (dtb<5&&dtb>0)
            Loai="Rot";
        else {
        if(dtb>=5&&dtb<=10)
            Loai="Dat";
        }
        return Loai;       
    }
    public void xuat(){
        System.out.println("THONG TIN MON HOC");
        System.out.println("Ma Mon: "+mamon);
        System.out.println("Ten Mon: "+tenmon);
        System.out.println("So Tin Chi: "+sotinchi);
        System.out.println("Diem Trung Binh: "+dtb);
        System.out.println("Loai: "+loai);
        System.out.println("Sotiet = "+tinhSoTiet());
        System.out.println("Xep loai: = "+xeploai());
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP THONG TIN MON HOC: ");
        System.out.println("Nhap Loai: ");
        loai=sc.nextLine();
        System.out.println("Nhap Ma Mon ");
        mamon=sc.nextLine();
        System.out.println("Nhap Ten Mon ");
        tenmon=sc.nextLine();
        System.out.println("Nhap So Tin Chi ");
        sotinchi=sc.nextInt();
        System.out.println("Nhap Diem Trung Binh ");
        dtb=sc.nextDouble();
        
    }
    public static void main(String agrs[]){
        MonHoc mh = new MonHoc();
        System.out.println("");
        mh.nhap();
        mh.xuat();
        System.out.println("");
    }
}
