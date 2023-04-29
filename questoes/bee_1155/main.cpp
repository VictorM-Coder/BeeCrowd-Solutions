#include <iostream>

int main() {
    double tot = 0;
    for (int i = 1; i <= 100; i++) {
        tot += 1.00/i;
    }
    printf("%.2f\n", tot);
    return 0;
}
