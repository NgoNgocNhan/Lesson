#include <iostream>
#include <fstream>
#include <math.h>
using namespace std;
int ISsonguyento(int a){
	int dem=0;
	for( int i=1;i<=a;i++){
		if(a%i==0){
			dem++;
		}
	}
	if (dem==2) return 0;
	else return -1;
}
int UCLN(int e,int n){
	if (e == 0 || n == 0){
        return e * n;
    }
    while (e != n){
        if (e > n){
            e -= n; // a = a - b
        }else{
            n -= e;
        }
    }
    return e; 
}
long dec (int e){
	long c,sum=0,i=1;
	do{
        c=e%2;
        sum=sum + (i*c);
        e=e/2;
        i=i*10;
    }while(e>0);
    return c;
}
int main(){
	int p,q,P;
	int banro[3];
	int N,n,e;
	double d;
	freopen("banrobatdoixung.inp","r",stdin);
	freopen("khoabatdoixung.out","w",stdout);
	cin >> p>> q;
	for (int i=0;i<3;i++){
		cin>>banro[i];
	}
	cin>>P;
	
	//cout<<p<<q;
	if (ISsonguyento(p)==-1 || ISsonguyento(q)==-1){
		cout<<"p va q ko phai so nguyen to"<<endl;
	}
	N=p*q;
	n=(p-1)*(q-1);
	for(e=2;e<n;e++){
		if(UCLN(e,n)==1)
		break;
	}
	for(int k=1;;k++){
		d=1.0*(n*k+1)/e;
		if (d==(int)d)
		break;
	}
	cout<<"Kp= (p, q, d)= ("<<p<<","<<q<<","<<(int)d<<")"<<endl;
	cout<<"Ks= (e, N)= ("<<e<<","<<N<< ")";
	int tm=1;
	for (int i=0;i<3;i++){

		tm=tm*tm;
		tm=tm%N;
		if(banro[i]==1){
			tm=tm*P;
		}
		tm=tm%N;
	}
	cout<<endl;
}
