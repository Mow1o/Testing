#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main(void) {
ofstream MyFile("input.txt");
char text[11];
scanf("%10[0-9a-zA-Z ]", text);


MyFile << text;

MyFile.close();

}