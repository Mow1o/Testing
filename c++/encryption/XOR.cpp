/*****Please include following header files*****/
#include <cstring>
#include <string>
#include <iostream>
#include <typeinfo>
/***********************************************/

/*****Please use following namespaces*****/
using namespace std;
/*****************************************/

static string XORCipher(string data, string key) {
	int dataLen = data.size();
	int keyLen = key.size();
	string output = data;

	for (int i = 0; i < dataLen; ++i) {
		output[i] = data[i] ^ key[i % keyLen];
	}

	return output;
}

int main() {
    string text = "test data";
    string key = "secret";
    string cipherText = XORCipher(text, key);
    string plainText = XORCipher(cipherText, key);

    cout << "Encrypted: " << cipherText << endl;
    cout << "Decrypted: " << plainText << endl;

    return 0;
}
