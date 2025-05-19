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
	int tmp,vitri,vitrimoi;
	string banro="            ";
	string banma="";
	int key[8];
	freopen("keymacv.inp","r",stdin);
		for(int i=0;i<8;i++){
			cin>>tmp>>key[i];
	}
	string alpha ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	freopen("banromacv.inp","r",stdin);
	cin>>banro;
	freopen("banamamacv.out","w",stdout);
		for(int i=0; i<banro.length(); i++){
		vitri= Fvitri(alpha,banro[i]);
		vitrimoi=((vitri+key[i%8]) % 26);
		banma+=alpha[vitrimoi]; 
	}
	cout<<banma;
}
