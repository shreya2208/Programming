#include <iostream>
using namespace std;
#include<functional>
#include<algorithm>

int main() {
    
    int arr[] = {12,44,8,96,3,71};

    //sort(arr,arr+6);
    //sort(arr,arr+6, greater<int>());
    sort(arr,arr+1, plus<int>());
    for (int i = 0; i < 6; i++)
    {
        cout<<arr[i]<<" ";
    }
    
    

    return 0;
}