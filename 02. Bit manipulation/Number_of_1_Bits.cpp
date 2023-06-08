// Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits 
//Number of 1 Bits
#include<iostream>
using namespace std;
int main(){

    int n = 001011;        
        int count =0;
        while(n!=0){
            
            if(n&1){
                count++;
            }
           n= n >> 1;
        }
        cout << count << endl;
        return count;
    }
