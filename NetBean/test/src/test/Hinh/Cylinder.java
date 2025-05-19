package test.Hinh;
import java.io.*;
import java.util.*;
public class Cylinder extends Circle {
    // data
    private double height;
    //constructors
    public Cylinder(){
        height=1.0;
    }
    public Cylinder(double x,String y, double z){
        height=z;
    }
    //methods
    public void setheight(double x){
        height=x;
    }
    public double getradius(){
        return height;
    }
    public double changeheight(){
        Scanner sc= new Scanner(System.in);
        double m;
        System.out.println("nhap chieu cao can thay doi: ");
        m=sc.nextDouble();
        height=m;
        return height;
    }
    public void showcy(){
        show();
        System.out.println("chieu cao hinh tru la: " + height);
    }
    public double tinhdtxq2(){
        double x,y;
        y=tinhdtxq();
        x=y*height;
        return x;
    }
    public double tinhdttp2(){
        double x,y,z;
        y=tinhdtxq();
        z=tinhdttp();
        x=y*height+z;
        return x;
    }
    public double tinhtt(){
        double x,y;
        x=getArea();
        y=x*height;
        return y;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Cylinder c= new Cylinder();
        c.showcy();
        c.changeradius();
        c.changecolor();
        c.changeheight();
        c.showcy();
        //System.out.println("dien tich xung quanh: " + c.tinhdtxq2());
        //System.out.println("dien tich toan phan: " + c.tinhdttp2());
        System.out.println("the tich hinh tru la: "+c.tinhtt());
    }
}