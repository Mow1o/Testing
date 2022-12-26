#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main(void) {
ofstream MyFile("input.txt");
char text[100];


cin.getline(text, 100);


MyFile << text;
MyFile.close();

}