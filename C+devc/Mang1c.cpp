#include<iostream>
#include<time.h>
#include<cstdlib>
using namespace std;
void Nhapmang(int a[], int n){
	cout<<"Nhap mang: "<<endl;
	for(int i=0;i<n;i++){
			cout<<"Phan tu thu"<<i+1<<" ";
			cin>>a[i];
	}
}
void Nhapmangtudong(int a[], int n){
	srand((unsigned int)time(NULL));
	for(int i=0;i<n;i++){
		int x =rand()%1000;
		a[i]=x;
	}
}
void Xuatmang(int a[], int n){
	for(int i=0;i<n;i++){
		cout<<a[i]<<" ";
	}
	cout<<endl;
}
void Xoaphantuvitrik(int a[],int &n, int k){
	for(int i=k;i<n-1;i++){
		a[i]=a[i+1];
	}
	n--;
}
void Chenphantuvitrik(int a[],int &n,int k,int x){
	int i;
	n++;
	cout<<"Mang sau khi chen: ";
	for(i=n-1;i>=k;i--){
		a[i+1]=a[i];
	}
	a[k]=x;
	i++;
}
int Giatrivitrik(int a[],int n,int k){
	return a[k];
}
void Dichtrai(int a[],int n){
	int tam;
	for(int i=0;i<n-1;i++){
		a[i]=a[i+1];
	}
	a[n-1]=tam;
}
void Chuyenphantu(int a[],int &n,int k){
	for(int i=0;i<k;i++){
		Dichtrai(a,n);
	}
}
int main(){
	int n;
	cout<<"Nhap n: ";cin>>n;
	int a[n];
	Nhapmangtudong(a,n);
	cout<<"Mang la: ";Xuatmang(a,n);
	//cout<<"mang sau khi xoa pt vt k: ";Xoaphantuvitrik(a,n,1);
    //Xuatmang(a,n);
	//Chenphantuvitrik(a,n,1,4);
	//Xuatmang(a,n);
	//cout<<"Gia tri pt thu k la: "<<Giatrivitrik(a,n,1)<<endl;
	cout<<"Chuyen k phan tu tu vt dau ve cuoi: ";Chuyenphantu(a,n,2);
	Xuatmang(a,n);
	return 1;
}

