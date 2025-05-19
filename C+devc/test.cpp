#include<iostream>
#include<string>
using namespace std;
struct Sinhvien {
	int MSSV;
	char HoTenSV[50];
	float DTB;
};
void NhapDSSV(Sinhvien a[], int n){
	for(int i=0;i<n;i++){
		cout<<"Nhap sinh vien thu "<<i+1<<endl<<endl;
		cout<<"Hoten: ";
		cin.ignore();
		cin.get(a[i].HoTenSV,50);
		cout<<"MSSV: ";cin>>a[i].MSSV;
		cout<<"DTB: ";cin>>a[i].DTB;
		cout<<endl;
	}
}
void XuatDSSV(Sinhvien a[], int n){
	for(int i=0;i<n;i++){
		cout<<"Hoten: "<<a[i].HoTenSV<<endl;
		cout<<"MSSV: "<<a[i].MSSV<<endl;
		cout<<"DTB: "<<a[i].DTB<<endl;
		cout<<endl;
	}
}
void ThemSV_DAU(Sinhvien a[],int &n){
	Sinhvien sv;
	cout<<"Nhap sinh vien them vao dau: "<<endl;
	cout<<"Hoten: ";
	cin.ignore();
	cin.get(sv.HoTenSV,50);
	cout<<"MSSV: ";cin>>sv.MSSV;
	cout<<"DTB: ";cin>>sv.DTB;
	n++;
	for(int i=n-1;i>=0;i--){
		a[i+1]=a[i];
	}
	a[0]=sv;
}
void ThemSV_CUOI(Sinhvien a[],int &n){
	Sinhvien sv;
	cout<<"Nhap sinh vien them vao cuoi: "<<endl;
	cout<<"Hoten: ";
	cin.ignore();
	cin.get(sv.HoTenSV,50);
	cout<<"MSSV: ";cin>>sv.MSSV;
	cout<<"DTB: ";cin>>sv.DTB;
	n++;
	a[n]=sv;
}
void ThemSV_GIUA(Sinhvien a[],int &n,int x){
	Sinhvien sv;
	int i;
	cout<<"Nhap vi tri can them sinh vien vao: ";cin>>x;x=x-1; 
	cout<<"Nhap thong tin sinh vien them vao giua: "<<endl;
	cout<<"Hoten: ";
	cin.ignore();
	cin.get(sv.HoTenSV,50);
	cout<<"MSSV: ";cin>>sv.MSSV;
	cout<<"DTB: ";cin>>sv.DTB;
	n++;
	for(i=n-1;i>=x;i--){
		a[i+1]=a[i];
	}
	a[x]=sv;
	i++;
}
void XoaSV_DAU(Sinhvien a[],int &n){
	for(int i=0;i<n;i++){
		a[i]=a[i+1];
	}
	n--;
}
void XoaSV_CUOI(Sinhvien a[],int &n){
	n--;
}
void XoaSV_Giua(Sinhvien a[],int &n,int x){
	cout<<"Nhap vi tri can xoa: ";cin>>x;x=x-1; 
	for(int i=x; i < n-1; i++){
		a[i]=a[i+1];
	}
	n--;
}
int main(){
	int n;
	int x=0;
	cout<<"Nhap so luong sv: ";cin>>n;
	Sinhvien a[100];
	NhapDSSV(a,n);
	cout<<"DANH SACH SINH VIEN VUA NHAP: "<<endl;
	XuatDSSV(a,n);
	
	ThemSV_GIUA(a,n,x);
	XuatDSSV(a,n);
	/*
	cout<<"Danh sach sv sau khi xoa dau: "<<endl;XoaSV_DAU(a,n);
	XuatDSSV(a,n);
	cout<<"Danh sach sv sau khi xoa cuoi: "<<endl;XoaSV_CUOI(a,n);
	XuatDSSV(a,n);
	*/
	//cout<<"Danh sach sv sau khi xoa o x: "<<endl;XoaSV_Giua(a,n,x);
	//XuatDSSV(a,n);
	return 1;
}
