package test;
import java.io.*;
import java.util.*;
import java.time.LocalDate;
public class SinhVien {
    private String ho; 
    private String ten ;
    private int namsinh ;
    private int nam ;
    public void setho(String Ho){
        this.ho = Ho;
    }
    public String getho(){
        return ho;
    }
    public void setten(String ten){
        this.ten = ten;
    }
    public String getten(){
        return ten;
    }
    public void setnamsinh(int namsinh){
        if(namsinh>1990 && namsinh<2005)
            this.namsinh=namsinh;
        else System.out.println("Nam sinh khong hop le");
    }
    public int getnamsinh(){
        return namsinh;
    }
    public void setnam(int nam){
        if(nam>0 && nam<5){
            this.nam = nam;
        }
        else System.out.println("Nam khong hop le");
    }
    public int getnam(){
        return nam;
    }
    public  SinhVien() {}
    public  SinhVien(String h, String t, int ns,int n) {
        this.ho = h;
        this.ten = t;
        this.namsinh = ns;
        this.nam = n;
        if(namsinh>1990 && namsinh<2005)
            this.namsinh=namsinh;
        else System.out.println("Nam sinh khong hop le");
        if(nam>0 && nam<5){
            this.nam = nam;
        }
        else System.out.println("Nam khong hop le");
        
    }
    public int tinhtuoi(){
        int tuoi;
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        tuoi = year - namsinh;
        return tuoi;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho: ");
        ho=sc.nextLine();
        System.out.println("ten: ");
        ten=sc.nextLine();
        System.out.println("Nam sinh: ");
        namsinh = sc.nextInt();
        System.out.println("Nam: ");
        nam = sc.nextInt();
    }
    public void xuat(){
        System.out.println("Ho: "+ho); 
        System.out.println("Ten: "+ten);
        System.out.println("Nam sinh: "+namsinh);
        System.out.println("Nam: "+nam);
    }
    public static void main(String agrs[]){
        SinhVien sv = new SinhVien();
        sv.nhap();
        sv.xuat();
        System.out.println("Tuoi: "+sv.tinhtuoi());
    }
}