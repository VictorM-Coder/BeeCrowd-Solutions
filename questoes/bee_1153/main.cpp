#include <iostream>

using namespace std;


int fatorial(int num){
    if (num == 0)return 1;
    return num * fatorial(num-1);
}
int main() {
    int n;
    cin >> n;
    cout << fatorial(n) << endl;
    return 0;
}
