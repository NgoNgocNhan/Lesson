// Demo nhap,xuat files
// Doc 2 so nguyen tu file data.inp
// tinh tong hieu tich thuong va ghi ra file data.out
#include <iostream>
#include <fstream>
using namespace std;
int Fvitri(string str, char ch){
	for(int i=0; i<str.length(); i++){
		if(ch == str[i])
			return i;
	}
	return -1;
}
int main(){
	int key,vitri,vitrimoi;
	cin >> key;
	string banma;
	string banro;
	string alpha = " ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
	freopen("banmadv.inp","r",stdin);
	cin >> banma;
	freopen("banrodv.out","w",stdout);
	for(int i=0; i<banma.length(); i++){	
		vitri=	Fvitri(alpha,banma[i]);
		vitrimoi= (vitri+key);
		if(vitrimoi<0){
			vitrimoi=(vitrimoi)%26;
		}
		cout<<alpha[vitrimoi];	
	}
}
