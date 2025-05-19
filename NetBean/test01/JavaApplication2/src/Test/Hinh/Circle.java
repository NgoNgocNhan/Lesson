package Test.Hinh;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Circle {
    // data
    private double radius;
    private String color;
    // constructors
    public Circle(){
        radius=1.0;
        color="red";
    }
    public Circle(double m, String n){
        radius=m;
        color=n;
    }
    //methods
    public void setradius(double x){
        radius=x;
    }
    public double getradius(){
        return radius;
    }
    public void setcolor(String i){
        color=i;
    }
    public String getcolor(){
        return color;
    }
    public double changeradius(){
        Scanner sc= new Scanner(System.in);
        double m;
        System.out.println("nhap ban kinh can thay doi: ");
        m=sc.nextDouble();
        radius=m;
        return radius;
    }
    public String changecolor(){
        Scanner sc= new Scanner(System.in);
        String m;
        System.out.println("nhap mau can thay doi: ");
        m=sc.nextLine();
        color=m;
        return color;
    }
    public double getArea(){
        double a;
        a=(radius*radius)*3.14;
        return a;
    }
    public double getPerimeter(){
        double a;
        a=(radius*2)*3.14;
        return a;
    }
    public void show(){
        System.out.println("ban kinh hinh tron la: " + radius );
        System.out.println("Mau sac hinh tron la: " + color );
    }
    public double tinhdtxq(){
        double x;
        x=2*3.14*radius;
        return x;
    }
    public double tinhdttp(){
        double x;
        x=2*3.14*radius*radius;
        return x;
    }
    public static void main(String[] args) {
        Circle t = new Circle();
        t.show();
        System.out.println("dien tich hinh tron: "+t.getArea());
    }
}
