package test.Hinh;
import java.io.*;
import java.util.*;
import java.lang.Math;
public class Point3D extends Point2D{
    //data
    double z;
    //constructors
    public Point3D(){}
    public Point3D(double x,double y,double z){    
        this.z=z;
    }
    //methods
    public void setz(double z){
        this.z=z;
    }
    public double getz(){
        return z;
    }
    public void taoPoint3D(){
        Scanner sc= new Scanner(System.in);
        taoPoint();
        System.out.print("nhap toa do z: ");
        z=sc.nextFloat();
        System.out.println("");
    }
    public void xemPoint3D(){
        xemPoint();
        System.out.println("toa do diem z la: "+(int)z);
        System.out.println("");
    }
    public double doixyz(){
        doix();
        doiy();
        Scanner sc= new Scanner(System.in);
        double i;
        System.out.print("nhap toa do y can doi: ");
        i=sc.nextDouble();
        z=i;
        return z;
    }
    public double tinhKC2D3P(Point3D d1){
        double kc;
        kc=Math.sqrt((z-d1.z)*(z-d1.z))+tinhKC2D(d1);
        return kc;
    }
    public static void main(String[] args) {
        Point3D d1 = new Point3D();
        Point3D d2 = new Point3D();
        d1.taoPoint3D();
        d2.taoPoint3D();
        System.out.println("toa do diem d1 la: ");
        d1.xemPoint3D();
        System.out.println("toa do diem d2 la: ");
        d2.xemPoint3D();
        d1.doixyz();
        d1.xemPoint3D();
        System.out.print("khoang cach 2 diem la: " + d1.tinhKC2D3P(d2));
        
    }
}