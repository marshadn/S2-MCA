#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int num, flag = 0;
    cin >> num;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == num)
        {
            flag = 1;
            cout << num << " Is present in the array";
            break;
        }
    }

    if (flag == 0)
    {
        cout << num << " Is not present in the array";
    }
    return 0;
}