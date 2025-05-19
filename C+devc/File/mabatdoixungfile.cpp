#include <iostream>
#include <fstream>
#include <math.h>
#include <string>
#include <bits/stdc++.h>
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
            e -= n; 
        }else{
            n -= e;
        }
    }
    return e; 
}
long long dec(int d) 
{
    long long b = 0;
    int p = 0;
    while (d > 0)
    {
        b += (d % 2) * pow(10, p);
        ++p;
        d/= 2;
    }
    return b;
}
string LongToString(long long_num)
{
    stack<char> stringStack;
    string signValue = "";
    if (long_num < 0) {
        signValue = "-";
        long_num = -long_num;
    }

    while (long_num > 0) {
        char convertedDigit = long_num % 10 + '0';
        stringStack.push(convertedDigit);
        long_num /= 10;
    }
 
    string long_to_string = "";

    while (!stringStack.empty()) {
        long_to_string += stringStack.top();
        stringStack.pop();
    }
    return signValue + long_to_string;
}
int main(){
	int p,q,P;
	int N,n,e;
	long long e1,d1;
	string e2,d2;
	double d;
	freopen("banromatmabatdoixung1.inp","r",stdin);
	freopen("khoamatmabatdoixung1.out","w",stdout);
	cin >> p>> q;
	cin>>P;
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
	d1=dec(d);
	e1=dec(e);
	e2=LongToString(e1);
	d2=LongToString(d1);
		int tm=1;
	for (int i=0;i<e2.length();i++){
		tm=tm*tm;
		tm=tm%N;
		if(e2[i]=='1'){
			tm=tm*P;
		}
		tm=tm%N;
	}
	cout<<endl<<"ban ma la: "<<tm;
}
