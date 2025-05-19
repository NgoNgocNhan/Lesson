#include<iostream>
#include<ctime>
#include<cstdlib>
using namespace std;
void Nhapmangtudong(int a[], int n) {
	srand(time(NULL));
	for (int i = 0;i < n;i++) {
		int x = rand() % 1000;
		a[i] = x;
	}
}
void Xuatmang(int a[], int n) {
	for (int i = 0;i < n;i++) {
		cout << a[i] << " ";
	}
	cout << endl;
}
void Interchangesort(int a[], int n) {
	for (int i = 0;i < n - 1;i++) {
		for (int j = i + 1;j < n;j++) {
			if (a[j] < a[i]) {
				int tam = a[j];
				a[j] = a[j - 1];
				a[j - 1] = tam;
			}
		}
	}
}
void Selectionsort(int a[], int n) {
	int vtmin, i, j;
	for (i = 0;i < n - 1;i++) {
		vtmin = i;
	}
	for (j = i + 1;i < n;j++) {
		if (a[j] < a[vtmin]) {
			vtmin = j;
		}
	}
	int tam = a[i];
	a[i] = a[vtmin];
	a[vtmin] = tam;
}
void Insertionsort(int a[], int n) {
	int x, pos;
	for (int i = 0;i < n;i++) {
		x = a[i];pos = i - 1;
	}
	while ((pos >= 0) && (a[pos] > x)) {
		a[pos + 1] = a[pos];
		pos--;
	}
	a[pos + 1] = x;
}
void Bublesort(int a[], int n) {
	for (int i = 0;i < n - 1;i++) {
		for (int j = n - 1;j > i;j--) {
			if (a[j] < a[j - 1]) {
				int tam = a[j];
				a[j] = a[j - 1];
				a[j - 1] = tam;
			}
		}
	}
}
void Quicksort(int a[], int l, int r) {
	int i, j, x;
	x = a[(l + r / 2)];
	i = l;
	j = r;
	do {
		while (i < x) i++;
		while (j > x) j--;
		if (i <= j) {
			int tam = a[j];
			a[j] = a[j - 1];
			a[j - 1] = tam;
			i++;
			j--;
		}
	} while (i < j);
	if (l < j)
		Quicksort(a, l, j);
	if (i > r)
		Quicksort(a, i, r);
}
int main() {
	int n, t;
	cout << "Nhap so phan tu cua mang: ";cin >> n;
	int a[999];
	Nhapmangtudong(a, n);
	Xuatmang(a, n);
}