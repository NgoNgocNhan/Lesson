package test.Hinh;
import java.io.*;
import java.util.*;
import java.lang.Math;
public class Point2D {
    //data
    private double x;
    private double y;
    //constructors
    public Point2D(){  
    }
    public Point2D(float x,float y){  
        this.x=x;
        this.y=y;
    }
    //methods
    public void setx(double x){
            this.x=x;
    }
    public double getx(){
        return x;
    }
    public void sety(double y){
            this.y=y;
    }
    public double gety(){
        return y;
    }
    public void taoPoint(){
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap toa do x: ");
        x=sc.nextFloat();
        System.out.print("nhap toa do y: ");
        y=sc.nextFloat();
    }
    public void xemPoint(){
        System.out.println("toa do diem x la: "+(int)x);
        System.out.println("toa do diem y la: "+(int)y);
        System.out.println("");
    }
    public double doix(){
        Scanner sc= new Scanner(System.in);
        double m;
        System.out.print("nhap toa do x can doi: ");
        m=sc.nextDouble();
        x=m;
        return x;
    }
    public double doiy(){
        Scanner sc= new Scanner(System.in);
        double n;
        System.out.print("nhap toa do y can doi: ");
        n=sc.nextDouble();
        y=n;
        return y;
    }
    public double tinhKC2D(Point2D d1){
        double kc;
        kc=Math.sqrt((y-d1.y)*(y-d1.y)+(x-d1.x)*(x-d1.x));
        return kc;
    }
    public static void main(String[] args){
        Point2D d1 =new Point2D();
        Point2D d2 =new Point2D();
        d1.taoPoint();
        d2.taoPoint();
        System.out.println("toa do diem d1 la: ");
        d1.xemPoint();
        System.out.println("toa do diem d2 la: ");
        d2.xemPoint();
    }
}
