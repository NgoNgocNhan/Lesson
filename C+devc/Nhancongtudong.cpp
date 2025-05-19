// khai bao thu vien
#include <iostream>
using namespace std;
// kieu du lieu tu dinh nghia
struct Nhancong{
	string Hoten;
	float Ngaycong;
	float Sosanpham; 
};
void Nhap(Nhancong a[3]){
	for(int i=0;i<3;i++){
		cout<<"Nhap ho ten: ";cin>>a[i].Hoten;
		cout<<"Nhap so ngay cong: ";cin>>a[i].Ngaycong;
		cout<<"Nhap so san pham da lam: ";cin>>a[i].Sosanpham;
		cout<<endl;
	}
}
float Tinhtongngaycong(Nhancong a[3]){
	float Tong;
	for(int i=0;i<3;i++){
		Tong=Tong+a[i].Ngaycong;
	}
	return Tong;
}
float Tinhtongsosanpham(Nhancong a[3]){
	float Tong;
	for(int i=0;i<3;i++){
		Tong=Tong+a[i].Sosanpham;
	}
	return Tong;
}
void Xuat(Nhancong a[3]){
	cout<<"Danh sach cong nhan: "<<endl;
	for(int i=0;i<3;i++){
		cout<<"Cong nhan thu "<<i+1<<endl;
		cout<<"Ho ten "<<a[i].Hoten<<endl;
		cout<<"So ngay cong: "<<a[i].Ngaycong<<endl;
		cout<<"So san pham da lam: "<<a[i].Sosanpham<<endl;
	}
	cout<<"Tong so ngay cong la: "<<Tinhtongngaycong(a)<<endl;
	cout<<"Tong so san pham la: "<<Tinhtongsosanpham(a);
}
int main(){
	Nhancong *a= new Nhancong[3];
	Nhap(a);
	Xuat(a);
	delete [] a;
	return 1;
}

