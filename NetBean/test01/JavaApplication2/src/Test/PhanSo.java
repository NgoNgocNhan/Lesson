package Test;
import java.io.*;
public class PhanSo {
    // Data
    int tuso;
    int mauso;
    //constructors   
    public PhanSo(){
        this.tuso=tuso;
        this.mauso=mauso;
    }
    //methods
    public PhanSo(int t, int m){
        tuso = t;
        mauso = m;
    }
    public PhanSo Cong(PhanSo ps){
        PhanSo pstong=new PhanSo();
        pstong.tuso=tuso*ps.mauso+mauso*ps.tuso;
        pstong.mauso=mauso*ps.mauso;
        pstong=pstong.Rutgon();
        return pstong;
    }
    public PhanSo Tru(PhanSo ps){
        PhanSo pstru=new PhanSo();
        pstru.tuso=tuso*ps.mauso-mauso*ps.tuso;
        pstru.mauso=mauso*ps.mauso;
        pstru=pstru.Rutgon();
        return pstru;
    }
    public int UCLN(int a,int b){
        while(a!=b){
            if(a>b)a-=b;
            else b-=a;
        }
        return a;
    }
    public PhanSo Rutgon(){
        int r= UCLN(tuso,mauso);
        tuso/=r;
        mauso/=r;
        return this;
    }
    public PhanSo Nhan(PhanSo ps){
        PhanSo psnhan=new PhanSo();
        psnhan.tuso=tuso*ps.tuso;
        psnhan.mauso=mauso*ps.mauso;
        psnhan=psnhan.Rutgon();
        return psnhan;
    }
    public PhanSo Chia(PhanSo ps){
        PhanSo pschia=new PhanSo();
        pschia.tuso=tuso*ps.mauso;
        pschia.mauso=mauso*ps.tuso;
        pschia=pschia.Rutgon();
        return pschia;
    }
    public void xuat(){
        System.out.println(tuso+"");
        System.out.println("-");
        System.out.println(""+mauso);
    }
    public static void main(String[] args) {
        PhanSo ps1=new PhanSo(5,8);
        PhanSo ps2=new PhanSo(3,5);
        //PhanSo pstong=ps1.Cong(ps2);
        //pstong.xuat();
        //PhanSo pstru=ps1.Tru(ps2);
        //pstru.xuat();
        PhanSo psnhan=ps1.Nhan(ps2);
        psnhan.xuat();
        System.out.println("");
        PhanSo pschia=ps1.Chia(ps2);
        pschia.xuat();
    }
}
