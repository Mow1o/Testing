#include <iostream>
using namespace std;

void whileloop()
{
    string cars[5] = {"Volvo", "BMW", "Ford", "Mazda", "Tesla"};
    for (int i = 0; i < 5; i++)
    {
        cout << i << " = "<< cars[i] << "\n";
    }
}
int main()
{
    whileloop();
    return 0;
}