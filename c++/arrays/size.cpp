#include <iostream>
#include <fstream>
#include <string>
#include <array>
#include <vector>
#include <unordered_map>
using namespace std;
int main()
{
    class Solution
    {
    public:
        // here,we are finding and storing number at same time ,cuz if we dont then in case of :
        // nums=[3,2,4] target=6
        // if we would have stored nums[i] already in map and then started finding then answer would be [0,0] cuz , nums[0]=3 and target-nums[0]=nums[0];
        vector<int> twoSum(vector<int> &nums, int target)

        {

            unordered_map<int, int> mp;
            vector<int> res;
            
            for (int i = 0; i < nums.size(); i++)
            {
                if (mp.find(target - nums[i]) != mp.end())
                {
                    res.emplace_back(i);
                    res.emplace_back(mp[target - nums[i]]);
                    break;
                }
                mp[nums[i]] = i;
            }

            return res;
        }
    };
}
