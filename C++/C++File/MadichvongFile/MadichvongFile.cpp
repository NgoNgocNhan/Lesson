#include <iostream>
#include <fstream>
using namespace std;
int Fvitri(string str, char ch) {
	for (int i = 0; i < str.length(); i++) {
		if (ch == str[i])
			return i;
	}
	return -1;
}
int main() {
	int key, vitri, vitrimoi;
	string banro;
	string alpha = " ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
	freopen("banro1.inp", "r", stdin);
	freopen("banma1.out", "w", stdout);
	cin >> key;
	cin >> banro;
	for (int i = 0; i < banro.length(); i++) {
		vitri = Fvitri(alpha, banro[i]);
		vitrimoi = (vitri + key) % 26;
		cout << alpha[vitrimoi];
	}
}