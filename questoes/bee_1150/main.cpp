#include <iostream>
using namespace std;

int main() {
    int x, z, soma, tot = 1;
    cin >> x;
    while (true){
        cin >> z;
        if (z > x)break;
    }
    soma = x;

    while(true){
        if (x <= z){
            x += ++soma;
            tot++;
        }else{
            break;
        }
    }
    cout << tot << endl;
    return 0;
}
