#include <iostream>
using namespace std;

int main() {
    int n;
    while (true){
        cin >> n;

        if (n == 0){
            break;
        }else {
            for (int i = 1; i <= n; ++i) {
                cout << i;
                if (i == n) cout << "\n";
                else cout << " ";
            }
        }
    }
    return 0;
}
