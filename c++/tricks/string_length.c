#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main()

{
    char name[100];
    for (int i = 0, scanf("%s", name); name[i] != '\0'; i++)
        ;
    printf("%d", i);
}