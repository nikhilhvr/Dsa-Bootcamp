#include <iostream>
using namespace std;

void reverse(int arr[], int n)
{

    int start = 0;
    int end = n - 1;

    while (start <= end)
    {
        swap(arr[start], arr[end]);
        start++;
        end--;
    }
}

void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << "  ";
    }

    cout << endl;
}

int main()
{

    int arrayOne[5] = {1, 2, 3, 4, 5};
    int arrayTwo[5] = {23, 32, 3, 44, 15};

    reverse(arrayOne, 5);
    reverse(arrayTwo, 5);

    printArray(arrayOne, 5);
    printArray(arrayTwo, 5);

    return 0;
}