#include <stdio.h>

int sumofn(int n) {
    if (n == 0) {
        return 0;
    }
    return n + sumofn(n - 1);
}

int main()
{
    int num = 100;
    printf("%d\n", sumofn(num));

    return 0;
}