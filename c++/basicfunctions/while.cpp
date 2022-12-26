#include <iostream>

void whileloop()
{
    int i = 0;
    while (i < 5)
    {
        std::cout << i << "\n";
        i++;
    }
}
int main() {
    whileloop();
    return 0;
}