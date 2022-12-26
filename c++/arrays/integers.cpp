#include <iostream>
using namespace std;

void whileloop()
{
    int myNumbers[5] = {10, 20, 30, 40, 50};
    for (int i = 0; i < 5; i++)
    {
        cout << myNumbers[i] << "\n";
    }
}
int main()
{
    whileloop();
    return 0;
}