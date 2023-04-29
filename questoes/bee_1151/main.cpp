#include <iostream>
using namespace std;

int main() {
    int tot;
    cin >> tot;

    if (tot >= 1) cout << "0";
    if (tot >= 2) cout << " 1";
    if (tot >= 3) cout << " 1";
    if (tot >= 4){
        int pos1 = 1, pos2 = 1;
        while (tot > 3){
            int temp = pos2;
            pos2 += pos1;
            pos1 = temp;
            cout << " " << pos2;
            --tot;
        }
    }
    cout << endl;
    return 0;
}
