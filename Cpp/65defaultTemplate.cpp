#include <iostream>
using namespace std;

template<class T1 = int,class T2 = float,class T3 = char>
class Test{
    T1 a;
    T2 B;
    T3 C;

    public:
    Test(T1 x,T2 y,T3 z){
        a=x;
        B=y;
        C=z;
    }
    void display(){
        cout<<"The value of a is "<<a<<endl;
        cout<<"The value of b is "<<B<<endl;
        cout<<"The value of c is "<<C<<endl;
        cout<<endl;
    }
};


int main(){
    Test<> obj(8,5.3,'j'); //default constructor
    obj.display();
    Test<int,float,int> obj2(8,8.2,6);
    obj2.display();

    return 0;
}

