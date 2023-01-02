#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <map>
#include <algorithm>
using namespace std;

class Solution
{
public:
    int firstMissingPositive(vector<int> &nums)

    {

        sort(nums.begin(), nums.end());

        int k = nums[nums.size() - 1];
        if (k <= 0)
        {
            cout << "false";
            return 1;
        }
        int s, e, mid;
        bool found;
        for (int key = 1; key < k; key++)
        {
            s = 0, e = nums.size() - 1;
            found = 0;
            while (s <= e)
            {
                mid = s + (e - s) / 2;
                if (nums[mid] == key)
                {
                    found = 1;
                    cout << "found 1";
                    break;
                }
                else if (nums[mid] > key)
                {
                    e = mid - 1;
                }
                else
                {
                    s = mid + 1;
                }
            }
            if (!found)
            {
                cout << "negative";
                return key;
            }
        }
        cout << "asd";
        return k + 1;
    }
};

int main()
{
    Solution obje;


    int input;
    vector<int> V;
    cout << "Enter your numbers to be evaluated: " << endl;
    while ((cin >> input) && input != 9999)
    V.push_back(input);
    obje.firstMissingPositive(V);

    return 0;
}