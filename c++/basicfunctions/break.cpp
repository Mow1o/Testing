#include <iostream>
using namespace std;

void whileloop()
{
    for (int i = 0; i < 10; i++)
    {
        if (i == 4)
        {
            break;
        }
        cout << i << "\n";
    }
}
int main()
{
    whileloop();
    return 0;
}