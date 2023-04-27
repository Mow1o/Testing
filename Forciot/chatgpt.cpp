#include <iostream>
#include <vector>

using namespace std;

int removeOutliers(vector<int>& data, int max_change_rate) {
    int change_counter = 0;
    for (int i = 0; i < data.size(); i++) {
        if (abs(data[i] - data[i+1]) > max_change_rate) {
            data[i] = (data[i] + data[i+1]) / 2;
            change_counter++;
        }
    }
    return change_counter;
}

int main() {
    vector<int> data = {1,2,544,4};
    int max_change_rate = 3;
    int change_counter = removeOutliers(data, max_change_rate);
    cout << "Replaced " << change_counter << " outlier datapoints." << endl;
    cout << "New data vector: ";
    for (int i = 0; i < data.size(); i++) {
        cout << data[i];
    }}