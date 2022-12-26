#include <stdio.h>
#include <math.h>

int main()
{
    int binH = 0, binL = 0, decH = 0, decL = 0, rem = 0, i = 0, dec = 0;
    float temp = 0;

    printf("Enter Binary Number Higher 8 bits: ");
    scanf("%d", &binH);

    while (binH != 0)
    {
        rem = binH % 10;
        decH = decH + (rem * pow(2, i));
        binH = binH / 10;
        i++;
    }

    decH = decH << 8;
    printf("Enter Binary Number Lower 8 bits: ");
    scanf("%d", &binL);
    i = 0;

    while (binL != 0)
    {
        rem = binL % 10;
        decL = decL + (rem * pow(2, i));
        binL = binL / 10;
        i++;
    }
    dec = decH + decL;

    dec = dec >> 2;

    dec = dec - 3072;

    temp = (float)dec / 10;

    printf("Temperature = %.1f", temp);
    return 0;
}