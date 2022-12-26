#include <iostream>
using namespace std;

void whileloop()
{
    int i = 0;
    while(i<10){
        cout << i<< "\n";
        i++;
        if (i==4) {
            continue;
        }


    }
}
int main()
{
    whileloop();
    return 0;
}