package Test;
import java.io.*;
import java.util.*;
public class GioPhutGiay {
    private int gio ;
    private int phut ;
    private int giay ;
    public void setgio(int h){
        if(h>=0 && h<=23)
            this.gio=h;
        else System.out.println("Gio khong hop le");
    }
    public int getgio(){
        return gio;
    }
    public void setphut(int m){
        if(m>=0 && m<=59)
            this.phut=m;
        else System.out.println("phut khong hop le");
    }
    public int getphut(){
        return phut;
    }
    public void setgiay(int s){
        if(s>=0 && s<=59)
            this.giay=s;
        else System.out.println("Giay khong hop le");
    }
    public int getgiay(){
        return giay;
    }
    public  GioPhutGiay() {}
    public  GioPhutGiay(int h, int m, int s) {
        this.gio = h;
        this.phut = m;
        this.giay = s;
        if(h>=0 && h<=23)
            this.gio=h;
        else System.out.println("Gio khong hop le");
        if(m>=0 && m<=59)
            this.phut=m;
        else System.out.println("phut khong hop le");
        if(s>=0 && s<=59)
            this.giay=s;
        else System.out.println("Giay khong hop le");
    }
    public int Doihram(){
        phut=gio*60;
        return phut;
    }
    public int Doimras(){
        giay=phut*60;
        return giay;
    }
    public GioPhutGiay tinhkctg(GioPhutGiay hsm){
        GioPhutGiay a=new GioPhutGiay();
        a.gio=gio-hsm.gio;
        a.phut=phut-hsm.phut;
        a.giay=giay-hsm.giay;
        return a;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gio: ");
        gio=sc.nextInt();
        System.out.println("Phan phut: ");
        phut=sc.nextInt();
        System.out.println("Nhap giay: ");
        giay=sc.nextInt();
    }
    public void xuat(){
        System.out.println("Gio: "+gio+":"+phut+":"+giay);
    }
    public int Doihras(){
        phut=gio*60;
        giay=phut*60;
        return giay;
    }
    public static void main(String[] args) {
        GioPhutGiay hms= new GioPhutGiay();
        hms.nhap();
        //GioPhutGiay hms1= new GioPhutGiay();
        //hms1.nhap();
        /*hms1.nhap();
        GioPhutGiay tinhkc = hms.tinhkctg(hms1);
        tinhkc.xuat();*/
        //hms.xuat();
        //GioPhutGiay tinhkc = hms.tinhkctg(hms1);
        //.xuat();
        hms.Doihras();
        System.out.println("doi gio: "+hms.giay);
    }
}
