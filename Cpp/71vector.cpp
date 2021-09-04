#include<iostream>
#include<vector>
using namespace std;

void display(vector <int> &v){
    for (int i = 0; i <v.size(); i++)
    {
       // cout<<v[i]<<" ";
        cout<<v.at(i)<<" ";  //same as above line
    }
    cout<<endl;
    
}

int main() {
    int element;
    vector<int> vec1;
    for (int i = 0; i <4; i++)
    {
    cout<<"enter an element to add to this vector"<<endl;
    cin>>element;
    vec1.push_back(element);
    }
    //vec1.pop_back;
    display(vec1);
    vector <int> :: iterator iter = vec1.begin();
    vec1.insert(iter+2,5,107);  //from 3rd position ,5 times insert 107
    display(vec1);
    
//    vector<char> vec2;
//    vec2.push_back('dd');
//    display(vec2);
//    vector<vec2> vec3;
   



    return 0;
}
