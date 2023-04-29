#include <iostream>
using namespace std;

int main() {
    int totIdade = 0;
    int qntEntradas = 0;

    while (true){
        int valor;
        cin >> valor;
        if (valor<0) break;
        totIdade += valor;
        ++qntEntradas;
    }
    printf("%.2f\n", totIdade/(qntEntradas*1.0f));
    return 0;
}
