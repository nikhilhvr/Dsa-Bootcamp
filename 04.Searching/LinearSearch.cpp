#include <iostream>
using namespace std;

bool search(int arr[], int size, int key)
{

    for (size_t i = 0; i < size; i++)
    {
        if (arr[i] == key)
        {
            return 1;
        }
    }
    return 0;
}

int main()
{

    int arr[10] = {-3, 2, 13, 31, 42, 42, 11, 49, 89,12};

    cout << "Enter the element to search for " << endl;

    int key;
    cin >> key;

    bool found = search(arr, 10, key);

    if (found)
    {
        cout << "Key is present" << endl;
    }
    else
    {
        cout << "Key is absent" << endl;
    }

    return 0;
}