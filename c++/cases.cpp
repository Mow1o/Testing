#include <iostream>
#include <fstream>

using namespace std;

int main() {
ofstream MyFile("test.txt");

MyFile << "Test written!!!!text in this file!";

MyFile.close();

}